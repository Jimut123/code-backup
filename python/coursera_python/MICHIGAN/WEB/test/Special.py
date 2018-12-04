# If we want the special regular expression to just behave normally we prefix it with '\'

import  re
x = 'We just recieved $10.00 for cookies.'
y = re.findall('\$[0-9.]+',x)
print(y)


