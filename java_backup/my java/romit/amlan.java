import java.io.*;
import java.lang.*;
class amlan
{
public static void main(String[]args)throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int n,m=0,l,i,k;
System.out.println("Enter the no.");
n=Integer.parseInt(Input.readLine());
for(l=0;l<n;l++)
{
int s=0;
for(i=l;i<n;i++)
{
s=s+i;
if(s>n)
{
m=1;
break;
}
else if(s==n)
{
m=0;
break;
}
}
if(m==0)
{
for(k=l;k<=i;k++)
{
System.out.print(k+ "+");
}
System.out.println(" ");
}
}
}
}