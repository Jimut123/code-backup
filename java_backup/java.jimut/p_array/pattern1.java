import java.io.*;
class pattern1
{
public static void main(String[]args)
{
int i,j,p=0;
for(i=11;i<=15;i++)
{
p=i;
for(j=11;j<=i;j++)
{
System.out.print(p+" ");
p=p+10;
}
System.out.println(" ");
}
}
}