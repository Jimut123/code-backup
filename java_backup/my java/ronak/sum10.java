import java.io.*;
class sum10
{
public static void main(String args[])
{
int s=0,k=4,i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<i;j++)
{
if(j==1)
System.out.print(i);
else
{
s=s+k;
System.out.print(s);
k=k-1;
}
System.out.println("");
}
}
}
}
