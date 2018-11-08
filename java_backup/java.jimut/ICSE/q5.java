//2012 Questn 5
import java.io.*;
import java.lang.*;
class q5
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n[]=new String[15];
int m[]=new int[15];
int i,j,t;
String p;
for(i=0;i<15;i++)
{
System.out.println("ENTER NAME AND MARKS:");
n[i]=cd.readLine();
m[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<14;i++)
{
for(j=0;j<14-i;j++)
{
if(m[j]<m[j+1])
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
p=n[j];
n[j]=n[j+1];
n[j+1]=p;
}
}
}
System.out.println("MERIT LIST:");
for(i=0;i<15;i++)
{
System.out.println("NAMES:"+n[i]);
System.out.println("MARKS:"+m[i]);
}
}
}