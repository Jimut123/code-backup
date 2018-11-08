import java.io.*;
class one
{
public static void main (int n) throws IOException
{
int f, i, j,s; 
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a number");
s=0;
for (i=1;i<=n;i++)
{
f=1;
for (j=1;j<=i;j++)
f=f*j;
s=s+i/f;
}
System.out.println(s);
}
}