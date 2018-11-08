import java.io.*;
class inhermatrix
{
int i,j,g=1,temp,m,n;
int a[][]=new int[100][100];

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter no.s into ("+n+" * "+n+"array");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("("+g+")");
a[i][j]=Integer.parseInt(input.readLine());
g++;
}
}
disp1();
}

void disp1()
{
System.out.println(" Your original matrix ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
arrange();
}

void arrange()
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(m=0;m<n-i-1;m++)
{
if(a[j][m+1]>a[j][m])
{
temp=a[j][m+1];
a[j][m+1]=a[j][m];
a[j][m]=temp;
}
}
}
}
disp2();
}

void disp2()
{
System.out.println(" Your original matrix ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
}