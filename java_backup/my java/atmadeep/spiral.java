
import java.io.*;
class spiral
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int[100][100];
int i,j,p,q,r,s,n,c,t;
void input()throws IOException
{
System.out.println("Give no of rows and columns");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=0;
cal();
}
void cal()throws IOException
{
p=n;
s=1;
q=n-1;
r=0;
c=0;
t=1;
i=r;
j=c;
while(t<=p)
{
i=r;
j=c;
while(j<=q)
{
if(a[i][j]==0)
{
System.out.println("Give values:");
a[i][j]=Integer.parseInt(br.readLine());
}
j++;
}
j=j-1;
i=i+1;
while(i<=q-1)
{
if(a[i][j]==0)
{
System.out.println("Give values:");
a[i][j]=Integer.parseInt(br.readLine());
}
i++;
}
//j=j-1;
//i=i-1;
while(j>=c)
{
if(a[i][j]==0)
{
System.out.println("Give values:");
a[i][j]=Integer.parseInt(br.readLine());
}
j--;
}
i=i-1;
j++;
while(i>r)
{
if(a[i][j]==0)
{
System.out.println("Give values:");
a[i][j]=Integer.parseInt(br.readLine());
}
i--;
}
r++;
c++;
q--;
t++;
}
disp();
}
void disp()
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
}
}




