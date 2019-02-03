def test_func(i):
    print(i)
    if i>10:
        return
    else:
        test_func(i+1)
    
if __name__ == "__main__":
    test_func(2)