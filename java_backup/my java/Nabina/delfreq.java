import java.io.*;
class delfreq
{
public static void main(String args[])throws IOException
{
int a[]=new int[100];
int b[]=new int[100];
int i,j,n,k,g=1,temp;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.s of digits you want to enter:");
n=Integer.parseInt(input.readLine());
g=1;
for(i=0;i<n;i++)
{
System.out.println("("+g+") Enter no.:");
a[i]=Integer.parseInt(input.readLine());
g++;
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}k=1;
b[0]=a[0];
for(i=0;i<n;i++)
{
if(a[i]!=a[i+1])
{
b[k]=a[i+1];
k++;
}
}
for(i=0;i<k;i++)
{
a[i]=b[i];
}
System.out.println("Your no.s were:");
n=k;
for(i=0;i<n;i++)
{
if(a[i]!=0)
System.out.println(a[i]+"");
}
}
}