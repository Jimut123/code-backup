import java.io.*;
class sarch 
{
public static void main (String args[])throws IOException
{
BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
int i,n;
System.out.print("enter range");
n=Integer.parseInt(br.readLine());
int ph[]=new int [100];
String name[]= new String[100];
String nm;
boolean flag= false;
for(i=0;i<n;i++)
{
System.out.print("enter ph no.");
ph[i]=Integer.parseInt(br.readLine());
System.out.print("enter name");
name[i]=br.readLine();
}
nm=br.readLine();
for(i=0;i<n;i++)
{

if(name[i].compareTo(nm)==0)
{
System.out.print("search suceeessful");
System.out.print(name[i]+" "+ph[i]);
flag= true;
break;
}
}
if(flag==false)
System.out.print("search unsuceeessful");
else
System.out.print("search suceeessful");
}
}