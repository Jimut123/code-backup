import java.io.*;
class pattern5
{
public static void main(String args[])throws IOException
{
int i,x,l,k,t=0;
for(i=70;i>=65;i--)
{
for(k=65;k<=i;k++)
{
System.out.print((char)k);
}
for(l=0;l<t;l++)
{
System.out.print(" ");
System.out.print(" ");
}
for(x=i;x>=65;x--)
{
System.out.print((char)x);
}
t++;
System.out.println(" ");
}
}
}