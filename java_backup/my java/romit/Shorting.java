import java.io.*;
class Shorting
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the length");
int n=Integer.parseInt(Input.readLine());
String A[]=new String[n];
int i,j;
for(i=0;i<n;i++)
{
System.out.println("ENTER THE NAMES");
A[i]=Input.readLine();
}
for(i=0;i<n;i++)
{
if((A[i].charAt(0)=='R')||(A[i].charAt(0)=='r'))
{
System.out.println(A[i]);
}
}
}
}

