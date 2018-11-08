# Encryption code send by suchandra


s = "WDYOEOOTLNUILEGI"

y = s.split()
k = list(s)
print(k)


###############   Test lvl -- 2 ############


for num in range(0,100):
	str1 = []
	for i in k:
		i1 = ord(i)
		i1 = i1 + num
		if i1 > 90:
			
			i1 = i1 - 90 + 64
		str1.append(chr(i1))
	#','.join(str1)
	print(str1)
	print(str1[::-1])
	print()

#################  Test lvl -- 1 ###############


for num in range(0,100):
	str1 = []
	for i in k:
		i1 = ord(i)
		i1 = i1 - num
		if i1 < 65:
			i1 = 91 - 65 + i1
		str1.append(chr())
		#print(chr(i1),end="")
	#','.join(str1)
	print(str1)
	print(str1[::-1])
	print()


################  Test lvl -- 3 #############

#+1 -1
#+2 -2
count=1
for num in range(0,121):
	str1 = []
	for i in k:
		i1 = ord(i)
		if count % 2 == 0:
			i1 = i1 + num
		else:
			i1 = i1 - num
		str1.append(chr())
		#print(chr(i1),end="")
	#','.join(str1)
	print(str1)
	print(str1[::-1])
	print()
