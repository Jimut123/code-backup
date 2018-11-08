import java.io.*;
class sum6
{
public static void main(int n)
{
int k,i,j;
k=n;
i=n;
while(i>=1)
{
while(k>i)
{
System.out.print(k);
k--;
}
for(j=1;j<=i;j++)
System.out.print(i);
k=n;
i=i-1;
System.out.println("");
}
}
}
