import java.io.*;
class martix4
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int ab[]=new int[100];
int bl[]=new int[100];
int i,j,r,c,g,temp=0,sum=0,n,k=0,m,f=0,h=0,t=0;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length for matrix:");
n=Integer.parseInt(input.readLine());

System.out.println("Enter no.s for ("+n+"x"+n+") matrix:");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("("+g+") ");
a[i][j]=Integer.parseInt(input.readLine());
g++;
System.out.println("");
}
}

System.out.println("Your matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

k=n-1;
for(i=0;i<n-1;i++)
{
for(j=0;j<k;j++)
{
ab[h]=a[i][j];
h++;
}
k--;
}
System.out.println(" Upper diagonals:");
for(i=0;i<h;i++)
{
System.out.print(ab[i]+" ");
}

t=0;
k=n-1;
for(i=1;i<n;i++)
{
for(j=n-1;j>=k;j--)
{
bl[t]=a[i][j];
t++;
}
k--;
}
System.out.println(" Lower diagonals:");
for(i=0;i<t;i++)
{
System.out.print(bl[i]+" ");
}

k=n-1;
t=0;
for(i=0;i<n-1;i++)
{
for(j=0;j<k;j++)
{
a[i][j]=bl[t];
t++;
}
k--;
}

h=0;
k=n-1;
for(i=1;i<n;i++)
{
for(j=n-1;j>=k;j--)
{
a[i][j]=ab[h];
h++;
}
k--;
}

System.out.println("Your new matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

}
}