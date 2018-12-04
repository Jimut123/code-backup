import random
import math
lst = []
def problem2_4():
    """ Make a list of 10 random reals between 30 and 35 """
    random.seed(70)
    rand_g = random.random()*5
    rand_f = rand_g + 1
    rand = math.floor(rand_f)
    random1 = rand + 30
    lst.append(random1)
    print(lst)
    pass # replace this pass (a do-nothing) statement with your code

