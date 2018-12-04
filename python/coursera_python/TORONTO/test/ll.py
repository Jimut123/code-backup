def common_chars(s1, s2)i:
	res=''
	for ch in s1:
		if ch in s2:
			res = ch + res
	return res
