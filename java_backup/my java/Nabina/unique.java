import java.io.*;
class unique
{
public static void main(String args[])throws IOException
{
int a[]=new int[6];
int i,j,n,k=0,t=0,p;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
j=n;
while(j>0)
{
p=j%10;
a[k]=p;
k++;
j=j/10;
}
j=0;
while(j<9)
{
t=0;
for(i=0;i<k;i++)
{
if(a[i]==j)
t++;
}
if(t>1)
{
break;
}
j++;
}
if(t>1)
System.out.println("No. _"+n+"_ is not unique");

else
System.out.println("Yes the no. _"+n+"_ is  unique");
}
}