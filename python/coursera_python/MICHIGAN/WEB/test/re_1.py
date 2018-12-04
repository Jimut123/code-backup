# To use the re function

import re

hand = open('test.txt')
for line in hand:
        line=line.rstrip()
	
	# To find if a line contains a 'from' and print it
 
        if re.search("from",line):
		print("\nTo find if a line contains a 'from' and print it\n")
                print(line)
	
	# To find if the line starts with 'I' then print the line

	if re.search("^I",line):
		print("\nTo find if the line starts with 'I' then print the line\n")
		print(line)

	# . matches any character
	if re.search("X.*",line):
		print("If the line matches with a word having X and any no. of characters after that ")
		print(line)

	# . matches any character starting with X and ending with s
        if re.search("X.*s",line):
                print("\nIf the line matches with a word having X and any no. of characters after that and ending with s\n ")
                print(line)

	# If a line starts with X- followed by only one word no spaces in between then this gonna result
	# print("\nIf a line starts with X- followed by only one word no spaces in between then this gonna result \n")
	if re.search("^X-\S+:",line):
		print("\nIf a line starts with X- followed by only one word no spaces in between then this gonna result \n")
		print(line)



# To extract digits from a line
y = re.findall('[0-9]+',line)
print("line  = ",line)
print("\nAll the digits extracted are :\n")
print(y)	


# To find the upper case vowels
y = re.findall('[AEIOU]',line)
print(y)
		
