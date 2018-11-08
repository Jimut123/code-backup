#declair list
a=[10,10.7,"abc"]
#print list
print a
#print list from index 1
print a[1:]
#print list from index 0
print a[0:]
#print list from index 0-1
print a[0:1]
#print list from index 0-2
print a[0:2]
#update  index 2
a[2]="bbc"
print a
#print negative count from right
print a[0:-1]
print a[:-1]
print a[1:-1]
print a[:-2]
#add 2 list
a=a+[12,13,"ccc"]
print a
#print list with another
print a+[15,17,19,"eee"]
#repeat of list 2 times
print a*2
#checking membership of a value
print 13 in a
print 19 in a
#iteration in list
for i in a:
     print i
#length of list
print len(a)
#maximum of list
print"Maximum:",max(a)
#minimum of list
print"minimum:", min(a)
b=[20,34,"mmm"];
#compairing 2 lists
print"When b is less than a", cmp(a,b)
print "When a is greater than b",cmp(b,a)
#initialize a into c
c=a
print"When a=c",cmp(a,c)
#append object into list
a.append(29)
print a
#count object into list
print a.count(10)
#appends the content of sequence into list
a.extend(b)
print a
#returns the lowest index
print a.index(10)
#insert objext at specified index
for i in range(5,7,1):
        k=input("Enter value")
        a.insert(i,k)
for i in a:
      print i
print a
#removes and returns last object from list
a.pop()
print a
#remove object from list
a.remove(10)
print a
a.insert(0,10)
#reverse the list
a.reverse()
print a
#sort the list
a.sort()
print a
#touple operstion
#declairation of touple
a1=(50,"tt",9.66)
print a1
#addition of 2 touple
a1=a1+(88,99.3,"mcq")
print a1
# length of touple
print len(a1)
#repeatation of touple
a1=a1*2
print a1
#iteration in touple
for i in a1:
      print i
print 99 in a1
#slicing 
print a1[2]
print a1[-3]
print a1[3:]
#compair 2 touples
b1=(67,88,"ppp")
print"between a1,b1 a1>b1 for 1,b1>a1 for -1 a1=b1 for 0",cmp(a1,b1)
#maximum in touple
print max(a1)
#minimum in touple
print min(b1)
#convert list into touple
c1=tuple(a)
print c1
#convert touple into list
d=list(a1)
print d
del b1
print "Exception shows while tuple b1 is deleted",b1









