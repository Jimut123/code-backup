package func_rec_;

import java.io.*;
class func_rec_prime_check
{
    int n;
    func_rec_prime_check(int num)
    {
        n=num;
    }
    void clac()
    {
        int j=2,x=0;
        x=prime_check(n,j);
        
        if(x==0)
        System.out.print("Prime :"+n);
        else
        System.out.print("Not Prime :"+n);
    }
int prime_check(int n, int j)
{
    if(j>=n)
    return 0;
    else if(n%j==0)
    return 1;
    else
    return (prime_check(n,(j+1)));
}
}
