/*Program number 3 of 2012 ISC computer science practical paper

Write a program to declare a matrix A [][] of order (MXN) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 20. Allow the user to input integers into this matrix. Perform the following tasks on the matrix:

Display the input matrix

Find the maximum and minimum value in the matrix and display them along with their position.

Sort the elements of the matrix in ascending order using any standard sorting technique and rearrange them in the matrix.

Output the rearranged matrix.


Sample input Output

INPUT: 
M=3
N=4

Entered values: 8,7,9,3,-2,0,4,5,1,3,6,-4


Original matrix:


8  7  9  3
-2  0  4  5
1  3  6  -4


Largest Number: 9
Row: 0
Column: 2
Smallest Number: -4
Row=2
Column=3

Rearranged matrix:

-4  -2  0  1
3  3  4  5
6  7  8  9**/


import java.io.*;
class Matrixmult3Q_3_2013
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int arr[][];
   int r,c,max,min,maxi,maxj,mini,minj,i,j,m,n;
    public void take()throws Exception
   {
       boolean bool=true;
       while(bool)
       {
       System.out.println("\nEnter the number of rows:");
       r=Integer.parseInt(br.readLine());
        System.out.println("\nEnter the number of columns:");
       c=Integer.parseInt(br.readLine());
       if(r < 2 || c < 2 || r > 20 || c > 20)
        bool=true;
        else
        bool=false;
    }
    arr=new int[r][c];
    for(i=0;i <  r;i++)
    {
        for(j=0;j < c;j++)
        {
             System.out.println("\nEnter Value:");
             arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        max=arr[0][0];
        min=arr[0][0];
        maxi=0;
        mini=0;
        maxj=0;
        minj=0;
        for(i=0;i < r;i++)
        {
             for(j=0;j< c;j++)
             {
                 if(arr[i][j]> max)
                 {
                     max=arr[i][j];
                     maxi=i;
                     maxj=j;
                    }
                    else if(arr[i][j]<  min)
                    {
                         mini=i;
                         minj=j;
                         min=arr[i][j];
                        }
                    }
                }
                 System.out.println("\nOriginal Array\n");
                 for(i=0;i< r;i++)
                 {
                      for(j=0;j< c;j++)
                      {
                           System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                    }
                
                System.out.println("\nMaximum Value="+max);
               System.out.println("\nRow="+maxi);
              System.out.println("\nColumn="+maxj);
              System.out.println("\nMinimum Value="+min);
               System.out.println("\nRow="+mini);
              System.out.println("\nColumn="+minj);
              
              for(m=0;m< r;m++)
              {
                  for(n=0;n< c;n++)
                  {
                  for(i=0;i< r;i++)
                  {
                       for(j=0;j< c;j++)
                       {
                            if(arr[m][n]< arr[i][j])
                            {
                                 min=arr[m][n];
                                 arr[m][n]=arr[i][j];
                                 arr[i][j]=min;
                                }
                            }
                        }
                    }
                }
                     System.out.println("\nSorted Array\n");
                 for(i=0;i< r;i++)
                 {
                      for(j=0;j< c;j++)
                      {
                           System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                    }
      
        }
                public static void main(String args[]) throws Exception
                {
                     Matrixmult3Q_3_2013 ob=new Matrixmult3Q_3_2013();
                     ob.take();
                    }
                }
