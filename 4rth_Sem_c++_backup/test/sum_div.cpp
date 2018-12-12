#include<iostream>
#include<cmath>
#include<cstdlib>
typedef long long big_int;
//std::int256_t big_int;
int rsum(big_int n)
{
    int sum=0,d;
    while(n!=0)
    {
        d=n%10;
        sum+=d;
        n=n/10;
    }
    return sum;
}
int main()
{
    big_int i,N;
    int sum,k;
    std::cin >>N;
    std::cin >>sum;
    for(i=N;;i+=N)
    {
        k = rsum(i);
        if(k==sum)
        {
             std::cout<<"Got it!"<<i;
             break;
        }
        //if(k>sum)
          //  break;
    }
    if(k>sum)
        std::cout<<"-1";
    return 0;
}
