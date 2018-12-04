def is_valid_word(wordlist, word):
    """ (list of str, str) -> bool
    Return True if and only if word is an element of wordlist.
    >>> is_valid_word(['ANT', 'BOX', 'SOB', 'TO'], 'TO')
    True
    """
    return word in wordlist


def make_str_from_row(board, row_index):
    """ (list of list of str, int) -> str
    Return the characters from the row of the board with index row_index
    as a single string.
    >>> make_str_from_row([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 0)
    'ANTT'
    """
    tempL = []
    for chs in board:
        tempS = ''
        for ch in chs:
            tempS += ch
        tempL.append(tempS)
    return tempL[row_index]


def make_str_from_column(board, column_index):
    """ (list of list of str, int) -> str
    Return the characters from the column of the board with index column_index
    as a single string.
    >>> make_str_from_column([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 1)
    'NS'
    """
    tempS = ''
    for chs in board:
        tempS += chs[column_index]
    return tempS


def board_contains_word_in_row(board, word):
    """ (list of list of str, str) -> bool
    Return True if and only if one or more of the rows of the board contains
    word.
    Precondition: board has at least one row and one column, and word is a
    valid word.
    >>> board_contains_word_in_row([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 'SOB')
    True
    """
    for row_index in range(len(board)):
        if word in make_str_from_row(board, row_index):
            return True
    return False


def board_contains_word_in_column(board, word):
    """ (list of list of str, str) -> bool
    Return True if and only if one or more of the columns of the board
    contains word.
    Precondition: board has at least one row and one column, and word is a
    valid word.
    >>> board_contains_word_in_column([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 'NO')
    False
    """
    for column_index in range(len(board[0])):
        if word in make_str_from_column(board, column_index):
            return True
    return False


def board_contains_word(board, word):
    """ (list of list of str, str) -> bool
    Return True if and only if word appears in board.
    Precondition: board has at least one row and one column.
    >>> board_contains_word([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 'ANT')
    True
    """
    if board_contains_word_in_column(board, word):
        return True
    elif board_contains_word_in_row(board, word):
        return True
    else:
        return False


def word_score(word):
    """ (str) -> int
    Return the point value the word earns.
    Word length: < 3: 0 points
                 3-6: 1 point per character for all characters in word
                 7-9: 2 points per character for all characters in word
                 10+: 3 points per character for all characters in word
    >>> word_score('DRUDGERY')
    16
    """
    L = len(word)
    score = 0
    if L >= 10:
        score = L * 3
    elif 7 <= L and L <= 9:
        score = L * 2
    elif L >=3 and L <= 6:
        score = L * 1
    else:
        score = 0
    return score


def update_score(player_info, word):
    """ ([str, int] list, str) -> NoneType
    player_info is a list with the player's name and score. Update player_info
    by adding the point value word earns to the player's score.
    >>> update_score(['Jonathan', 4], 'ANT')
    """
    score = word_score(word)
    player_info[1] += score


def num_words_on_board(board, words):
    """ (list of list of str, list of str) -> int
    Return how many words appear on board.
    >>> num_words_on_board([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], ['ANT', 'BOX', 'SOB', 'TO'])
    3
    """
    count = 0
    for word in words:
        if board_contains_word(board, word):
            count += 1
    return count


def read_words(words_file):
    """ (file open for reading) -> list of str
    Return a list of all words (with newlines removed) from open file
    words_file.
    Precondition: Each line of the file contains a word in uppercase characters
    from the standard English alphabet.
    """
    res = []
    for line in words_file:
        res.append(line.strip())
    return res
        


def read_board(board_file):
    """ (file open for reading) -> list of list of str
    Return a board read from open file board_file. The board file will contain
    one row of the board per line. Newlines are not included in the board.
    """
    res = []
    for line in board_file:
        res.append(list(line.strip()))
    return res
