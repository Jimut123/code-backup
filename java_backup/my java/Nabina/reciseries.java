import java.io.*;
class reciseries
{
public static void main(String args[])throws IOException
{
int n,j,i;
double s,q,p,s1;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of terms:");
n=Integer.parseInt(input.readLine());
p=0;
q=0;
s1=0;
for(i=1;i<=n;i++)
{
s=0;
for(j=0;j<=i;j++)
{
s=s+j;
}
p=Math.pow(s,i);
q=1/p;
s1=s1+q;
}
System.out.println("Your sum is:"+s1);
}
}
