//Pre_board_Question_2
import java.io.*;
class Pre_board_Question_2_Matrix
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int M,N,i,max,min,j,q=0,w=0,e=0,r=0,c=0,t;
        System.out.println("Enter the number of rows and columns in the matrix : ");
        M=Integer.parseInt(cd.readLine());
        N=Integer.parseInt(cd.readLine());
        int a[][]=new int[M][N];
        if(((M>2)&&(M<20))&&((N>2)&&(N<20)))
        {
             System.out.println("Enter the elements of the matrix : ");
             for(i=0;i<M;i++)
             {
                 for(j=0;j<N;j++)
                 {
                     a[i][j]=Integer.parseInt(cd.readLine());
                    }
                }
             System.out.println("ORIGINAL MATRIX :");   
             for(i=0;i<M;i++)
             {
                 for(j=0;j<N;j++)
                 {
                      System.out.print(a[i][j]+"\t");
                    }
                 System.out.println();
             }
             max=a[0][0];
             min=a[0][0];
             for(i=0;i<M;i++)
             {
                 for(j=0;j<N;j++)
                 {
                      if(a[i][j]>max)
                      {
                          max=a[i][j];
                          q=i;
                          w=j;
                       }
                      if(a[i][j]<min)
                      {
                          min=a[i][j];
                          e=i;
                          r=j;
                       }
                    }
             }
             System.out.println("LARGEST NUMBER : "+max+" ROW INDEX = "+q+" COLUMN INDEX = "+w);
             System.out.println("SMALLEST NUMBER : "+min+" ROW INDEX = "+e+" COLUMN INDEX = "+r);
             int a1[]=new int[M*N];
             c=0;
             for(i=0;i<M;i++)
             {
                 for(j=0;j<N;j++)
                 {
                     a1[c]=a[i][j];
                     c++;
                    }
                }
             for(i=0;i<c-1;i++)
             {
                 min=i;
                 for(j=i+1;j<c;j++)
                 {
                     if(a1[min]>a1[j])
                     {
                         min=j;
                        }
                  }
                 t=a1[i];
                 a1[i]=a1[min];
                 a1[min]=t;
                }
                c=0;
             for(i=0;i<M;i++)
             {
                 for(j=0;j<N;j++)
                 {
                     a[i][j]=a1[c];
                     c++;
                    }
                }
             System.out.println("REARRANGED MATRIX :");   
             for(i=0;i<M;i++)
             {
                 for(j=0;j<N;j++)
                 {
                      System.out.print(a[i][j]+"\t");
                    }
                 System.out.println();
             }
        }
        else
        {
            System.out.println("SIZE OUT OF RANGE ");
        }
    }
}