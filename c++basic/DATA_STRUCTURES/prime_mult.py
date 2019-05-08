from multiprocessing.pool import ThreadPool
import datetime
import numpy as np
import math

def __is_divisible__(a,b):
    if a%b == 0:
        return 1
    return 0

def isPrime_n(a):
    #is prime noob
    k=0
    for i in range(2,a-1):
        if __is_divisible__(a,i) == 1:
            k=1
            break
    if k==0:
        return 1
    else:
        return 0

def isPrime_g(a):
    #is prime good
    k=0
    for i in range(2,int(a/2)+1):
        if __is_divisible__(a,i) == 1:
            k=1
            break
    if k==0:
        return 1
    else:
        return 0

def isPrime_b(a):
    # is prime best
    k=0
    for i in range(2,int(math.sqrt(a)+1)):
        if __is_divisible__(a,i) == 1:
            k=1
            break
    if k==0:
        return 1
    else:
        return 0

IS_PRIME = True
class mult_prime:
    global IS_PRIME
    def __is_divisible__(self,a,b):
        if a%b == 0:
            IS_PRIME = False


def method_prime(method_tr):
    et = datetime.datetime.now()
    for i in np.arange(100):
        k = method_tr(i) and i
        if k > 0:
            print(k,end=" ")
    print("\nMicro-Seconds : ",(et-datetime.datetime.now()).microseconds)

def multi_prime(a):
    arr = np.arange(2,int(math.sqrt(a)+1))
    #print(arr)
    ThreadPool(30).imap_unordered(mult_prime.__is_divisible__,a,arr)
    global IS_PRIME
    if IS_PRIME == True:
        print(a)

if __name__ == "__main__":
    #print(__is_divisible__(5,2))
    print("noob:",end="")
    method_prime(isPrime_n)
    print("good:",end="")
    method_prime(isPrime_g)
    print("best:",end="")
    method_prime(isPrime_b)
    print()
    #multi_prime(10)
    pass