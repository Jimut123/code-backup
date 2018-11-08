

import java.io.*;
class sumofelementsaboveandbelowmaindiagonal
{
public static void main(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int[n][n];
int i,j,s1=0,s2=0;
System.out.println("give elements:");
for(i=0;i<n;i++)
for(j=0;j<n;j++)


System.out.println("");

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+", ");
System.out.println("");
}
System.out.println("");
System.out.println("sum of elements above the principle diagonal");
for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
s1=s1+a[i][j];
System.out.println(s1);
System.out.println("");
System.out.println("sum of elements below the principle diagonal");
for(i=0;i<n;i++)
for(j=0;j<i;j++)
s2=s2+a[i][j];
System.out.println(s2);
}
}

