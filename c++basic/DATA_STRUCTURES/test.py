import threading
import time
import queue
num_list=[i for i in range(500)]
prime_list=[]
listo=[]
#if you take a look at processing time,you will see that threading takes more time than normal calculation, it is because of time to be needed to 
#create threads.Threading OS dependent and time taking process and in simple calculations like this one is not a good example to show threading.
#so,I have added time sleep to check_prime function to show efficiency of threading.Try it with and without time sleep.
def check_prime(num):
     #try it with and without time sleep
     time.sleep(0.1)
     if num in [0,1]:
          pass
     else:
          x=0
          for j in range(2,num):
               
               if num%j==0:
                    x+=1
                    if x>0:return False
          return True
#finding prime numbers without threading
start=time.time()
for i in num_list:
     
     if check_prime(i) is True:listo.append(i)
print(listo)
print(start-time.time())
#finding prime numbers using threading
def threader():
     while True:# we are going to repeat same process as long as we have a number in the queue
          value=q.get()  #firstly we are getting a value from the queue
          result=check_prime(value)
          if result is True:prime_list.append(value)
          q.task_done()
          
# we are creating a queue to put numbers to be checked
q=queue.Queue()
start_time=time.time()
for x in range(30):
     t=threading.Thread(target=threader)
     #t.deamon=True
     t.start()
# we are placing values in num_list to queue
for value in num_list:
     q.put(value)
q.join()

print(prime_list)
print(start_time-time.time())