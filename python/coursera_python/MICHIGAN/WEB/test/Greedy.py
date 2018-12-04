# Some examples of using Regular expression and making it greedy and non-greedy

import re

#Greedy
#Longest
x = 'From : Using the : character'
y = re.findall('^F.+:',x)
print(y)


#Non-Greedy
#Shortest
y = re.findall('^F.+?:',x)
print(y)

