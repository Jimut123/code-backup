from multiprocessing import Process
a = 0
b = 0
def loop_a():
    global a
    while 1:
        print("{} = {}".format("a",a))
        a += 1
    
def loop_b():
    global b
    while 1:
        print("{} = {}".format("b",b))
        b += 1
    
if __name__ == '__main__':
    Process(target=loop_a).start()
    Process(target=loop_b).start()