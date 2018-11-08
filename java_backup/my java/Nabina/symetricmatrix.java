import java.io.*;
class symetricmatrix
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int b[][]=new int[100][100];
int i,j,n,g=1,f=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter matrix length.:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter no.s into ("+n+"*"+n+") matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("("+g+")");
a[i][j]=Integer.parseInt(input.readLine());
g++;
System.out.println("");
}
}

for(j=0;j<n;j++)
{
for(i=0;i<n;i++)
{
b[i][j]=a[j][i];
}
}

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(b[i][j]!=a[i][j])
{
f=1;
}
}
}
if(f==1)
{
System.out.println("Not symmetric");
}
else
{
System.out.println("Symmetric");
}
}
}