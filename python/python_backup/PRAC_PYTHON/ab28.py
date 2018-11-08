# input a string and print nos.of vowels,words,consonent,spaces
s=input("enter string:")
w=1
v=0
c=0
sp=0
for i in range(0,len(s),1):
      if s[i]=='A'or s[i]=='a'or s[i]=='E' or s[i]=='e' or s[i]=='I' or s[i]=='i' or s[i]=='O'or s[i]=='o' or s[i]=='U' or s[i]=='u':
         v=v+1
      else:
        if s[i]==' ':
            w=w+1
            sp=sp+1
        else:
          if s[i]!='A'and  s[i]!='a' and  s[i]!='E' and s[i]!='e' and s[i]!='I' and s[i]!='i' and s[i]!='O'and s[i]!='o' and s[i]!='U' and  s[i]!='u':
              c=c+1 
print"Total vowel:",v
print"Total word:",w
print"Total consonent:",c
print"Total spaces:",sp        
    

 
