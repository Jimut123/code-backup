import os
import requests
from time import time as timer
from multiprocessing.pool import ThreadPool
start = timer()
list_get = []

for item in range(100000):
    list_get.append(item)

#print(list_get)

print("GOT ITEMS")
def get_res(entry):
    #print(entry)
    return entry

l = ThreadPool(1000).imap_unordered(get_res, list_get)
for item in l:
    print(l)

print(f"Elapsed Time: {timer() - start}")
