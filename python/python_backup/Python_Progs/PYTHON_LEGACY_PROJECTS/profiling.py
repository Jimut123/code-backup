import cProfile
def sum():
	print(1+2)
cProfile.run('sum()')