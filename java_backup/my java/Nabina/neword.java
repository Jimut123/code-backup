import java.io.*;
class neword
{
public static void main(String args[])throws IOException
{
int i,j,n,p,s1=0,s2=0,s3=0,s4=0,f=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
j=n;
while(j>0)
{
p=j%10;
if(p%2==0)
s1=(s1*10)+p;
else
{
f=0;
for(i=2;i<=p;i++)
{
if(p%i==0)
{
f=1;
break;
}
}
if(f==0)
s2=(s2*10)+p;
else
s3=(s3*10)+p;
}
j=j/10;
}

System.out.println("Your new no. is:"+s1+s3+s2);
}
}