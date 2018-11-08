package project_2011_half_yearly;

//Magic square for 3*3 Matrix
class magicsq
{
public static void main(String args[])
{
int a[][]=new int[100][100];
int i,j,k,n,p,q,r,v;
n=3;
p=n/2;
q=n*n;
v=q/2;
r=(q/2)+1;
a[p][p]=r;
i=0;
j=n-1;
k=1;
while(k<=v)
{
while(i<n)
{
if(i<j)
 a[i][j]=r+k;
else
 if(i>j)
  a[i][j]=r-k;
 else
   a[i][j]=r;
i++;
j--;
}
k++;
//cout<<k<<endl;
i=p;
j=0;
while(j<n)
{
if(i>j)
  a[i][j]=r-k;
else
 if(j>i)
   a[i][j]=r+k;
 else
    a[i][j]=r;
j++;
}
k++;
//cout<<k<<endl;
i=0;
while(i<n)
{
//cout<<"Kk"<<k<<" "<<i<<endl;
if(i>p)
  {
   a[i][i]=r-k;
   //cout<<"Kks"<<k<<" "<<i<<endl;
   //cout<<a[i][i]<<endl;
  }
else
 if(p>i)
   a[i][i]=r+k;
 else
    a[i][i]=r;
i++;
}
k++;
//cout<<k<<endl;
i=0;
j=p;
while(i<n)
{
if(j>i)
  a[i][j]=r-k;
else
 if(i>j)
   a[i][j]=r+k;
 else
    a[i][j]=r;
i++;
}
k++;
//cout<<k<<endl;
}
System.out.println("Finally Magic square of 3*3 Matrix is :");
for(int u=0;u<n;u++)
{
for(int u1=0;u1<n;u1++)
System.out.print(a[u][u1]+",");
System.out.println("");
}
}
}







