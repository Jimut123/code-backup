import java.io.*;
class sum7
{
public static void main(int n)
{
int i,j,p,k;
p=n;
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
System.out.print(j);
for(k=1;k<=(n-p);k++)
System.out.print(k);
p=p-1;
System.out.println("");
}
}
}
