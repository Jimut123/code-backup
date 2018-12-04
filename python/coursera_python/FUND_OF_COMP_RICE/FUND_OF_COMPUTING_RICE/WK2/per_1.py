def future_value(present_value, annual_rate, periods_per_year, years):
    rate_per_period = annual_rate / periods_per_year
    periods = periods_per_year * years
    # Put your code here.
    return present_value*(1+rate_per_period)**periods
#print ("$1000 at 2% compounded daily for 3 years yields $", future_value(1000, .02, 365, 3))
print(future_value(500,.04,10,10))
