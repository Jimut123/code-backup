import java.io.*;
class magicsquare
{
public static void main(String args[])throws IOException
{

InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int max=0;
int n,i,j;
System.out.println("Enter array length:");
n=Integer.parseInt(input.readLine());
int a[][]=new int[n][n];
System.out.println("Enter the numbers in array");
//for(i=0;i<n;i++)
//{
//for(j=0;j<n;j++)
//{
//a[i][j]=Integer.parseInt(input.readLine());
//}
//}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
}
System.out.println("");
}
int r=a.length-1;
int c=a[0].length-1;
int ois=0,fd=0,bd=0,sr=0,sc=0,pts=0;
for(int q=0;q<r;q++)
{
fd=fd+a[q][q];
}
ois=fd;
for(int t=0;t<r;t++)
{
for(int w=c;w>0;w--)
{
bd=bd+a[t][w];
}
for(i=0;i<r;i++)
{
sr=0;
for(j=0;j<c;j++)
{
sr=sr+a[i][j];
}
if(sr==ois)
{
pts++;
}
}
for(int u=0;u<c;u++)
{
sc=0;
for(int y=0;y<r;y++)
{
sc=sc+a[u][y];
}
if(sr==ois)
{
pts++;
}
}
if((bd!=ois)||(fd!=ois))
{
System.out.println("Not a magic square");
System.exit(0);
}
if((sc!=ois)||(sr!=ois))
{
System.out.println("Not a magic square");
System.exit(0);
}
if((pts==(r+c))&&(fd==bd)&&(bd==ois))
{
if(fd==ois)
{
if(bd==fd)
{
System.out.println("It is a magic square");
System.exit(0);
}
}
}
}
}
}
