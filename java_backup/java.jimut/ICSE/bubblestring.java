
// Bubble sorting of 10 names in ascending order
import java.io.*;
import java.lang.*;
class bubblestring
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j;
String t;
String m[]=new String[10];
for(i=0;i<10;i++)
{
System.out.print("Enter names:");
m[i]=cd.readLine();
}
for(i=0;i<9;i++)
{
for(j=0;j<9-i;j++)
{
if(m[j].compareTo(m[j+1])>0)
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
}
}
}
System.out.println("Names in ascending order");
for(i=0;i<10;i++)
{
System.out.println(m[i]);
}
}
}