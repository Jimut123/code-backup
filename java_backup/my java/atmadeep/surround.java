import java.io.*;
class surround
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n;
int a[][]=new int[100][100];
int r,c,i,j;
void input()throws IOException
{
System.out.println("Enter the limit");
n=Integer.parseInt(input.readLine());
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Input value:");
a[i][j]=Integer.parseInt(input.readLine());
}
}
System.out.println("Enter the row address:");
r=Integer.parseInt(input.readLine());
System.out.println("Enter the column address:");
c=Integer.parseInt(input.readLine());
System.out.println("The Selective paths are of"+r+","+c+"is:");
check(r,c);
}
void check(int r, int c)
{
if(r<0)
return;
if(r>=n)
return;
if(c<0)
return;
if(c>=n)
return;
else
if(a[r][c]==1)
{
System.out.print("PATH" +r+ "," +c);
check(r-1,c);
check(r+1,c);
check(r,c-1);
check(r,c+1);
check(r-1,c-1);
check(r+1,c+1);
check(r-1,c+1);
check(r+1,c-1);
}
}
}









