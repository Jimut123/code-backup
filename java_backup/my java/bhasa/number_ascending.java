import java.io.*;
class number_ascending
{
public static void main(String args[])throws IOException
{
int n,n1,i,c,t,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER NUMBER");
n=Integer.parseInt(br.readLine());
n1=n;i=0;t=0;c=0;
while(n1>0)
{
c++;
n1=n1/10;
}
int a[]=new int [c];
while(n>0)
{
a[i]=n%10;
i++;
n=n/10;
}
for(i=0;i<c;i++)
{
for(j=0;j<c-i-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("OUTPUT");
for(i=0;i<c;i++)
{
System.out.print(a[i]);
}
}
}
