def mystery(s):
	i = 0
	result = ''
	while not s[i].isdigit():
		result = result + s[i]
		i = i + 1
	return result
