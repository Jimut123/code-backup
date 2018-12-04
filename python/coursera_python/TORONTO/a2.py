def get_length(dna):
    """ (str) -> int
    
    Return the length of the DNA sequence dna.
    
    >>> get_length('ATCGAT')
    6
    >>> get_length('ATCG')
    4
    """
    return len(dna)

def is_longer(dna1, dna2):
    """ (str, str) -> bool
    
    Return True if and only if DNA sequence dna1 is longer than DNA sequence
    dna2.
    
    >>> is_longer('ATCG', 'AT')
    True
    >>> is_longer('ATCG', 'ATCGGA')
    False
    """
    if get_length(dna1) > get_length(dna2):
        return True
    else:
        return False

def count_nucleotides(dna, nucleotide):
    """ (str, str) -> int
    
    Return the number of occurrences of nucleotide in the DNA sequence dna.
    
    >>> count_nucleotides('ATCGGC', 'G')
    2
    >>> count_nucleotides('ATCTA', 'G')
    0
    """
    return dna.count(nucleotide)

def contains_sequence(dna1, dna2):
    """ (str, str) -> bool
    
    Return True if and only if DNA sequence dna2 occurs in the DNA sequence
    dna1.
    
    >>> contains_sequence('ATCGGC', 'GG')
    True
    >>> contains_sequence('ATCGGC', 'GT')
    False
    
    """
    if dna2 in dna1:
        return True
    else:
        return False


def is_valid_sequence(seq):
    ls = ['A','C','T','G']
    dummy = 0
    #count = 0
    for j in seq:
        if j in ls:
            dummy = 0
        else:
            dummy = 1
            break
    if dummy == 1:
        return False
    else:
        return True


def insert_sequence(str1,str2,n):
    st1 = str1[0:n]
    st2 = str1[n:len(str1)]
    fstr = st1+str2+st2
    return fstr

def get_complimentary_sequence(str1):
    str2 = ''.join(reversed(str1))
    return str2
    
def get_compliment(st1)
    if st1.equals('A'):
        return 'T'
    if st1.equals('C'):
        return 'G'
    if st1.equals('T'):
        return 'A'
    if st1.equals('G'):
        return 'C'








