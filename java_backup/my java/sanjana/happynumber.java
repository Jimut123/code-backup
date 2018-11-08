 

import java.io.*;
class happynumber
{
int n,s;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
void input ()throws IOException
{
System.out.println("Enter a number");
n=Integer.parseInt(br.readLine());
check(n);
}
void check(int n)
{
    int n1,k;
while (n>9)
{
s=0;
n1=n;
while (n1>0)
{
k=n1%10;
s=s+(k*k);
n1=n1/10;
}
n=s;
}
if (n==1)
System.out.println("happynumber");
else
System.out.println("Non happynumber");
}
}