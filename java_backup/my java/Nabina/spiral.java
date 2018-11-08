import java.io.*;
class spiral
{
public static void main(String args[])throws IOException
{
int a[]=new int[100];
int b[][]=new int[100][100];
int i,j,g=1,p,temp=0,q,n,n1,k=0;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter no.s into ("+n+" * "+n+")matrix  ");
p=n*n;
g=1;
for(i=0;i<p;i++)
{
System.out.println("("+g+") Enter no.:  ");
a[i]=Integer.parseInt(input.readLine());
g++;
}

for(i=0;i<p;i++)
{
for(j=0;j<p-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<p;i++)
System.out.println(a[i]);
k=0;
n1=n;
int p1=0;
q=n*n;
while(p1<p)
{
//row=0, column=moving...
i=k;
for(j=k;j<n;j++)
{
b[i][j]=a[p1];
//System.out.println("oo"+b[i][j]);
p1++;
}
//row=moving from 1, column=(n-1)...
j=(n-1);
for(i=1;i<n;i++)
{
b[i][j]=a[p1];
p1++;
}
//row=(n-1), column=moving until (n-1)...
i=(n-1);
for(j=n-1-1;j>=0;j--)
{
b[i][j]=a[p1];
p1++;
}
//row=1 to (n-1), column=0...
//
j=k;
for(i=n-2;i>0;i--)
{
b[i][j]=a[p1];
//System.out.println("oo"+b[i][j]);
p1++;
}
n--;
k++;
System.out.println(n);
System.out.println(k);
}
System.out.println(n1);
for(i=0;i<n1;i++)
{
for(j=0;j<n1;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println("");
}
}
}