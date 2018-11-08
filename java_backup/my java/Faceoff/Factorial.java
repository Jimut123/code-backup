import java.io.*;
class Factorial
{
    int a[]=new int[10000];
    int size,x,i,c,p;
    
    void factorial(int n)
    {
        for(x=0;x<10000;x++)
        a[x]=0;
        a[0]=1;
        size=1;
        for(x=2;x<=n;x++)
        size=multiply(x,a,size);
        System.out.println("Factorial");
        for(i=size-1;i>=0;i--)
        System.out.print(a[i]);
    }
    
    int multiply(int x,int a[],int size)
    {
        c=0;
        for(i=0;i<size;i++)
        {
            p=a[i]*x+c;
            a[i]=p