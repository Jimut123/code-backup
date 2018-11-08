package souvik11.matrix;



import java.io.*;
class row_max_min
{
 public static void main()throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,p,k,max,min;
System.out.print("Enter the size of the matrix:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.print("Enter the matrix elements");
for(i=0;i<n;i++)
for (j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
 {for (j=0;j<n;j++)
      System.out.print(a[i][j]);
  System.out.println(" ");
}

for(p=0;p<n;p++)
 {
     max= a[p][0];
min= a[p][0];
     for (k=0;k<n;k++)
     {
     if(a[p][k]>max)
     max=a[p][k];
 else if(a[p][k]<min)
      min=a[p][k];
    }
    System.out.println("Maximum element:"+max);
    System.out.println("Minimum element:"+min);
}
}
}