import math
big = 0
def collatz(num):
    global big
    while(num!=1):
        print(num)
        if num%2==0:
            num = num/2
        else:
            num = num * 3 + 1
        if (num > big):
            big = num
        #print(num)

# call the func
collatz(217)
