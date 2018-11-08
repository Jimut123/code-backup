import java.io.*;
class nos
{
public static void main(String args[])throws IOException
{
long i,j,n,c=0,p,s=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter a no.:");
n=Integer.parseInt(input.readLine());
s=0;
p=0;
for(i=0;i<=9;i++)
{
j=n;
c=0;
while(j>0)
{
p=j%10;
if(p==i)
c++;
j=j/10;
}
if(c==1)
s=(s*10)+i;
}
System.out.println("Your no. is: "+s);
}
}

