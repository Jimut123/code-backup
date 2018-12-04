import random

def problem2_6():
    lst = []
    """ Simulates rolling 2 dice 100 times """
    # Setting the seed makes the random numbers always the same
    # This is to make the auto-grader's job easier.
    random.seed(431)  # don't remove when you submit for grading
    #pass # replace this pass (a do-nothing) statement with your code
    for i in range(100):
        # Setting the seed makes the random numbers always the same
        # This is to make the auto-grader's job easier.
        
        ran1 = random.randint(1,6)
        ran2 = random.randint(1,6)
        ran = ran1 + ran2
        lst.append(ran)
        #print(lst)
    for item in lst:
        print(item)
    
    pass # replace this pass (a do-nothing) statement with your code

    
