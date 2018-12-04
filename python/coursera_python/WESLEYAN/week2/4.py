import random
import math
lst = []
def problem2_4():
    """ Make a list of 10 random reals between 30 and 35 """
    random.seed(70)
    for i in range(10):
        rand_g = random.random()*5
        random1 = rand_g + 30
        lst.append(random1)
        
        
    print(lst)
    pass # replace this pass (a do-nothing) statement with your code

