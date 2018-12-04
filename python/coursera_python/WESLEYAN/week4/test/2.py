import random

def make_same_random():
    """ Make a list of 10 random integers that are the same each time """
    numlis = []
    random.seed(17)        # set the seed from which random numbers are made
    for i in range(0,10):
        d = random.random()
        print(d)
        numlis.append(d)
    return numlis
    
def call_make_random():
    """ Uses make_same_random to get a list of random numbers """
    random_integers = make_same_random()
    #print(random_integers)
    #random_integers1 = make_same_random()
    #print(random_integers1)

call_make_random()

 
