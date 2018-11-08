 

class prime_check
{
int j=2;
int primecheck(int j,int n)
{   
       if(n%j==0)
       return 1;
     else if(j>=n)
       return 0;
     else 
     return (primecheck(j+1,n));
    }
}
