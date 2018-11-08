import java.io.*;
class figure2
{
public static void main(String args[])throws IOException
{
int i,j,p,n,j1;
String s=" ";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
int a[][]=new int[n][n];
p=0;
j1=n;
while(j1>0)
{
for(i=p;i<n;i++)
{
for(j=p;j<n;j++)
{
a[i][j]=j1;
}
}
p++;
j1--;
}

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