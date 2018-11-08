import java.io.*;
class patprac
{
public static void main (String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader (ab);
int i,l,m=0,k,j;
for(i=5;i>=1;i--,m=m+2)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(k=1;k<=m;k++)
{
System.out.print(" ");
}
for(l=i;l>=1;l--)
{
System.out.print(l);
}
System.out.println();
}
}
}