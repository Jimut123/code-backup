a=input("enter a unit")
if a<=75:
	b=0
if a>75 and a<=150:
	b=(a-75)*0.50 
if a>150 and a<=225:
	b=75*0.50+(a-150)*1.0
print "bill",b
	