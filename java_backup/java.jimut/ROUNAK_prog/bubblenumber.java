// Bubble sorting of 10 numbers in ascending order(Same as book(Prog.7, pg-227)
import java.io.*;
import java.lang.*;
class bubblenumber
{
public static void main(String args[])throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,j,t;
int m[]=new int[10];
for(i=0;i<10;i++)
{
System.out.println("Enter numbers");
m[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<9;i++)
{
for(j=0;j<9-i;j++)
{
if(m[j]>m[j+1])
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
}
}
}
System.out.println("NUmbers in ascending order");
for(i=0;i<10;i++)
{
System.out.println(m[i]);
}
}
}