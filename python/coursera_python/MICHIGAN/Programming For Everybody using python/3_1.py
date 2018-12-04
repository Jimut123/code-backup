hrs = input("Enter Hours:")
h = float(hrs)
rate0 = input("Enter rate:")
rate1 = float(rate0)
rate2 = float(rate0)*1.5
if h<=40:
    wage = float(rate1 * h)
elif h>40:
    rq1=float(rate1 * 40.0)
    hr2=float(h - 40.0)
    rq2=float(rate2*hr2)
    wage = float(rq1 +rq2 )
    
print(wage)
