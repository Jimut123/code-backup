import java.io.*;
class symetricmatrix2
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int i,j,n,g=1,m;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter matrix length.:");
n=Integer.parseInt(input.readLine());
System.out.println("Your symmetrix matrixes:");

g=1;
m=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=g;
g++;
}
m++;
g=m;
}

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

System.out.println("           is same as");

for(j=0;j<n;j++)
{
for(i=0;i<n;i++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

}
}