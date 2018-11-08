import java.io.*;
import java.lang.*;
class n2
{
int a[]=new int[100];
int g=1,i,j,j1,p=0,p1=0,l=0,m,temp=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter length of array:");
l=Integer.parseInt(input.readLine());
g=1;
for(i=0;i<l;i++)
{
System.out.println("Enter no. for array:"+g);
a[i]=Integer.parseInt(input.readLine());
g++;
}
}
void arrange()
{
if(l%2!=0)
{
for(i=0;i<l;i++)
{
if(a[i]%2!=0)
{
a[j++]=a[i];
}
}
p=(l+1)/2;

for(j=0;j<p;j++)
{
temp=0;
for(m=0;m<p-j-1;m++)
{
if(a[m+1]<a[m])
{
temp=a[m+1];
a[m+1]=a[m];
a[m]=temp;
}
}
}
p1=l-p;

for(i=0;i<l;i++)
{
if(a[i]%2==0)
{
a[j1++]=a[i];
}
}

for(j1=0;j1<p1;j1++)
{
temp=0;
for(m=0;m<p1-j1-1;m++)
{
if(a[m+1]<a[m])
{
temp=a[m+1];
a[m+1]=a[m];
a[m]=temp;
}
}
}
}

else
if(l%2==0)
{
for(i=0;i<l;i++)
{
if(a[i]%2==0)
{
a[j++]=a[i];
}
}
p=(l/2);

for(j=0;j<p;j++)
{
temp=0;
for(m=0;m<p-j-1;m++)
{
if(a[m+1]<a[m])
{
temp=a[m+1];
a[m+1]=a[m];
a[m]=temp;
}
}
}
p1=l-p;

for(i=0;i<l;i++)
{
if(a[i]%2!=0)
{
a[j1++]=a[i];
}
}

for(j1=0;j1<p1;j1++)
{
temp=0;
for(m=0;m<p1-j1-1;m++)
{
if(a[m+1]<a[m])
{
temp=a[m+1];
a[m+1]=a[m];
a[m]=temp;
}
}
}
}
}
void disp()
{
for(j=0;j<p;j++)
System.out.print(a[j]+"");
for(j1=0;j1<p1;j1++)
System.out.print(a[j1]+"");
}
}
