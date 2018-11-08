import java.io.*;
class fibo
{
    int fibo(int n)
    {
        if(n==1)
        return 0;
        else if (n==2)
        return 1;
        else if(n>2)
        return fibo(n-1)+fibo(n-2);
        else 
        return -1;
        
    }
} 