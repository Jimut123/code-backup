import java.io.*;
class ten2
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int A[]=new int[100];
int k,i,n,j;
for(i=1;i<=50;i++)
{
for(k=i+1;k<=50;k++)
{
for(j=k+1;j<=50;j++)
{
if((j*j==(k*k)+(i*i)))
{
System.out.println(i+" "+k+" "+j);
//break;
}
}
}
}
}
}
