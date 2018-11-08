import java.io.*;
class pattern
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int d,n,rev=0,i,j,n1,k;
System.out.println("Enter the number");
n=Integer.parseInt(input.readLine());
while(n>0)
{
d=n%10;
rev=(rev*10)+d;
n=n/10;
}
n1=rev;
for(i=1;i<=3;i++)
{
for(j=1;j<=i;j++)
{
k=n1%10;
System.out.print(k+" ");
n1=n1/10;
}
System.out.println("");
}
}
}
