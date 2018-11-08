package practical;

import java.io.*;
class saddle
{
public static void main(String args[])throws IOException
{
int a[][]=new int[100][100];
int i,j,n,max,min,p1=0,q,p2=0,m,g,p,f;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length of matrix:");
n=Integer.parseInt(input.readLine());

System.out.println("Enter no. into ("+n+"*"+n+") matrix:");
g=1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("("+g+") Enter no.:");
a[i][j]=Integer.parseInt(input.readLine());
g++;
    }
}
System.out.println("Your matrix :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
    }
    System.out.println();
}

f=0;
for(i=0;i<n;i++)
{
p=0;
min=a[i][0];
for(j=0;j<n;j++)
{
q=a[i][j];
if(q<min)
{
min=q;
p1=j;
    }
}

max=0;
for(m=0;m<n;m++)
{
q=a[m][p1];
if(q>max)
{
max=q;
p2=m;
    }
}
System.out.println(max+","+min);
    if(max==min)
    {
        f=1;
        System.out.println("SADDLE :"+max+" found in ("+p2+","+p1+")");
    }
    }
    if(f==0)
    {
        System.out.println("NO SADDLEPOINT");
    }
    }
}