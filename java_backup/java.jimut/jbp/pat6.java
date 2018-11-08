import java . io.*;
class pat6
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,k;
for(i=5;i>=1;i--)
{
for(k=i-1;k>=1;k--)
{
System.out.print(" ");
}
for(j=i;j<=5;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}


