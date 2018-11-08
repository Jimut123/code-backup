package array2d;

import java.io.*;
class transpose
{
 public static void main()throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j;
System.out.print("Enter matrix elements:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(i=0;i<n;i++)
for (j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
 {for (j=0;j<n;j++)
      System.out.print(a[j][i]);
  System.out.println("");    
}
}
}