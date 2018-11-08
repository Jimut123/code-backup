import java.io.*;
class decrement_series
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int k=5;
int j=6;
int l=9;
int i=1;
int m,n;
m=j;
n=l;
for(i=1;i<=5;i++)
{
System.out.print(k);
while(m<=n)
{
System.out.print(m);
m++;
}
k--;
j--;
l--;
m=j;
n=l;
//System.out.print(m);
//System.out.print(n);
System.out.println(" ");
}
}
}

