import java . io.*;
class inversewater
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s;
int i,l,j;
char ch;
System.out.println("enter any word");
s = cd.readLine();
l = s.length();
for(i=l;i>0;i--)
{
for(j=0;j<=i-1;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}


