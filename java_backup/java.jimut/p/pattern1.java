import java.io.*;
class pattern1
{
public static void main(String[]args)
{
int i,j,m=1,a=1;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
m=(int)Math.pow(a,2);
System.out.println(m);
m++;
}
System.out.println("");
}
}