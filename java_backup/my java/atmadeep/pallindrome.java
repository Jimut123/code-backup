import java.io.*;
class pallindrome
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int n,d,n1;
int rev=0;
void input()throws IOException
{
System.out.println("Enter the number:");
n=Integer.parseInt(input.readLine());
}
int pallin(int n)
{
rev=0;
n1=n;
while(n1>0)
{
d=n1%10;
rev=(rev*10)+d;
n1=n1/10;
}
System.out.println(rev);
if(rev==n)
return 1;
else
return 0;
}
}

