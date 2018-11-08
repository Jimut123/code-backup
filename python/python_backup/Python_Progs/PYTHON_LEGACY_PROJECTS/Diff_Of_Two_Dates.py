from datetime import date
d1=int(input("Enter the first day :"))
m1=int(input("Enter the first month :"))
y1=int(input("Enter the first year :"))
d2=int(input("Enter the second day :"))
m2=int(input("Enter the second month :"))
y2=int(input("Enter the second year :"))
f_date=date(y1,m1,d1)
l_date=date(y2,m2,d2)
delta = l_date - f_date
print(delta.days)
