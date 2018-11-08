# input a string and print each word reverse order
s=input("enter string:")
w=""
s=s+" "
for i in range(0,len(s),1):
      if s[i]==' ':
         for j in range(len(w)-1, -1,-1):
                 print w[j]," ",
         w=""
      else:
            w=w+s[i]

 
