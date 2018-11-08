import java .io.*;
public class pattern4
{
public static void main(String args[])
{
int i,j,c=1;
for (i=1;i<=5;i++)
{
for (j=1;j<=i;j++)
{
if(j%2==0)
{
c = 0;
}
else
{
c=1;
}
System.out.print(c+" ");
}
System.out.println();
}
}
}


