# input a string a check palindrom or not,using while loop
s=input("enter string:")
i=0
f=0
j=len(s)-1
while i<len(s)/2 :
      if s[i]!=s[j]:
         f=1
         break
      i=i+1
      j=j-1 
if f==0:
    print"Palindrom:"
else :
    print"Non Palindrom:"