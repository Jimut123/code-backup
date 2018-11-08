class society:
	def __init__(self):
		self.society_name="surya apartment"
		self.house_number="20"
		self.income=25000
		self.flat="a type"
	def inputdata(self,name,no,nom,ic,ft):
		self.society_name=name
		self.house_no=no
		self.no_of_members=nom
		self.income=ic
		self.flat=ft
	def allocate_flat(self):
		if self.income>=25000:
			self.flat="a type"
		if self.income>=20000 and self.income<25000:
			self.flat="b type"
		if self.income<20000:
			self.flat="c type"
	def showdata(self):
		print x.society_name
		print x.house_number
		print x.income
		print x.flat
x=society()
x.showdata()
x.inputdata("Uttaryan Housing",300,1200,10000,"A type")
x.showdata()


	

		