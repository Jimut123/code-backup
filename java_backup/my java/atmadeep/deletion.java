import java.io.*;
class deletion
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int ar[]=new int[10];
int b[]=new int[10];
int i,j,f,m,n;
System.out.println("Enter the numbers in array");
for(i=0;i<10;i++)
{
ar[i]=Integer.parseInt(input.readLine());
}
f=0;
for(i=0;i<10;i++)
{
m=0;
for(j=0;j<f;j++)
{
if(b[j]==ar[i])
{
m=1;
break;
}
}
if(m==0)
{
b[f]=ar[i];
f++;
}
}
for(j=0;j<f;j++)
ar[j]=b[j];
n=f;
for(i=0;i<n;i++)
{
System.out.println("The numbers in array" +ar[i]);
}
}
}