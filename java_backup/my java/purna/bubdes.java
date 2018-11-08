
import java.io.*;
class bubblename
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,j,t=0;
String a[]=new String[10];
for(i=0;i<10;i++)
{
System.out.println("enter name");
a[i]=br.readLine();
}
for(i=0;i<9;i++)
{
for(j=i+1;j<10;j++)
{
if(compareTo(a[j],a[j+1]<0))
{
t=a[j];
a[j]=a[i];
a[i]=t;
}
}
}
for(i=0;i<10;i++)
{
system.out.println(a[i]);
}
}
}