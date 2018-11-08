import java.io.*;
import java.lang.*;
class romit
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
String n;
System.out.println("ENTER THE NUMBER");
n=Input.readLine();
int l=n.length();
int A[]=new int [l];
int i,j,w;
for(i=0;i<l-1;i++)
{
for(j=i+1;j<l;j++)
{
if(A[i].CompareTo(A[j]))
{
w=A[i];
A[i]=A[j];
A[j]=w;
}
}
}
System.out.println(A[i]);
}
}