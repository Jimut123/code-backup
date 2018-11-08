import java.io.*;
class ten
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int A[]=new int[100];
int k,i,n,s=0,s1=0,s2=0;
for(i=1;i<=98;i++)
{
k=i+1;
n=i+2;
s=n*n;
s1=k*k;
s2=i*i;
if(s==s1+s2)
{
System.out.println("The Triplet:"+" "+i+","+k+","+n+".");
}
}
}
}
