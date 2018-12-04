def for_version(L):
    found_even = False
    total = 0
    for num in L:
        if num % 2 != 0:
            total = total + num
        elif not found_even:
            found_even = True
    return total
