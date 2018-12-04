from datetime import date
import datetime
#datetime.datetime(year=year,month=month,day=day,hour=hour)
def days_in_month(year, month):
	return month.days

def is_valid_date(year, month, day):
	tot_days = year.days+month.days+day 
	if tot_days == 365 or tot_days == 366:
		return True
	else:
		return False

def days_between(year1, month1, day1, year2, month2, day2):
		

