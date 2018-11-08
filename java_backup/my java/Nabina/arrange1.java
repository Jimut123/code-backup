import java.io.*;
class arrange1
{
public static void main(String args[])throws IOException
{
int i,j,k=0,g=1,temp=0,p=0,n,s=0,t=0;
int a[][]=new int[10][10];
int b[]=new int[10];
int c[]=new int[10];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length for square matrix :");
n=Integer.parseInt(input.readLine());
System.out.println("Enter no.s for square matrix :");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("("+g+")"+" Enter no.:");
a[i][j]=Integer.parseInt(input.readLine());
g++;
}
}

System.out.println("Your square matrix :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

for(i=0;i<n;i++)
{
s=0;
for(j=0;j<n;j++)
{
s=s+a[i][j];
}
b[k]=s;
c[k]=s;
k++;
}

temp=0;
for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;j++)
{
if(c[j+1]>c[j])
{
temp=c[j+1];
c[j+1]=c[j];
c[j]=temp;
}
}
}
System.out.println("Your new matrix arranged in the decreasing order of their sums:");
p=0;
while(p<k)
{
for(i=0;i<k;i++)
{
if(b[i]==c[p])
{
for(j=0;j<k;j++)
{
t++;
if(t<4)
{
System.out.print(a[i][j]+" ");
b[i]=0;
}
if(t==4)
break;
}
}
}
p++;
t=0;
System.out.println(" ");
}
}
}