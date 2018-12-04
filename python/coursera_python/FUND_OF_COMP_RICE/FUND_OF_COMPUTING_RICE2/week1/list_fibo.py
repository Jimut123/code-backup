l = [0,1]
for i in range(1,10+1):
    k = l[i] + l[i-1]
    l.append(k)
print(l.pop())
