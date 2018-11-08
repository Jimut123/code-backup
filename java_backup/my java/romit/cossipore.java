import java.io.*;
class cossipore
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int n,i,add1,add2,add3,add4;
System.out.println("Enter The Length of Arry");
n=Integer.parseInt(Input.readLine());
int A[]=new int[n+1];
for(i=1;i<=n;i++)
{
System.out.println("Enter Nos in Arry:");
A[i]=Integer.parseInt(Input.readLine());
}
System.out.println("Enter 1st Boundary elements:");
add1=Integer.parseInt(Input.readLine());
add2=Integer.parseInt(Input.readLine());
System.out.println("Enter 2nd Boundary elements:");
add3=Integer.parseInt(Input.readLine());
add4=Integer.parseInt(Input.readLine());
int sum1=0,sum2=0;
for(i=add1;i<=add2;i++)
{
sum1=sum1+A[i];
}
for(i=add3;i<=add4;i++)
{
sum2=sum2+A[i];
}
if(sum1>sum2)
{
System.out.println("Maximum indices");
for(i=add1;i<=add2;i++)
{
System.out.println(A[i]);
}
System.out.println("Sum:"+sum1);
}
else
{
System.out.println("Maximum indices");
for(i=add3;i<=add4;i++)
{
System.out.println(A[i]);
}
System.out.println("Sum:"+sum2);
}
}
}