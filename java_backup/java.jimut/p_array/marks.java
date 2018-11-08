import java.io.*;
class marks
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n[]=new String[10];
int m[]=new int[10];
int i,max=0,min=0;
System.out.println("Enter name:");
for(i=0;i<10;i++)
{
n[i]=cd.readLine();
}
System.out.println("Enter marks:");
for(i=0;i<10;i++)
{

}
max=m[0];min=m[0];
for(i=0;i<10;i++)
{
if(max<m[i])
max=m[i];
if(min>m[i])
min=m[i];
}
System.out.print("Highest marks is got by "+n[i]+"and his marks are="+max);
System.out.print("Lowest marks is got by "+n[i]+"and his marks are="+min);
}
}
