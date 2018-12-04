largest = None
smallest = None
d = 0
try:	
	while True:
        	num = input("Enter a number: ")
        	d=d+1
        	if d == 1:
                	largest = int(num)
                	smallest = int(num)
        	if num == "done" : break
        	if int(num)>largest:
                	largest=int(num)
        	if int(num)<smallest:
                	smallest=int(num)
except Exception as e:
	print("Invalid input")

print("Maximum is ", largest)
print("Minimum is ", smallest)

