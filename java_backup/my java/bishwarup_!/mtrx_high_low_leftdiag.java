 

import java.io.*;
class mtrx_high_low_leftdiag
{
public static void main(String args[]) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("give matrix limit");
int n=Integer.parseInt(br.readLine());
int a[][]=new int [n][n];
int above[]=new int [100];
int below[]=new int [100];
int i,j,c=1,t1,t2,max,min;
t1=t2=0;
System.out.println("give the elements");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("("+c+") ");
a[i][j]=Integer.parseInt(br.readLine());
c++;
}
}
System.out.println("");
System.out.println("your matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+", ");
System.out.println("");
}
System.out.println("");

System.out.println("above the left diagonal");
for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
{
System.out.print(a[i][j]+", ");
above[t1]=a[i][j];
t1++;
}
System.out.println("");
max=min=above[0];
for(i=0;i<t1;i++)
{
if(above[i]>max)
max=above[i];
else
if(above[i]<min)
min=above[i];
}
System.out.println("highest: "+max);
System.out.println("lowest: "+min);
System.out.println("");

System.out.println("below the left diagonal");
for(i=0;i<n;i++)
for(j=0;j<i;j++)
{
System.out.print(a[i][j]+", ");
below[t2]=a[i][j];
t2++;
}
System.out.println("");
max=min=below[0];
for(i=0;i<t2;i++)
{
if(below[i]>max)
max=below[i];
else
if(below[i]<min)
min=below[i];
}
System.out.println("highest: "+max);
System.out.println("lowest: "+min);
System.out.println("");
System.out.println("'''THANK YOU'''");
}
}
