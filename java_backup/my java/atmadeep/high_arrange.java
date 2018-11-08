import java.io.*;
class high_arrange
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,i,j;
System.out.println("Enter the limit");
n=Integer.parseInt(input.readLine());
int ar[]=new int[n];
int max,min;
int c=0;
int c1=0;
int f=0;
int f1=0;
int t=0;
System.out.println("Enter the numbers in array:");
for(i=0;i<n;i++)
{
ar[i]=Integer.parseInt(input.readLine());
}
max=min=ar[0];
for(i=0;i<n;i++)
{
if(ar[i]>max)
max=ar[i];
else if(ar[i]<min)
min=ar[i];
}
c=(0+n-1)/2;
c1=c+1;

f=0;
f1=0;
for(i=max;i>=min;i--)
{
for(j=0;j<n;j++)
{
if(ar[j]==i)
{
if(f==0)
{
t=ar[c];
ar[c]=ar[j];
ar[j]=t;
f=1;
f1=0;
c--;
break;
}
else 
if(f1==0)
{
t=ar[c1];
ar[c1]=ar[j];
ar[j]=t;
f1=1;
f=0;
c1++;
break;
}
}
}
}
System.out.println("The final array is:");
for(i=0;i<n;i++)
{
System.out.print(ar[i] +" ");
}
}
}