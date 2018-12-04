largest = None
smallest = None
d = 0
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
	

print("Maximum", largest)
print("Minimum", smallest)
