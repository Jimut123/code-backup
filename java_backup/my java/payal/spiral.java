
import java.io.*;
class spiral
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int mat[][]=new int[100][100];
int i,j,k,p,n,r,c,u;
void input()throws IOException
{
System.out.println("Give n:");
n=Integer.parseInt(br.readLine());
p=n*n;
r=0;
c=0;
i=0;
j=0;
k=1;
u=n;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
mat[i][j]=0;
while(k<=p)
{
i=r;
j=c;
while(j<u)
{
if(mat[i][j]==0)
{
  mat[i][j]=k;
k++;
}
j++;
}
j=j-1;
i=i+1;
while(i<u)
{
if(mat[i][j]==0)
{
  mat[i][j]=k;
k++;
}
i++;
}
i=i-1;
j=u-1;
while(j>=c)
{
if(mat[i][j]==0)
{
  mat[i][j]=k;
k++;
}
j--;
}
i=u-1;
j=c;
while(i>r)
{
if(mat[i][j]==0)
{
  mat[i][j]=k;
k++;
}
i--;
}
r=r+1;
c=c+1;
u=u-1;
}
disp();
}
void disp()
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(mat[i][j]+",");
System.out.println("");
}
}
}

