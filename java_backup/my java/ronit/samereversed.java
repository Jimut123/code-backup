import java.io.*;
class samereversed
{
public static void main(String args[])throws IOException
{
int i,j,u,m;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int k=101,t=0;
for(i=1;i<=5;i++)
{
for(j=97;j<=k;j++)
{
System.out.print((char)j);
}
for(m=1;m<=t;m++)
{
System.out.print(" ");
}
for(u=j-1;u>=97;u--)
{
System.out.print((char)u);
}
t=t+2;
k--;
System.out.println(" ");
}
}
}


