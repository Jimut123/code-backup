def running_sum(numbers, start=0):
	if len(numbers) == 0:
		print()
		return
	total = numbers[0] + start
	print(total,end="")
running_sum(numbers[1:],total)
