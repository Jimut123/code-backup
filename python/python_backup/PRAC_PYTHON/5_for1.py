words=["Jimut","Python","c"]
for w in words: #for just simple for loop
	#print(w,len(w))
	if len(w)>5:
		words.insert(0,w);
print(words)
	