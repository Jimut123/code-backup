//Selection sort of 10 numbers in ascending order
import java.io.*;
import java.lang.*;
class selectionnumber
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j,min,t;
int m[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter numbers");
m[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<9;i++)
{
min=i;
for(j=i+1;j<10;j++)
{
if(m[min]>m[j])
{
min=j;
}
}
t=m[i];
m[i]=m[min];
m[min]=t;
}
System.out.println("Numbers in ascending order:");
for(i=0;i<10;i++)
{
System.out.println(m[i]);
}
}
}