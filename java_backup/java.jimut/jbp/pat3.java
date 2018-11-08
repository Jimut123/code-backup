import java . io.*;
class pat3
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,k;
for(i=1;i<=5;i++)
{
for(k=i-1;k>=0;k--)
{
System.out.print(' ');
}
for(j=0;j<=i;j++)
{
System.out.print('a');
}
System.out.println();
}
}
}


