import java.io.*;
class program10
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int x,y,c=0,i,j,k,t,sr=0,sc=0;
  int a[][];
  int b[];
  
  void input()throws IOException
  {
      System.out.println("Enter the length of the matrix");
      x=Integer.parseInt(br.readLine()); 
      System.out.println("Enter the breadth of the matrix");
      y=Integer.parseInt(br.readLine());
      a=new int[x][y];
      b=new int[y];
      System.out.println("Enter the elements");
      for(i=0;i<x;i++)
      {
          for(j=0;j<y;j++)
          {
              a[i][j]=Integer.parseInt(br.readLine());
          }
          System.out.println();
      }
      
  }
  void print_matrix()
  {
      System.out.println("The original matrix is");
      for(i=0;i<x;i++)
      {
          for(int j=0;j<y;j++)
          {
             System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }
      System.out.println();
  }
  void sort()
  {
      for(i=0;i<x;i++)
      {
          for(j=0;j<y-1;j++)
          {
              for(k=j+1;k<y;k++)
              {
                  if(a[i][j]>a[i][k])
                  {
                      t=a[i][j];
                      a[i][j]=a[i][k];
                      a[i][k]=t;
                  }
              }
          }
      }
  }
  void sum()
  {
      for(i=0;i<x;i++)
      {
          for(j=0;j<y;j++)
          {
              sr=sr+a[i][j];
              System.out.print(a[i][j]+"  ");
          }
          System.out.print(+sr);
          System.out.println();
          
          sr=0;
         
      }
      for(j=0;j<y;j++)
      {
          for(i=0;i<x;i++)
          {
              sc=sc+a[i][j];
          }
          b[c]=sc;
          sc=0;
           c++;
      }
      for(i=0;i<c;i++)
      {
          System.out.print(b[i]+" ");
      }
  }
  public static void main(String args[])throws IOException
  {
      program10 p=new program10();
      p.input();
      p.print_matrix();
      p.sort();
      p.sum();
  }
}
        