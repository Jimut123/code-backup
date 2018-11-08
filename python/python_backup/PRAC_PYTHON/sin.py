import math
def fun():
	k1=0
	for i in range(0,1000):

		d=(int)(30*math.sin(3.14*i/180))
		k1=int(d)
		if(k1>0):
			if i%9==0:
				for k in range (35):
					print(" ",end='')
				if(i%9==0):
					for j in range(k1):
						print(">",end='')

					print("*",end='')
					print("\n",end='')
					d1=k1;
						
		#print(d)	
		if(d<0):
		
			d1=(int)(math.fabs(d))
			#print(d1)
			if i%9==0:
				for j in range((35-d1),0):
					print(" ",end='')
			if i%9==0:
				for j in range(d1,0):
					print(">",end='')

				print("*",end='')
				print("\n",end='')
							

fun()