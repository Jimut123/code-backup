class fibo:
      def __init__(self):
                self.n=0
                self.a=0
                self.b=1
                self.c=0
      def input(self,k):
                self.n=k
                print self.a,
                print self.b,
                for i in range(1,((self.n+1)-2),1):
                      self.c=self.a+self.b
                      print self.c,
                      self.a=self.b
                      self.b=self.c 
x=fibo()
k1=input("Enter data:")
x.input(k1)


	

		