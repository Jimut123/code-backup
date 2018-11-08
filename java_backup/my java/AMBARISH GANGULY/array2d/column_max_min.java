package array2d;


import java.io.*;
class column_max_min
{
 public static void main()throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,p,k,max,min;
System.out.print("Enter the size of the matrix:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.print("Enter the matrix elements:");
for(i=0;i<n;i++)
for (j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
 {for (j=0;j<n;j++)
      System.out.print(a[i][j]+",");
  System.out.println(" ");
}

for(p=0;p<n;p++)
 {
 max= a[0][p];
     min= a[0][p]; 
     for (k=0;k<n;k++)
   {
    
    if(a[k][p]>max)
     max=a[k][p];
 else if(a[k][p]<min)
      min=a[k][p];
    }
    System.out.println("Maximum element:"+max);
    System.out.println("Minimum element:"+min);
}
}
}