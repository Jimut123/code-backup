 import java.io.*;
class matrix
{
public static void main()throws IOException
{
int m,n,i,j;
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
System.out.println("Enter the values of m and n:");
m=Integer.parseInt(cd.readLine());
n=Integer.parseInt(cd.readLine());
int M[][]=new int[m][n];
System.out.println("Enter the elements to be entered into the matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
M[i][j]=Integer.parseInt(cd.readLine());
}
}
System.out.println("Original Matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(M[i][j]+" ");
}
System.out.println();
}
int no=(m*2)+(n*2)-4;
int e[]=new int[no],k=0,t=0;
i=0;
for(j=0;j<n;j++)
{
e[k]=M[i][j];
k++;
}
i=m-1;
for(j=0;j<n;j++)
{
e[k]=M[i][j];
k++;
}
j=0;
for(i=1;i<m-1;i++)
{
e[k]=M[i][j];
k++;
}
j=n-1;
for(i=1;i<m-1;i++)
{
e[k]=M[i][j];
k++;
}
for(i=0;i<k;i++)
{
for(j=0;j<k-1;j++)
{
if(e[j]>e[j+1])
{
t=e[j];
e[j]=e[j+1];
e[j+1]=t;
}
}
}
int sum=0;
for(i=0;i<k;i++)
{
sum=sum+e[i];
}
i=0;
k=0;
for(j=0;j<n;j++)
{
M[i][j]=e[k];
k++;
}
j=n-1;
for(i=1;i<m;i++)
{
M[i][j]=e[k];
k++;
}
i=m-1;
for(j=n-2;j>=0;j--)
{
M[i][j]=e[k];
k++;
}
j=0;
for(i=m-2;i>0;i--)
{
M[i][j]=e[k];
k++;
}
System.out.println("Rearranged Matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(M[i][j]+" ");
}
System.out.println();
}
System.out.println("Boundary Elements:");
for(i=0;i<m;i++)
{
if(i==0||i==(m-1))
{
for(j=0;j<n;j++)
{
System.out.print(M[i][j]+" ");
}
System.out.println();
}
else
{
for(j=0;j<n;j++)
{
if(j==0||j==(n-1))
System.out.print(M[i][j]+" ");
else
System.out.print(" ");
}
System.out.println();
}
}
System.out.println("Sum of boundary elements:"+sum);
}
} 