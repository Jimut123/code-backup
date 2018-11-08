#Find square root of real or complex numbers
import cmath
num = 1+2j
#num = eval(input("Enter a number: "))
num_sqrt = cmath.sqrt(num)
print("The square root of (1+2j is: ",num_sqrt)
#print("The square root of {0} is {1:0.3f}+{2+0.3f}j".format(num,num_sqrt.real,num_sqrt.imag))
