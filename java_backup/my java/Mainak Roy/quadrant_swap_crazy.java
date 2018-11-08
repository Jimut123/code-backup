import java.util.*;
public class quadrant_swap_crazy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter limit : ");
int n=sc.nextInt();
int a[][]=new int[n][n];
int bkc=n;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("row "+i+"column "+j+" : ");
a[i][j]=sc.nextInt();
}
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]<10)
{
System.out.print(" ");
}
System.out.print(" "+a[i][j]);
}
System.out.println();
}
System.out.println();
System.out.println();
int m=0;
if(n%2==0)
{
 m=n/2;

}
else
{
 m=n/2+1;

}
 for(int i=0;i<m;i++)
 {
 for(int j=0;j<m;j++)
 {
 int t=a[i][j];
 a[i][j]=a[m+i-1][m+j-1];
 a[m+i-1][m+j-1]=t;
 }
 }
int jik=bkc-1;
for(int i=0;i<n;i++)
{
for(int j=0;j<n/2-1;j++)
{
int gd=a[i][j];
a[i][j]=a[i][jik];
a[i][jik]=gd;
jik--;

System.out.println(jik);
}
}

for(int i=0;i<m;i++)
{
for(int j=0;j<m;j++)
{
int t=a[i][j];
a[i][j]=a[m+i-1][m+j-1];
a[m+i-1][m+j-1]=t;
}
}
jik=bkc-1;
for(int i=0;i<n;i++)
{
for(int j=0;j<n/2-1;j++)
{
int gd=a[i][j];
a[i][j]=a[i][jik];
a[i][jik]=gd;
jik--;
System.out.println(jik);
}
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]<10)
{
System.out.print(" ");
}
System.out.print(" "+a[i][j]);
}
System.out.println();
}
}
}

