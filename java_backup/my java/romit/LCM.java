import java.io.*;
import java.lang.*;
class LCM
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 1st no.");
int a=Integer.parseInt(Input.readLine());
System.out.println("Enter the 2nd no.");
int b=Integer.parseInt(Input.readLine());
int i,d,c,m=1;
if(a>b)
{
d=a;
c=b;
}
else 
{
d=b;
c=a;
}
int f=0;
for(i=1;i<=d;i++)
{
m=d*i;
if(m%c==0)
{
f=1;
break;
}
}
if(f==1)
{
System.out.println("The LCM"+m);
}
}
}
