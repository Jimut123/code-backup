import java.io.*;
class matrixdiagswap
{
public static void main(String args[])throws IOException
{
int i,j,n,g,g1,g2,m=0,c2=0,k=0,k1=0,c1=0,f=0;
int a[][]=new int[100][100];
int b[][]=new int[100][100];
int d[]=new int[100];
int e[]=new int[100];

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no. as length of matrix:");
n=Integer.parseInt(input.readLine());

g=1;
for(i=0;i<n;i++)
 {
  for(j=0;j<n;j++)
   {
    System.out.println("("+g+") Enter no.:");
    a[i][j]=Integer.parseInt(input.readLine());
    g++;
    e[k1]=a[i][j];
    k1++;
   }
  }

System.out.println("your matrix:");
for(i=0;i<n;i++)
 {
  for(j=0;j<n;j++)
   {
    System.out.print(a[i][j]+" ");
    }
    System.out.println();
    }

if(n%2!=0)
 {
  m=(n+1)/2;
 }

g=0;
g1=0;
g2=n-1;
for(i=0;i<n;i++)
 {
  for(j=0;j<n;j++)
   {
    if(a[i][j]%2==0)
     {
      c1++;
      if((c2!=m)||(b[m][m]==0))
       {
        b[g][g]=a[i][j];
        g++;
       }
       else
       {
        g++;
        b[g][g]=a[i][j];
       }
       d[k]=a[i][j];
       k++;
     }
    else
     {
      c2++;
       if((c2!=m)||(b[m][m]==0))
        {
        if(g1>=n)
         break;
         b[g1][g2]=a[i][j];
         g1++;
         g2--;
        }
       else
        {
         g1++;
         g2--;
         b[g1][g2]=a[i][j];
        }
        d[k]=a[i][j];
        k++;
     }
   }
 }
 
 for(i=0;i<k1;i++)
 {
 f=0;
 for(j=0;j<k;j++)
 {
 if(d[j]!=e[i])
 {
 f=1;
 break;
 }
 }
 if(f==1)
 {
 for(g1=0;g1<n;g1++)
 {
 for(g2=0;g2<n;g2++)
 {
 if(b[g1][g2]==0)
 {
 b[g1][g2]=e[i];
 }
 }
 }
 }
 }
 
System.out.println("your matrix:");
for(i=0;i<n;i++)
 {
  for(j=0;j<n;j++)
   {
    System.out.print(b[i][j]+" ");
    }
    System.out.println();
    }
 
 
 }
 }