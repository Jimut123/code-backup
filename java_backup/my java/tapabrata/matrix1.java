import java.io.*;
class matrix1
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int arr[][];
int r,c,max,min,maxi,maxj,mini,minj,i,j,m,n;
public void take()throws IOException
{
boolean bool=true;
while(bool)
{
System.out.println(" Enter no of rows ");
r=Integer.parseInt(br.readLine());
System.out.println(" Enter no of columns ");
c=Integer.parseInt(br.readLine());
if(r<2||c<2||r>20||c>20)
bool=true;
else
bool=false;
}
arr=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.println(" Enter values ");
arr[i][j]=Integer.parseInt(br.readLine());
}
}
max=arr[0][0];min=arr[0][0];maxi=maxj=mini=minj=0;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(arr[i][j]>max)
{max=arr[i][j];
maxi=i;maxj=j;
}
else 
if(arr[i][j]<min)
{
mini=i;minj=j;min=arr[i][j];
}
}
}
System.out.println(" Original array ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(arr[i][j] +",");
System.out.println();
}
}
System.out.println("Maximum value " +max);
System.out.println("ROW " +maxi);
System.out.println("COLUMN " +maxj);
System.out.println("Minimum value " +min);
System.out.println("ROW " +mini);
System.out.println("COLUMN " +minj);
for(m=0;m<r;m++)
{
for(n=0;n<c;n++)
{
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(arr[m][n]<arr[i][j])
{
min=arr[m][n];
arr[m][n]=arr[i][j];
arr[i][j]=min;
}
}
}
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(arr[i][j]+",");
System.out.println();
}
}
}
static void main()throws IOException
{
matrix1 ob=new matrix1();
ob.take();
}
}
