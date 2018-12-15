file_name = "input.txt"
file = open(file_name,"r")
sum_t = 0
for line in file:
    #print(line)
    sum_t = sum_t + int(line[:-1]) 
print(sum_t)
