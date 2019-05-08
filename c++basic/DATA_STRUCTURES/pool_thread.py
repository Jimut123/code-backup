from multiprocessing import Pool
import datetime
et = datetime.datetime.now()
# def f(x):
#     return x*x

# if __name__ == '__main__':
#     p = Pool(5)
#     print(p.map(f, [1, 2, 3]))

#from __future__ import print_function

# from multiprocessing import Process
# import os

# def info(title):
#     print (title)
#     print ('module name:', __name__)
#     if hasattr(os, 'getppid'):  # only available on Unix
#         print ('parent process:', os.getppid())
#     print ('process id:', os.getpid())

# def f(name):
#     info('function f')
#     print ('hello', name)

# if __name__ == '__main__':
#     info('main line')
#     p = Process(target=f, args=('bob',))
#     p.start()
#     p.join()

# from multiprocessing import Process, Queue

# def f(q):
#     q.put([42, None, 'hello'])

# if __name__ == '__main__':
#     q = Queue()
#     p = Process(target=f, args=(q,))
#     p.start()
#     print (q.get())    # prints "[42, None, 'hello']"
#     p.join()

# from multiprocessing import Process, Lock


# def f(l, i):
#     global K,LOCK
#     l.acquire()
#     K = K+i
#     print(K)
#     l.release()

# if __name__ == '__main__':
#     global K
#     K = 0
#     lock = Lock()
#     LOCK = 1
#     for num in range(3):
#         Process(target=f, args=(lock, num)).start()
#     print("K = ",K)
#     print("\nMicro-Seconds : ",(et-datetime.datetime.now()).microseconds)
#     print("K = ",K)

