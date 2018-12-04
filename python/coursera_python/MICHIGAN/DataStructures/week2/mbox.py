# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
fh = open(fname)
count=0
float_tot=0.0
for line in fh:
	if not line.startswith("X-DSPAM-Confidence:") : continue
	count=count+1
	pos_col = line.find(':')
	len_str = len(line)	
	collect_str = line[pos_col+1:len_str]
	str_sp = collect_str.strip()
	float_no = float(str_sp)
	float_tot = float_tot + float_no
	#print(line)


avg_conf = float(float_tot/count)
print("Average spam confidence: ",avg_conf)

