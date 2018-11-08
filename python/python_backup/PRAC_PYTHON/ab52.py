#files in python text file read & write mode
#writing into file
f=open("py1.txt","w")
f.write("hello my first \n")
f.write("file in python \n")
s=input("enter line:")
f.write(s);
f.write(" \n");
f.close()
#reading from file
f=open("py1.txt","r")
print f.read()
f.close()
#reading using readline() from file
f=open("py1.txt","r")
print f.readline()
f.close()
#reading using readlines() from file
f=open("py1.txt","r")
print f.readlines()
f.close()
#reading n nos of char from file
n=input("enter nos. of characters to pick:")
f=open("py1.txt","r")
print f.read(n)
f.close()
#looping from file
f=open("py1.txt","r")
for line in f:
     print line, 
f.close()
#writing text using writelines
f=open("py1.txt","w")
f1=["maradona","zidane","figo"]
f.writelines(f1)
f.close()
#looping from file
f=open("py1.txt","r")
for line in f:
     print line, 
f.close()
#appending text in file
f=open("py1.txt","a")
f1=["messi","ronaldo","close"]
f.writelines(f1)
f.close()
#looping from file
f=open("py1.txt","r")
for line in f:
     print line, 
f.close()






     

