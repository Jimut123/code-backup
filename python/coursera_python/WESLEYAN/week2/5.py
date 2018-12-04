import random

def problem2_5():
    lst = []
    random.seed(171)  # don't remove when you submit for grading
    """ Simulates rolling a die 10 times."""
    for i in range(10):
        # Setting the seed makes the random numbers always the same
        # This is to make the auto-grader's job easier.
        
        ran = random.randint(1,6)
        lst.append(ran)
        #print(lst)
    for item in lst:
        print(item)
    
    pass # replace this pass (a do-nothing) statement with your code
