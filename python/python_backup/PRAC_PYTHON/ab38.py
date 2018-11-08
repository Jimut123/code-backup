class factorial:
       def __init__(self):
	         self.n=0
	         self.f=1
       def inputdata(self,n1):
	         self.n=n1
       def calculate(self):
	         for i in range(1,self.n+1,1):
                              self.f=self.f*i                       
       def show(self):
                         print self.f 
x=factorial()
k=input("Enter data:")
x.inputdata(k)
x.calculate()
x.show();


	

		