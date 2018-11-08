//pascal's triangle
import java.io.*;
class Pascal
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void triangle()throws IOException
 {
  int i,n,j,up=0,lft=0,s=0,r=0,c=0;
  System.out.println("enter no. of rows");
   n=Integer.parseInt(br.readLine());
   int a[][]=new int[n][n];
   a[0][0]=1;
   for(i=0;i<n;i++)
   {
          for(j=0;j<=i;j++)
          {
             if (i>0)
              r=i-1;
             if (j>0)
              c=j-1;
             up=a[r][j];
             lft=a[r][c];
             if (i<1 || j<1)
              lft=0;
             s=up+lft;
             a[i][j]=s;
             up=0;
             lft=0;
           }
      }
      show(a,n);
   }
   public void show(int a[][],int n)
   {
         int i,j;
         for(i=0;i<n;i++)
         {
                for(j=0;j<=i;j++)
                {
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                  }
                  System.out.println("");
             }
      }
}      
      
             
             
             
   
  