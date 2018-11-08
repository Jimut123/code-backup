import java.io.*;
import java.lang.*;
class decimal
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,l=0,d=0,m;
String n;
char h;
System.out.println("Enter The No.");
n=Input.readLine();
int A[]=new int[n.length()];
k=0;
for(i=0;i<n.length();i++)
{
h=n.charAt(i);
if(h=='0')
{
A[k]=0;
k++;
}
else if(h=='1')
{
A[k]=1;
k++;
}
}
d=k-1;
for(m=0;m<k;m++)
{
l=l+(A[m]*((int)Math.pow(2,d)));
d--;
}
System.out.print("The Decimal No."+l);
}
}