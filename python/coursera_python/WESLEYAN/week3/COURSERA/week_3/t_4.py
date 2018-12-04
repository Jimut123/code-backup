def problem3_4(mon, day, year):
	months = {"January":1, "February":2, "March":3, "April":4,"May":5,"June":6,"July":7,"August":8,"September":9,"October":10,"November":11,"December":12}
	mon_f = months[mon]
	#print(mon_f)
	fin_f = str(mon_f) + '/' + str(day) + '/' + str(year)
	print(fin_f)

#problem3_4("July",17,2016)
