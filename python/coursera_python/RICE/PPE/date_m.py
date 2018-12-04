"""
Demonstration of some of the features of the datetime module.
"""

import datetime

# Create some dates
print("Creating Dates")
print("==============")

date1 = datetime.date(1999, 12, 31)
date2 = datetime.date(2000, 1, 1)
date3 = datetime.date(2016, 4, 15)
# date4 = datetime.date(2012, 8, 32)

# Today's date
today = datetime.date.today()

print(date1)
print(date2)
print(date3)

print("")

# Compare dates
print("Comparing Dates")
print("===============")

print(date1 < date2)
print(date3 <= date1)
print(date2 == date3)

print("")

# Subtracting dates
print("Subtracting Dates")
print("=================")

diff = date2 - date1
print(diff)
print(diff.days)

diff2 = date3 - date2
print(diff2)
print(diff2.days)

print("")

