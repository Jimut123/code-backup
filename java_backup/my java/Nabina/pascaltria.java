import java.io.*;
class pascaltria
{
public static void main(String args[])throws IOException
{

int a[]=new int[100];
int b[]=new int[100];
int n,i,j,p=0,m;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());

for(i=0;i<n;i++)
{
a[i]=1;
b[i]=1;
}

while(p<3)
{
for(i=0;i<p;i++)
{
System.out.print(b[i]+" ");
}
System.out.println();
p++;
}

p=3;
for(i=2;i<n;i++)
{
for(j=1;j<i;j++)
{
b[j]=a[j-1]+a[j];
}
for(m=0;m<p;m++)
{
System.out.print(b[m]+" ");
}
System.out.println();
p++;
for(j=1;j<i;j++)
a[j]=b[j];
}
}
}