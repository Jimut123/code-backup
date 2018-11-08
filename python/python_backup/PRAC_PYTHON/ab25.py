# input a name and print abbriviation
s=input("enter string:")
w=""
for i in range(0,len(s),1):
      if s[i]==' ':
          print w[0],".",
          w=""
      else:
          w=w+s[i]
print w   
