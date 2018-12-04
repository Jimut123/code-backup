# to decrypt a msg

msg = input("Enter the encrypted message :")

en_msg = msg.upper()
#print(en_msg)
key = 1
for i in range(27):
	str1 = ""
	#key = 1
	for letter in en_msg:
		l = ord(letter) + key
		if l > 90:	
			l = l - 90 + 64
		str1 = str1 + chr(l)
	key = key + 1
	print(str1)
key = 1
'''for i in range(27):
	str1 = ""
	for letter in en_msg:
		l = ord(letter) - key
		if l < 65:
			l = 91 - (65 - l) 	#- 65 + 64
		str1 = str1 + chr(l)
	key = key + 1
	print(str1)

'''







