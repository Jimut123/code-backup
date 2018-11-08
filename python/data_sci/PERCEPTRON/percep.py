import numpy as np

# sigmoid function
def nonlin(x,deriv=False):
    if(deriv==True):
        return x*(1-x)
    return 1/(1+np.exp(-x))
    
# input dataset
X = np.array([  [0,0,1],
                [0,1,1],
                [1,0,1],
                [1,1,1] ])

print("X : ",X)
# output dataset            
y = np.array([[0,0,1,1]]).T

print("y : ",y)
# seed random numbers to make calculation
# deterministic (just a good practice)
np.random.seed(1)

print("X : ",X)
# initialize weights randomly with mean 0
syn0 = 2*np.random.random((3,1)) - 1

print("syn0 : ",syn0)
for iter in range(1000000):
    # forward propagation
    l0 = X
    l1 = nonlin(np.dot(l0,syn0))
    # how much did we miss?
    l1_error = y - l1
    # multiply how much we missed by the 
    # slope of the sigmoid at the values in l1
    l1_delta = l1_error * nonlin(l1,True)
    # update weights
    syn0 += np.dot(l0.T,l1_delta)
    if iter%100000 == 0:
        print("***************************** iteration :",iter," ********************************")
        print("np.dot(l0,syn0) : ",np.dot(l0,syn0))
        print("l0 : ",l0)
        print("l1 : ",l1)
        print("l1_error : ",l1_error,"\n")
        print("l1_delta : ",l1_delta,"\n")
        print("syn0 : ", syn0)

print ("Output After Training:")
print (l1)

