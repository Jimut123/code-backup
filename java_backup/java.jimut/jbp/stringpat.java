import java . io.*;
class stringpat
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s;
int i,l,j,m=2,k,n;
System.out.println("Enter any word");
s = cd.readLine();
l = s.length();
for(i=l;i>=1;i--,m=m+2)
{
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
}
for(k=1;k<=m;k++)
{
System.out.print(" ");
}
for(n=i;n<=0;n--)
{
System.out.print(s.charAt(n));
}
System.out.println();
}
}
}


