import java.io.*;
class martix3
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int p[]=new int[100];
int i,j,r,c,g,temp=0,sum=0,n,k=0,m,f=0;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter row no. for matrix:");
r=Integer.parseInt(input.readLine());
System.out.println("Enter column no. for matrix:");
c=Integer.parseInt(input.readLine());

System.out.println("Enter no.s for ("+r+"x"+c+") matrix:");
g=1;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print("("+g+") ");
a[i][j]=Integer.parseInt(input.readLine());
g++;
System.out.println("");
}
}

System.out.println("Your matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

n=0;
for(j=0;j<c;j++)
{
p[k]=a[n][j];
k++;
}
n=c-1;
for(i=1;i<r;i++)
{
p[k]=a[i][n];
k++;
}
n=r-1;
for(j=c-2;j>=0;j--)
{
p[k]=a[n][j];
k++;
}
n=0;
for(i=r-2;i>=1;i--)
{
p[k]=a[i][n];
k++;
}

for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;j++)
{
if(p[j+1]<p[j])
{
temp=p[j+1];
p[j+1]=p[j];
p[j]=temp;
}
}
}

k=0;
n=0;
for(j=0;j<c;j++)
{
a[n][j]=p[k];
k++;
}

n=c-1;
for(i=1;i<r;i++)
{
a[i][n]=p[k];
k++;
}

n=r-1;
for(j=c-2;j>=0;j--)
{
a[n][j]=p[k];
k++;
}

n=0;
for(i=r-2;i>=1;i--)
{
a[i][n]=p[k];
k++;
}

System.out.println("Your matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}

System.out.println("Your matrix:");
for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
   {
    f=0;
     for(m=0;m<k;m++)
      {
       if(a[i][j]==p[m])
        {
         f=1;
         break;
        }
      }
      if(f==1)
       System.out.print(a[i][j]+" ");
      else
       System.out.print("  ");
   }
   System.out.println(" ");
 }

for(i=0;i<k;i++)
{
sum=sum+p[i];
}
System.out.println("Sum: "+sum);
}
}