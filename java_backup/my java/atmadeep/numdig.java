import java.io.*;
class numdig
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
long d,n,s=0,temp=0,c=0,count=0,n1;
System.out.println("Enter the number");
n=Integer.parseInt(input.readLine());
n1=n;
while(n1>0)
{
d=n1%10;
temp=(temp*10)+d;
n1=n1/10;
c++;
}
while(n>0 && temp>0)
{
s=(s*10)+temp%10;
s=(s*10)+n%10;
count++;
temp=temp/10;
n=n/10;
if(count==(c/2))
break;
}
if(c%2!=0)
s=(s*10)+temp%10;
System.out.println("The no is :" +s);
}
}





