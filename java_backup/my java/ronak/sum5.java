import java.io.*;
class sum5
{
public static void main(int n)
{
int i,j;
char ch;
for(i=1;i<=n;i++)
{
if(i%2==0)
ch='*';
else
ch='#';
for(j=1;j<=i;j++)
{
System.out.print(ch);
if(ch=='#')
ch='*';
else
ch='#';
}
System.out.println("");
}
}
}
