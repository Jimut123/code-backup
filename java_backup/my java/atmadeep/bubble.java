//bubble sort using recursion
import java.io.*;
class bubble
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,i,j,k,l,t=0;
int ar[]=new int[100];
void input()throws IOException
{
System.out.println("Enter limit:");
n=Integer.parseInt(input.readLine());
for(i=0;i<n;i++)
{
ar[i]=Integer.parseInt(input.readLine());
}
i=0;
sort();
for(i=0;i<n;i++)
{
System.out.println(ar[i]);
}
}
void sort()
{
if(i>=n)
return;
else
{
j=0;
sort1(i,j,n);
i=i+1;
sort();
}
}
void sort1(int i,int j,int n)
{
if(j>=(n-i-1))
return;
else
{
if(ar[j]>ar[j+1])
{
t=ar[j];
ar[j]=ar[j+1];
ar[j+1]=t;
}
j++;
sort1(i,j,n);
}
}
}
