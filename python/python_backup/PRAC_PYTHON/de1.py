def iteminfo:
	def__init__(self):
		self.icode=0
		self.item=null
		self.price=0
		self.qty=0
		self.discount=0
		self.netprice=0
	def cal(self):
		if self.qty<=10:
			self.discount=0
		if self.qty>=11 and self.qty<=20:
			self.discount=15
		if self.qty>=20:
			self.discount=20
	def buy(self,ic,in,pr,q):
		self.icode=ic
		self.item=in
		self.price=pr
		self.qty=q
		cal(c):
			self.netprice=self.price*self.qty-self.discount
			print "net price:","self.netprice"
	
	def show all():
		print 'icode:','self.icode'
		print 'item:','self.item'
		print 'price:,'self.price'
		print 'qty:','self.qty'
		print 'discount:','self.discount'
		print 'netprice:','self.netprice'
x=new 

			