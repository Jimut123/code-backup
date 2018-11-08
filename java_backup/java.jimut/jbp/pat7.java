import java . io.*;
class pat7
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,k,l,m=0;
for(i=1;i<=5;i++,m=m+2)
{
for(j=5;j>=i;j--)
{
System.out.print(j);
}
for(k=1;k<=m;k++)
{
System.out.print(" ");
}
for(l=i;l<=5;l++)
{
System.out.print(l);
}
System.out.println();
}
}
}


