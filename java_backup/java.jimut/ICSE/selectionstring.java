// Selection sort of 10 names in ascending order
import java.io.*;
import java.lang.*;
class selectionstring
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j,min;
String t;
String m[]=new String[10];
for(i=0;i<10;i++)
{
System.out.print("Enter names:");
m[i]=cd.readLine();
}
for(i=0;i<9;i++)
{
min=i;
for(j=i+1;j<10;j++)
{
if(m[min].compareTo(m[j])>0)
{
min=j;
}
}
t=m[i];
m[i]=m[min];
m[min]=t;
}
System.out.println("Names in alphabetical order:");
for(i=0;i<10;i++)
{
System.out.println(m[i]);
}
}
}