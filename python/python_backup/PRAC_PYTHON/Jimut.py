"""Creating an AI named Chatbox """

"""The list of functions or operations it can perform ..."""
import os
def clear():
	os.system('cls')  # on windows
def print1():
	for i1 in range(60):
		print("--",end ='') 
		i1=i1+1
def factors(n):
	print("* Factors of ",n," are : ",end=" ")
	for i in range(1,n):
		if(n%i==0):
			print(i,end=",")
def odd(n):
	if(n%2!=0):
		return 1
	else:
		return 0
def count1(n1):
	k1=n1
	s2=0
	while(k1!=0):
		s2=s2+1
		k1=k1//10
	return s2
def range1(s1):																		#for making a range of numbers as per the user's request
	r1=int(input("Enter the lower bound/range :"))
	r2=int(input("Enter the upper bound/range :"))

	for i1 in range(r1,r2):
		if "armstrong" in s1:
			if(armstrong1(i1)==1):
				print(i1,end=',')
		if "palindrome" in s1:
			if(palindrome(i1)==1):
				print(i1,end=',')
		if "prime" in s1:
			if(prime(i1)==1):
				print(i1,end=',')
		if "krishnamurti" in s1:
			if(krishnamurti(i1)==1):
				print(i1,end=',')
		if "automorphic" in s1:
			if(automorphic(i1)==1):
				print(i1,end=',')

		if "kaprekar" in s1:
			if(kaprekar(i1)==1):
				print(i1,end=',')

		if("odd" in s1):
			if(odd(i1)==1):
				print(i1,end=',')
		if("even" in s1):
			if(odd(i1)==0):
				print(i1,end=',')


def lists():																						#list of operation that it can perform
	print("I can calculate factorial of almost any no.")
	print("I can calculate armstrong,palindrome,prime number as well as all numbers within a range")
	print("I can keep talking and replying")
	print("I can show the date")
	print("Type \'exit\' to exit")

def prime(n):																						#function to check prime
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
def kaprekar(n):
	k4=n
	d1=k4**2
	di=count1(k4)
	d2=d1%(10**di)
	d3=d1//(10**di)
	s0=0
	s0=d2+d3
	if(s0==n):
		return 1
	else :
		return 0
def krishnamurti(n):
	k2=n
	s3=0
	while(k2>0):
		d=k2%10
		s3=s3+factret(d)
		k2=k2//10
	if(s3==n):
		return 1
	else:
		return 0
def factret(n):
	f1=1
	a1=1
	for i1 in range(n):
		a1=i1+1
		f1=f1*a1
	return f1
def fact(n):																					#function to calculate factorial
	f0=1
	a0=0
	for i0 in range(n):
		a0=i0+1
		f0=f0*a0
	print1()
	print("The factorial of ",a0)
	print(f0)
def automorphic(n):
	k3=n
	q=k3**2
	c1=count1(n)
	d=q%(10**c1)
	if(n==d):
		return 1
	else:
		return 0

def armstrong1(n):																						#function to check armstrong
	a0=n
	s=0
	d=0
	l2=count1(n)
	while a0>0:
		d=a0%10
		s=s+d**l2
		a0=a0//10

	if s==n:
		return 1
	else :
		return 0

def palindrome(n):																		#function to check palindrome or not
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

def fun1_gen(s1):                                                  					 #general questions
	if "hi" in s1 or "hello" in s1:						                              #For "hi" or "hello"
		return "hi... how can I help you ?"
	if  "how are you" in s1 :												 #For "how are you"
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


def fun2_math(s1):			
	k8=0
	if("odd" in s1 and not "range" in s1):
		k8=1
		f=int(input("Enter the number which you want to check whether odd or even :"))
		f=odd(f)
		if(f==1):
			print("Odd number..")
		else:
			print("Even number ...")
	if("even" in s1 and not "range" in s1 and k8==0):
		f=int(input("Enter the number which you want to check whether odd or even :"))
		f=odd(f)
		if(f==1):
			print("Odd number..")
		else:
			print("Even number ...")
																				#function to calculate mathematical functions
	if("factorial" in s1):
		f=int(input("Enter the number which you want to find the factorial of :"))
		fact(f)

	if(("odd" or "even") and "range" in s1):
		range1(s1)
	if("armstrong" in s1 and "range" in s1):
		range1(s1)
	if("palindrome" in s1 and "range" in s1):
		range1(s1)
	if("kaprekar" in s1 and "range" in s1):
		range1(s1)
	if("prime" in s1 and "range" in s1):
		range1(s1)
	if("krishnamurti" in s1 and "range" in s1):
		range1(s1)
	if("automorphic" in s1 and "range" in s1):
		range1(s1)
	if("kaprekar" in s1 and not "range" in s1):
		f=int(input("Enter the number which you want to check whether kaprekar or not :"))
		f=kaprekar(f)
		if(f==1):
			print("Kaprekar number..")
		else:
			print("not a kaprekar number ...")

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
	if("krishnamurti" in s1 and not "range" in s1):
		f=int(input("Enter the number which you want to check whether krishnamurti or not :"))
		f=krishnamurti(f)
		if(f==1):
			print("Krishnamurti number..")
		else:
			print("not a Krishnamurti number ...")
	if("automorphic" in s1 and not "range" in s1):
		f=int(input("Enter the number which you want to check whether automorphic or not :"))
		f=automorphic(f)
		if(f==1):
			print("Automorphic number..")
		else:
			print("not an Automorphic number ...")
	
	if("number details" in s1):
		f=int(input("Enter the number which you want to check :"))
		print("* The details of the number ",f," are :\n")
		print1()
		print("\n")
		p1=prime(f)
		if(p1==1):
			print("* This number is prime.")
		pa1=palindrome(f)
		if(pa1==1):
			print("* This is a palindrome number, reverse the number and it is same")
		ar1=armstrong1(f)
		if(ar1==1):
			print("* This is an armstrong number, count the numbers, each digit^no. of digits + for every digit is the original number.")
		co1=count1(f)
		print("* No. of numbers ",co1)
		kr1=krishnamurti(f)
		if(kr1==1):
			print("* This is a krishnamurti number, the sum of factorial is equal to the number.")
		au=automorphic(f)
		if(au==1):
			print("* This is a Automorphic number, (number^2)%(10^no.of digits in that number) == the original number")
		kp=kaprekar(f)
		if(kp==1):
			print("* This is a kaprekar number")
		o=odd(f)
		if(o==1):
			print("* This is an odd number")
		else:
			print("* This is an even number")

		factors(f)


def fun3_question(s1):
	if("?"in s1):
		if(fun1_gen(quest1)!=None):																 #connected like neurons with func1_gen() and func2_math()
			return fun1_gen(s1)
		if(fun2_math(quest1)!=None):
	 		return fun2_math(s1)




"""The main program starting ..."""
i=""
count =0
while i!="exit":
	print('')
	print("                           * \'exit\' to @exit@ *  \'clear\' to clear* @chat no.@ ~ ",count,'*')
	print('')
	quest1=input('Jimut@Systems@  ')
	print()
	if(quest1=="exit"):
		i="exit";
	if(fun1_gen(quest1)!=None):
		print(fun1_gen(quest1))
	if(fun2_math(quest1)!=None):
	 	print(fun2_math(quest1))
	count=count+1
