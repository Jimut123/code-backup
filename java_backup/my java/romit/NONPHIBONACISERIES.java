import java.io.*;
import java.lang.*;
class NONPHIBONACISERIES
{
public static void main(String args[])throws IOException
{
BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the length.");
int n=Integer.parseInt(Input.readLine());
System.out.println("Enter the first no.");
int a=Integer.parseInt(Input.readLine());
System.out.println("Enter the 2nd no.");
int b=Integer.parseInt(Input.readLine());
int i,k,m;
System.out.println("The SEries");
for(i=0;i<n-2;i++)
{
m=a+b;
k=b+1;
while(k<m)
{
System.out.print(k+",");
k++;
}
a=b;
b=m;

}
}
}
