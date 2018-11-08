import java . io.*;
class withoutstring3
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,l,j;
char ch;
System.out.print("enter your choice:");
l = Integer.parseInt(cd.readLine());
for(i=65;i<=(65+(l-1));i++)
{
for(j=65;j<=i;j++)
{
System.out.print((char)j);
}
System.out.println();
}
}
}


