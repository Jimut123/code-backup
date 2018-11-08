import matplotlib.pyplot as plt
import numpy as np
Fs = int(input("Enter Fs:"))
f = int(input("Enter f:"))
sample = int(input("Enter sample:"))
x=np.arange(sample)
y=np.sin(2 * 3.14 * f * x / Fs)
plt.plot(x,y)
plt.xlabel('sample(n)')
plt.ylabel('voltage(V)')
plt.show()
