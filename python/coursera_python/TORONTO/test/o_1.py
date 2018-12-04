def shift_right(L):
    ''' (list) -> NoneType
    Shift each item in L one position to the rightand shift the    last item to the first position.
    Precondition: len(L) >= 1
    '''
    last_item = L[-1]
    # MISSING CODE GOES HERE
    for i in range(1, len(L)):
      L[len(L) - i] = L[len(L) - i - 1]
    L[0] = last_item
    print(L)

def make_pairs(list1, list2):
    pairs = []
    for i in range(len(list1)):
        inner_list = []
        inner_list.append(list1[i])
        inner_list.append(list2[i])
        pairs.append(inner_list)
    print(pairs)


def contains(value, lst):
    found = False
    for i in range(len(lst)):
        for j in range(len(lst[i])):
            if lst[i][j] == value:
                found = True
    return found

def make_pairs(list1, list2):
    pairs = []
    for i in range(len(list1)):
        pairs.append([list1[i], list2[i]])
    print(pairs)

def make_pairs(list1, list2):
    pairs = []
    for i in range(len(list1)):
        inner_list = []
        inner_list.append(list1[i])
        inner_list.append(list2[i])
    pairs.append(inner_list)
    print(pairs)



def contains(value, lst):
    found = False
    for i in range(len(lst)):
        for j in range(len(lst[i])):
            found = (lst[i][j] == value)
    return found



def contains(value, lst):
    found = False
    for sublist in lst:
        if value in sublist:
            found = True
    return found




def eat(d):
    '''(dict of {str: int}) -> bool
    Each key in d is a fruit and each value is the quantity of     that fruit.
    REST OF DESCRIPTION MISSING HERE
    >>> eat({'apple': 2, 'banana': 3, 'pear': 3, 'peach': 1})
    True
    >>> eat({'apple': 0, 'banana': 0})
    False
    '''
    ate = False
    for fruit in d:
        if d[fruit] > 0:
            d[fruit] = d[fruit] - 1
            ate = True
    return ate




def contains(v, d):
    found = False
    for k in d:
        for i in range(len(d[k])):
            found = (d[k][i] == v)
    return found



def contains(v, d):
    found = False
    for k in d:
        if v in d[k]:
            found = True
    return found




def same_length(L1, L2):
    '''(list, list) -> bool
    Return True if and only if L1 and L2 contain the same number of elements.
    '''
    if len(L1) == len(L2):
       return True
    else:
       return False

def same_length(L1, L2):
    '''(list, list) -> bool
    Return True if and only if L1 and L2 contain the same number of elements.
    '''
    return len(L1)==len(L2)


def get_keys(L, d):
    '''(list, dict) -> list
    Return a new list containing all the items in L that are keys in d.
    >>> get_keys([1, 2, 'a'], {'a': 3, 1: 2, 4: 'w'})
    [1, 'a']
    '''
    result = []
    for k in L: # CODE MISSING HERE
       if k in d:
          result.append(k)
    return result

def count_values_that_are_keys(d):
    '''(dict) -> int
    Return the number of values in d that are also keys in d.
    >>> count_values_that_are_keys({1: 2, 2: 3, 3: 3})
    3
    >>> count_values_that_are_keys({1: 1})
    1
    >>> count_values_that_are_keys({1: 2, 2: 3, 3: 0})
    2
    >>> count_values_that_are_keys({1: 2})
    0
    '''
    result = 0
    for k in d:
        if d[k] in d:# CODE MISSING HERE
             result = result + 1
    return result



def get_diagonal_and_non_diagonal(L):
    '''(list of list of int) -> tuple of (list of int, list of int)
    Return a tuple where the first item is a list of the values on the
    diagonal of square nested list L and the second item is a list of the rest
    of the values in L.
    >>> get_diagonal_and_non_diagonal([[1,  3,  5], [2,  4,  5], [4,  0,  8]])
    ([1, 4, 8], [3, 5, 2, 5, 4, 0])
    '''
    diagonal = []
    non_diagonal = []
    for row in range(len(L)):
        for col in range(len(L)):
            # CODE MISSING HERE
            if row == col:
                diagonal.append(L[row][col])
            else:
                non_diagonal.append(L[row][col])
    return (diagonal, non_diagonal)





def add_to_letter_counts(d, s):
    '''(dict of {str: int}, str) -> NoneType
    d is a dictionary where the keys are single-letter strings and the values
    are counts.
    For each letter in s, add to that letter's count in d.
    Precondition: all the letters in s are keys in d.
    >>> letter_counts = {'i': 0, 'r': 5, 'e': 1}
    >>> add_to_letter_counts(letter_counts, 'eerie')
    >>> letter_counts
    {'i': 1, 'r': 6, 'e': 4}
    '''
    for c in s:
        # CODE MISSING HERE
        if c in d:
            d[c]=d[c]+1
    return d

def count_max_letters(s1, s2, letter):
    '''(str, str, str) -> int 
    s1 and s2 are strings, and letter is a string of length 1.     Count how manytimes letter appears in s1 and in s2, and ret    urn the bigger of the twocounts.
    >>> count_max_letters('hello', 'world', 'l')
    2
    >>> count_max_letters('cat', 'abracadabra', 'a')
    5
    '''
    return max(s1.count(letter),s2.count(letter))# CODE MISSING HERE



def reverse(s):
    '''(str) -> str
    Return the reverse of s.
    >>> reverse('abc')
    'cba'
    >>> reverse('a')
    'a'
    >>> reverse('madam')
    'madam'
    >>> reverse('1234!')
    '!4321'
    '''
    result = ''
    i = len(s) - 1
    while i >= 0:
        result = result + s[i]
        i = i - 1 # CODE MISSING HERE
    return result

def get_keys(L, d):
    '''(list, dict) -> list
    Return a new list containing all the items in L that are keys in d.
    >>> get_keys([1, 2, 'a'], {'a': 3, 1: 2, 4: 'w'})
    ['a', 1]
    '''
    result = []
    for k in d:# CODE MISSING HERE
        if k in L:
            result.append(k)
    return result










