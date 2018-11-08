import java.io.*;
class array1
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a[]=new int[10];
int max,i;
System.out.print("Enter 10 numbers:");
for(i=0;i<=9;i++)
{
a[i]=Integer.parseInt(cd.readLine());
}
max=a[0];
for(i=0;i<=9;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("Largest no.="+max);
}
}