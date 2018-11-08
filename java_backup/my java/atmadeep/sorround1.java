import java.io.*;
class sorround1
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n;
int a[][]=new int[100][100];
int r,c,i,j,ch;;
 
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
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
ch='y';
while(true)
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
if(a[i][j]==2)
a[i][j]=1;
}
System.out.println("Enter the row address:");
r=Integer.parseInt(input.readLine());
System.out.println("Enter the column address:");
c=Integer.parseInt(input.readLine());
System.out.println("The Selective paths are of"+r+","+c+"is:");
check(r,c);
System.out.println("Give another:(1/0):");
ch=Integer.parseInt(input.readLine());
if(ch==0)
break;
else
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
}
}
}
void check(int r, int c)
{
if(r<0)
return;
else
if(r>=n)
return;
else
if(c<0)
return;
else
if(c>=n)
return;
else
if(a[r][c]==0)
return;
else
if(a[r][c]==1)
{
a[r][c]=2;
System.out.println("PATH:" +r+ "," +c);
check(r-1,c);
check(r+1,c);
check(r,c-1);
check(r,c+1);
check(r-1,c-1);
check(r-1,c+1);
check(r+1,c+1);
check(r+1,c-1);
}
}
}








