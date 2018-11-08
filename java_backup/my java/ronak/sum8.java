import java.io.*;
class sum8
{
public static void main(int n)
{
int i,j;
char k=65;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)k);
k++;
}
k=k++;
System.out.println("");
}
}
}