p = True
q = True
not (p or not q)

# False

p = True
q = False

not (p or not q)

p = False
q = True
not (p or not q)

p = False
q = False
not (p or not q)


# False False True False



def nand(bool1, bool2):
    """
    Take two Boolean values bool1 and bool2
    and return the specified Boolean values
    """
    if bool1:
        if bool2:
            return False
        else:
            return True
    else:
        return True


def f(x):
	if x%2==0:
		return x//2
	else:
		return ((x*3)+1)


f(f(f(f(f(f(f(674)))))))

f(f(f(f(f(f(f(f(f(f(f(f(f(f(1071))))))))))))))
