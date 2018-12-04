nam1 = '"Teddy" Roosevelt'
nam2 = 'Theodore "Teddy" Roosevelt'
age = 60    
wt = 199.1515115 
#%%
# minimal formating -- {n} represents data item n --- notice misalignment
out1 = "name: {0}  age: {1}  weight: {2}"
#%%
print("name: {0}  age: {1}  weight: {2}".format(nam1,age,wt))
print("name: {0}  age: {1}  weight: {2}".format(nam2,age,wt))


out2 = "name: {0:>26}  age: {1:>4}   weight: {2:>10}"
#%%
print("name: {0:>26}  age: {1:>4}   weight: {2:>10}".format(nam1,age,wt))
print("name: {0:>26}  age: {1:>4}   weight: {2:>10}".format(nam2,age,wt))





