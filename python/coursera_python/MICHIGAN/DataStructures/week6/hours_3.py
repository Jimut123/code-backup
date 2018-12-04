#import operator
fname = input("Enter file name: ")

fh = open(fname)

counts = dict()
for line in fh:
        line1 = line.rstrip()
        if "From:" in line1:
                continue
        if "From " in line1:
                col_pos = line1.find(':')
                #print("col_pos : ",col_pos)
                ext_hr = line[col_pos-2:col_pos]
                #print("ext_hr : ",ext_hr)
                counts[ext_hr] = counts.get(ext_hr,0) + 1
sorted_x = sorted(counts.items())
print(sorted_x)

for item in sorted_x:
        print(item[0],' ',item[1])
        #print(values)

