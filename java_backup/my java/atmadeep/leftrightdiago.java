import java.io.*;
class leftrightdiago
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,i,j;
int ar[][]=new int[100][100];
void input()throws IOException
{
System.out.println("Enter the limit");
n=Integer.parseInt(input.readLine());
System.out.println("Enter the numbers in array:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
ar[i][j]=Integer.parseInt(input.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(ar[i][j]+",");
System.out.println("");
}
i=0;
System.out.println("Left Diagonal");
ld(i);
j=n-1;
i=0;
System.out.println("Right Diagonal");
rd(i,j);
}
void ld(int x)
{
if(x>=n)
return;
else
{
System.out.print(ar[x][x]+",");
x++;
ld(x);
}
}
void rd(int x,int y)
{
if(x>=n)
return;
else
{
System.out.print(ar[x][y]+",");
x++;
y--;
rd(x,y);
}
}
}

