
import java.io.*;
class bubblename
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,j;
String t;
String a[]=new String[10];
for(i=0;i<10;i++)
{
System.out.println("enter name");
a[i]=br.readLine();
}
for(i=0;i<10;i++)
{
for(j=0;j<10-i-1;j++)
{
if(a[j].compareTo(a[j+1])<0)
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
}