import java.io.*;
class matoddev
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int n,i,j,g,f,t,t1,k;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter no.s into ("+n+"*"+n+") matrix");
g=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
g++;
System.out.print("("+g+")"); 
a[i][j]=Integer.parseInt(input.readLine());
System.out.println();
}
}

System.out.println("Your original ("+n+"*"+n+") matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}


t=0;
t1=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]%2==0)
{
k=a[t][t1];
a[t][t1]=a[i][j];
a[i][j]=k;

t1++;
if(t1>=n)
{
t++;
t1=0;
}
}
}
}

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]%2!=0)
{
f=0;
for(g=2;g<a[i][j];g++)
{
if(a[i][j]%g==0)
{
f=1;
break;
}
}
if(f==1)
{
k=a[t][t1];
a[t][t1]=a[i][j];
a[i][j]=k;

t1++;
if(t1>=n)
{
t++;
t1=0;
}
}
}
}
}

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]%2!=0)
{
f=0;
for(g=2;g<a[i][j];g++)
{
if(a[i][j]%g==0)
{
f=1;
break;
}
}
if(f==0)
{
k=a[t][t1];
a[t][t1]=a[i][j];
a[i][j]=k;

t1++;
if(t1>=n)
{
t++;
t1=0;
}
}
}
}
}

System.out.println("Your new ("+n+"*"+n+") matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}