import java.io.*;
class figtilt
{
public static void main(String args[])throws IOException
{
String a[][]=new String[100][100];
String b[][]=new String[100][100];
int i,j,g=1,n,p,q,r,nw=0,m,m1;
String s;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter matrix length:");
n=Integer.parseInt(input.readLine());

System.out.println("Enter no.s into ("+n+"*"+n+") matrix :");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("("+g+")");
a[i][j]=input.readLine();
g++;
System.out.println("");
}
}

//display
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

if(n%2==0)
nw=n+2;
else
nw=nw+3;

p=n-1;
q=0;
r=nw/2;
for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
{
for(m=0,m1=0;m<q&&m1<p;m++,m1++)
{
s=a[q][p];
b[i][j]=s;
}
p--;
q++;
}
}

for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
}
}
