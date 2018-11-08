import java.io.*;
class recurpalin2
{
int p,n,j,s=0;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
j=n;
reverse();
}
void reverse()
{
if(j>0)
{
p=j%10;
s=(s*10)+p;
j=j/10;
reverse();
}
else
{
palin();
}
}
void palin()
{
if(s==n)
{
System.out.println("PALINDROME:"+n);
}
else
{
System.out.println("NOT PALINDROME:"+n);
}
}
}