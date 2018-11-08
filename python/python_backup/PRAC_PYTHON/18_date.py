from datetime import date
now = date.today()
print(now)
#datetime.date(2003, 12, 2)
now.strftime("%m-%d-%y. %d %b %Y is a %A on the %d day of %B.")
print(now)