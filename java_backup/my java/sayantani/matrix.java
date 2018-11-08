import java.io.*;
class matrix
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int s=0;
 void input()throws IOException
 {
  int i,j,n;
  System.out.println("enter no. of rows/columns of matrix");
   n=Integer.parseInt(br.readLine());
  int a[][]=new int[n][n];
  for(i=0;i<n;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.println("enter a no.");
     a[i][j]=Integer.parseInt(br.readLine());
   }
  }
   diagonal(a,n);
 }
 
  void diagonal(int a[][],int n)
  {
   int i,j,s=0;
   for(i=0;i<n;i++)
   {
    for(j=0;j<n;j++)
    {
     if (i==j)
       s=sum(a,i,n);
    }
   }
    System.out.println("sum of diagonal elements="+s);
  }
  
   int sum(int a[][],int i,int n)
   {
   
    if (a[i][i]!=a[i][n-1-i])
         s= s + a[i][i] + a[i][n-1-i];
    else
         s= s + a[i][i];
     
    return s;
   }
}   