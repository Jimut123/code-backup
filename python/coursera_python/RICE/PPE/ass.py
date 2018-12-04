"""
Project for Week 4 of "Python Programming Essentials".
Collection of functions to process dates.

Be sure to read the project description page for further information
about the expected behavior of the program.
"""

import datetime

def days_in_month(year, month):
    """
    Inputs:
      year  - an integer between datetime.MINYEAR and datetime.MAXYEAR
              representing the year
      month - an integer between 1 and 12 representing the month

    Returns:
      The number of days in the input month.
    """
    if month < 12:
        date1 = datetime.date(year,month,1)
        date2 = datetime.date(year,month+1,1)
        return (date2-date1).days    
    if month == 12:
        date1 = datetime.date(year,month,1)
        date2 = datetime.date(year+1,month-11,1)
        return (date2-date1).days


def is_valid_date(year, month, day):
    """
    Inputs:
      year  - an integer representing the year
      month - an integer representing the month
      day   - an integer representing the day

    Returns:
      True if year-month-day is a valid date and
      False otherwise
    """
    #return False
    if year >= datetime.MINYEAR and year <= datetime.MAXYEAR and month >=1 and month <= 12:
        if month == 2 and day == 29 or day >31 or day <=0:
            return False
        else:
            return True
    else:
        return False

def days_between(year1, month1, day1, year2, month2, day2):
    """
    Inputs:
      year1  - an integer representing the year of the first date
      month1 - an integer representing the month of the first date
      day1   - an integer representing the day of the first date
      year2  - an integer representing the year of the second date
      month2 - an integer representing the month of the second date
      day2   - an integer representing the day of the second date

    Returns:
      The number of days from the first date to the second date.
      Returns 0 if either date is invalid or the second date is
      before the first date.
    """
    #return 0
    if is_valid_date(year1,month1,day1) == True and is_valid_date(year2,month2,day2) == True:
        date_1 = datetime.date(year1,month1,day1)
        date_2 = datetime.date(year2,month2,day2)
        if date_1 > date_2:
            return 0
        else:
            return (date_2-date_1).days
    else:
        return 0
def age_in_days(year, month, day):
    """
    Inputs:
      year  - an integer representing the birthday year
      month - an integer representing the birthday month
      day   - an integer representing the birthday day

    Returns:
      The age of a person with the input birthday as of today.
      Returns 0 if the input date is invalid or if the input
      date is in the future.
    """
    todays_date = datetime.date.today()
    person_date = datetime.date(year,month,day)
    return (todays_date-person_date).days
    #return 0

