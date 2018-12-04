import math
def ret_area(n,s):
    #PI_BY_N = math.pi/n
    return (n*s**2)/(4*math.tan(math.pi/n))
print(ret_area(7,3))
