import java.io.*;
class numm
{
public static void main(String args[])throws IOException
{
int n,i,j,m,p,s2=0,n1=0;
int s=0,s1=0,s3=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
j=n;
m=0;
while(j>0)
{
p=j%10;
m++;
j=j/10;
}
m=m-1;
j=n;
while(j>0)
{
n1=(n1*10)+(j%10);
j=j/10;
}
j=n1;
while(j>0)
{
System.out.println(j);
s=j/(int)Math.pow(10,m);
s1=(s1*10)+s;
s2=j%10;
s1=(s1*10)+s2;
s3=s*(int)Math.pow(10,m);
j=j-s3;
j=j/10;
}
System.out.println("The no. is "+s1);
}
}