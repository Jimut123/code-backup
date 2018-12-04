def compress_list(L):
	compressed_list = []
	i=0
	while i < len(L):
		compress_list.append(L[i]+L[i+1])
		i=i+2
	return compress_list
