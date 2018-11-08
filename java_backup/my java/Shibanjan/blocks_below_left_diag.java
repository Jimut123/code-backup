import java.io.*;
class blocks_below_left_diag
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int n=5;int c=0;
  
  int ar[][]=new int[n][n];
  void input()throws IOException
  {
      int i=1,j=0;
      System.out.println("fndjh");
      n=Integer.parseInt(br.readLine());
      ar=new int[n][n];
      insert(i,j,ar,n);
      
  }
  void insert(int i,int j,int ar,int n)
  {
      c=c+1;;
      if(c>=n)
      return;
      ar[i][j]=1;
      if(j==0)
      {
          insert(i+1,i,ar,n);
      }
      j=i-1;
      insert(i,j,ar,n);
      System.out.println("a");
  }
  public void main(int a,int n)throws IOException
  {
      blocks_below_left_diag d=new blocks_below_left_diag();
      d.input();
      System.out.println("B");
      for(int a=0;a<n;a++)
      {
          for(int b=0;b<n;b++)
          {
              System.out.print(ar[a][b]+" ");
          }
          System.out.println();
        }
    }
}