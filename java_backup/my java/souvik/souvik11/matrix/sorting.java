package souvik11.matrix;

import java.io.*;
class sorting
{public static void main()throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,t=0,k;
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
for(k=0;k<n;k++)
{   
for(i=0;i<n;i++)
  {
    for(j=i+1;j<n-1;j++)
    if(a[k][i]>a[k][j])
    { 
        t=a[k][i];
        a[k][i]=a[k][j];
        a[k][j]=t;
        
}
}
}
for(i=0;i<n;i++)
 {for (j=0;j<n;j++)
      System.out.print(a[i][j]+",");
  System.out.println(" ");
}  
}
}
