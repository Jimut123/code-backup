package finalprojectwork.threefunction;


import java.io.*;
public class series
{
double fact(int a)
{
int i,f=1;
for(i=1;i<=a;i++)
f=f*i;
return(f);
}
public static void main(String[]args)throws IOException
{
int j,n;
double k,s=0;
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
System.out.println("Enter your number");
n=Integer.parseInt(cd.readLine());
series ob=new series();
for(j=1;j<=n;j++)
{
k=ob.fact(j);
s=s+1/k;
}
System.out.println("Sum of series is"+s);
}
}