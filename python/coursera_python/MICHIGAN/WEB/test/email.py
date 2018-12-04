import re
x = "From stephen.marquard@uct.ac.za Sat Jan 5 09:14:16 2008"

y = re.findall('\S+@\S+',x)
# Here \S+ means one or more non-blank characters
print(y)

# To extract only which is in the bracket
y = re.findall('From (\S+@\S+)',x)
print(y)

# Dual split pattern
words = x.split() # Split the whole thing into words
print(words) 
email = words[1] # extract the second word
pieces = email.split('@')
print(pieces[1])


month = words[3]
time = words[5]
print("Month : ",month)
print("time :",time)


print("Split by 'a' ")

print(x.split('a'))



#using the regex version




y = re.findall('@([^ ]*)',x)
print(y)
y = re.findall('@([^ ]+)',x)
print(y)





