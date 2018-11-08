from tqdm import tqdm

def fact(n):                                                                                                                                                                    #function to calculate factorial
        f0=1
        a0=0
        for i0 in tqdm(range(n)):
                a0=i0+1
                f0=f0*a0
        
        print("The factorial of ",a0)
        print(f0)

x=input("Enter the number which you want to make the factorial of ? :")

fact(x)

