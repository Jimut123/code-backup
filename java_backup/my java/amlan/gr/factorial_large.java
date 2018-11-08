package gr;
//factorial of large number

import java.io.*;
 class factorial_large
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
        System.out.println("Factorial:");
        for(i=size-1;i>=0;i--)
        System.out.print(a[i]);
        
}
int multiply(int x,int a[],int size)
{
    c=0;
    for(i=0;i<size;i++)
    {
        p=a[i]*x+c;
        
        a[i]=p%10;
        c=p/10;
    }
    //System.out.print(size);
    while(c!=0)
    {
        a[size]=c%10;
        c=c/10;
        size++;
    }
    return size;
}
public static void main()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n;
    System.out.println("Enter number for Factorial:");
    n=Integer.parseInt(br.readLine());
    factorial_large f=new factorial_large();
    f.factorial(n);
}
}
