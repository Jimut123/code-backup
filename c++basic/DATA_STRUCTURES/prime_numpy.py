# import numpy as np
# import math
import datetime
# et = datetime.datetime.now()
# def is_prime(n):
#     if n % 2 == 0 and n > 2: 
#         return False
#     return all(n % i for i in range(3, int(math.sqrt(n)) + 1, 2))

# a = np.arange(1, 10**2)
# foo = np.vectorize(is_prime)
# pbools = foo(a)
# primes = np.extract(pbools, a)
# print(primes)  # => Output below
# print("\nMicro-Seconds : ",(et-datetime.datetime.now()).microseconds)

import threading, doctest, cProfile, time, random
result = [2]
counter = 1

def get_int(num):
    for i in range(3, num):
        yield i

def is_prime(num):
    for j in range(2,int(num)):
        if (num % j) == 0:
            return False
    result.append(num)
    return True 

def prime_calculator(nth):
    lock = threading.Lock()
    global result, counter, integer
    while counter < (nth):
        if is_prime(next(integer)):
            lock.acquire()
            try:
                counter += 1
            finally:
                lock.release()
        time.sleep(random.random()/1000)

def prime(nth):
    """Returns the nth prime number
    >>> prime(1)
    2
    >>> prime(2)
    3
    >>> prime(4)
    7
    >>> prime(1000)
    7919
    """   
    global integer, counter, result
    integer = get_int(99999999)
    threads = [threading.Thread(daemon=True, target=prime_calculator, args=(nth,)) for i in range(100)]
    [thread.start() for thread in threads]
    [thread.join() for thread in threads]
    counter = 1
    return result[-1]

if __name__ == "__main__":
    et = datetime.datetime.now()
    doctest.testmod()
    cProfile.run('print(prime(100))')
    print("\nMicro-Seconds : ",(et-datetime.datetime.now()).microseconds)