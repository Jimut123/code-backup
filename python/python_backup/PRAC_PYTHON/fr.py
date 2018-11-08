class palindrome:
	def __init__(self):
		self.a=""
	def input(self,k1):
		self.a=k1
	def calculate(self):
		f=0
                               	   i=0
		j=len(self.a)-1
                                while i<len(self.a)/2:
		        if  self.a[i]!=self.a[j]:
			    f=1
		     	break
			i=i+1
			j=j-1
		        if f==0:
			  print "self.a is palindrome"
		        else:
			  print "self.a is not a palindrome"
x=palindrome()
a=input("enter string:")
x.input(a)
x.calculate()