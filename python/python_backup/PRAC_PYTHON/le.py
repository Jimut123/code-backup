class hcf:
         def __init__(self): 
                  self.a=0
                  self.b=0
         def input(self,k,k1):
                 self.a=k
                 self.b=k1
         def calculate(self):
                 while(self.a % self.b !=0):
                      x=self.a % self.b
                      self.a=self.b
                      self.b=x
                 print"Hcf:",self.b
x=hcf()
a=input("Enter Data:")
b=input("Enter Data:")
x.input(a,b)
x.calculate()   