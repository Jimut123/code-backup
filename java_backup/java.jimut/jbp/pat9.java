import java . io.*;
class pat9
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,k,l,m=0;
for(i=1;i<=5;i++)
{
for(j=i;j<=4;j++)
{
System.out.print(" ");
}
for(k=i;k>=1;k--)
{
System.out.print(k);
}
for(l=1;l<=i;l++)
{
System.out.print(l);
}
System.out.println();
}
}
}


