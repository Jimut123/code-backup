import java.io.*;
class name_x
{
public static void main(String args[])throws IOException
{
int i,j,n;
String s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER NAME");
s=br.readLine();
n=s.length();
String a[][]=new String[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]="";
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
a[i][j]=a[i][j]+s.charAt(i);
}
else
if(i+j==n-1)
{
a[i][j]=a[i][j]+s.charAt(i);
}
else
{
a[i][j]=" ";
}
}
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

