"""Creating an AI named Chatbox """

"""The list of functions or operations it can perform ..."""
import os
def clear():
	os.system('cls')  # on windows
def print1():
	for i1 in range(60):
		print("--",end ='') 
		i1=i1+1
def range1(s1):																																				#for making a range of numbers as per the user's request
	r1=int(input("Enter the lower bound/range :"))
	r2=int(input("Enter the upper bound/range :"))

	for i1 in range(r1,r2):
		if "armstrong" in s1:
			if(armstrong1(i1)==1):
				print (i1,end=',')
		if "palindrome" in s1:
			if(palindrome(i1)==1):
				print(i1,end=',')
		if "prime" in s1:
			if(prime(i1)==1):
				print(i1,end=',')


def lists():																																				#list of operation that it can perform
	print("I can calculate factorial of almost any no.")
	print("I can calculate armstrong,palindrome,prime number as well as all numbers within a range")
	print("I can keep talking and replying")
	print("I can show the date")

def prime(n):																																				#function to check prime
	k=0
	for i in range(2,n):
		#print(n,i)
		if n%i==0:
			k=1
			break;
		i=i+1;
	if k==0:
		return 1
	elif k==1 :
		return 0

def fact(n):																																				#function to calculate factorial
	f0=1
	a0=0
	for i0 in range(n):
		a0=i0+1
		f0=f0*a0
	print1()
	print("The factorial of ",a0)
	print(f0)

def armstrong1(n):																																			#function to check armstrong
	a0=n
	s=0
	d=0
	while a0>0:
		d=a0%10
		s=s+d*d*d
		a0=a0//10

	if s==n:
		return 1
	else :
		return 0

def palindrome(n):																																			#function to check palindrome or not
	a0=n
	s=0
	while a0>0:
		d=a0%10
		s=s*10+d
		a0=a0//10

	if s==n:
		return 1
	else:
		return 0

def fun1_gen(s1):                                                  																							 #general questions
	if "hi" in s1 or "hello" in s1:						                                           															 #For "hi" or "hello"
		return "hi... how can I help you ?"
	if  "how are you" in s1 :																																 #For "how are you"
		return "fine ..."
	if "who are you" in s1 or "AI" in s1 or "who made you" in s1 :
		return "I am an Artificial Intelligence... I am still being developed through Machine learning.."
	if "creator" in s1:
		return "I am being developed by JIMUT BAHAN PAL..."
	if "date" in s1:
		from datetime import date
		now = date.today()
		print(now)
	if "what can you do" in s1:
		lists()
	if "clear" in s1:
		clear()


def fun2_math(s1):																																		#function to calculate mathematical functions
	if("factorial" in s1):
		f=int(input("Enter the number which you want to find the factorial of :"))
		fact(f)
	if("armstrong" in s1 and "range" in s1):
		range1(s1)
	if("palindrome" in s1 and "range" in s1):
		range1(s1)
	if("prime" in s1 and "range" in s1):
		range1(s1)
	if("armstrong" in s1 and not "range" in s1):
		f=int(input("Enter the number which you want to check whether armstrong or not :"))
		f=armstrong1(f)
		if(f==1):
			print("Armstrong number..")
		else:
			print("not an armstrong number ...")

	if("palindrome" in s1 and not "range" in s1 ):
		f=int(input("Enter the number which you want to check whether palindrome or not :"))
		f=palindrome(f)
		if(f==1):
			print("Palindrome number..")
		else:
			print("not an palindrome number ...")
	if("prime" in s1 and not "range" in s1):
		f=int(input("Enter the number which you want to check whether prime or not :"))
		f=prime(f)
		if(f==1):
			print("Prime number..")
		else:
			print("not a prime number ...")


def fun3_question(s1):
	if("?"in s1):
		if(fun1_gen(quest1)!=None):																														 #connected like neurons with func1_gen() and func2_math()
			return fun1_gen(s1)
		if(fun2_math(quest1)!=None):
	 		return fun2_math(s1)




"""The main program starting ..."""
i=""
count =0
while i!="exit":
	print("********************************************************************************chat no. =",count)
	print('')
	quest1=input('Type your question :')
	if(fun1_gen(quest1)!=None):
		print(fun1_gen(quest1))
	if(fun2_math(quest1)!=None):
	 	print(fun2_math(quest1))
	print('')
	i=input('Type \'exit\' to exit \'clear\' to clear  : ')
	count=count+1
