 

 
//odd magic square
import java.io.*;
class magicsq1
{
int n,a[][],i,j,k,r,c,p,q,s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter rows & columns:");
n=Integer.parseInt(br.readLine());
a=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=0;
gen();
disp();
}
void gen()
{
q=1;
r=1;
c=(n+1)/2;

k=1;
a[r-1][c-1]=k;
for(k=2;k<=n*n;k++)
{
p=r-1;
s=c+1;
if(p==0 && s==(n+1))
{
//System.out.println("Yes1");
p=r+1;
s=n;
r=p;
c=s;
a[r-1][c-1]=k;
}
else
{
//System.out.println("Yes");
if(p==0)
{
p=n;
}
if(s==(n+1))
{
s=1;
}
//if((s-1)==n)
//{
//s=s-1;
//}

if(a[p-1][s-1]==0)
{
r=p;
c=s;
a[r-1][c-1]=k;
}
else
{
p=r+1;
s=c;
if(p==(n+1))
{
p=1;
}
r=p;
c=s;
a[r-1][c-1]=k;
}
}
//disp();
}
}
void disp()
{
int s;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+",");
System.out.println("");
}
System.out.println("Sum of each row:");
for(i=0;i<n;i++)
{
s=0;
for(j=0;j<n;j++)
s=s+a[i][j];
System.out.println(s);
}
System.out.println("Sum of each column:");
for(i=0;i<n;i++)
{
s=0;
for(j=0;j<n;j++)
s=s+a[j][i];
System.out.println(s);
}
System.out.println("Sum of each diagonal");
s=0;
for(i=0;i<n;i++)
{
s=s+a[i][i];
}
System.out.println(s);
s=0;
for(i=0;i<n;i++)
{
s=s+a[i][n-i-1];
}
System.out.println(s);
}
}
