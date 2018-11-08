#array touple
first=(1,2,3);
second=(2,3,4);
print first
print second
print"Maximum of first touple:", max(first);
print"Miniimum of second touple:", min(second);
print "Touple in 3 times:",first*3;
print "check the value 1 present in first touple:", 1 in first;
print "check the value 4 present in second touple:", 4 in second;
print "check the value 5 present in second touple:", 5 in second;
third=((1,2,3),"India",3.5);
print third
#addition of touple
fourth=first+second+third;
print fourth;
print "1st 2 values of touple first",first[0:2];
print "1st 2 values of touple third",third[0][0:2];
print "1st 2 characters of touple third",third[1][0:2];
print " values of touple first with -1 index",first[-1];
print " values of touple second with -3 index",second[-3];
print " values of touple second with -2 index",second[-2];
print "whole  values of touple first with no index",first[:];
print "whole  values of touple first when index is 8 ",first[:8];
print "whole  values of touple first when index is upto -1 ",first[:-1];
print "whole  values of touple first when index is upto -2 ",first[:-2];
print "whole  values of touple first when index is upto -3 ",first[:-3];
print "whole  values of touple first when index  starts from 0 ",first[0:];
#input procedure in touple
#declairation of empty touple
a=();
#convert touple into list
b=list(a);
#input into list
for i in range(0,5,1):
     k=input("data:")
     b.insert(i,k)
#convert list again in to touple
a=tuple(b);
#print the touple
for i in a:
    print i









     

