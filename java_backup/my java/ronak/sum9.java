import java.io.*;
class sum9
{
public static void main(int n)
{
int i,j;
int k=65;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)k);
k=k+1;
}
k=k+1;
System.out.println("");
}
}
}