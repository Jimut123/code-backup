/**Question number 2:

Write a program to declare a square matrix A[][] of order (MXN) where ‘M’ is the number of rows and the number of columns. ‘M’ should be greater than 2 and less than 20. Allow user to enter integers into this matrix. Display appropriate error message for an invalid input. Perform the following tasks.
1.    Display the input matrix
2.    Create a mirror image of the inputted matrix.
3.    Display the mirror image matrix

Sample:
Input: M=3
4  16  12
8   2  14
6   1   3

Output:

Original matrix
4  16  12
8   2  14
6   1   3

Mirror image matrix:
12  16  4
14  2    8
3   1    6

Sample 2:
Input M=22
Output: Size out of range

Solution of the program number 2*/


import java.io.*;
class isc2013Q_2
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int a[][];
   int i,j,m;
   public void show()throws Exception
   {
    System.out.println("Enter the number of rows:");
    m=Integer.parseInt(br.readLine());
    if(m<=2 || m>=20)
    {
        System.out.println("\nSize out of range:");
    return;
}

a=new int[m][m];
for(i=0;i< m;i++)
{
 for(j=0;j< m;j++)
 {
      
     System.out.println("Enter value:");
     a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("\nOriginal matrix\n");
for(i=0;i< m;i++)
{
 for(j=0;j< m;j++)
 {
      System.out.print(" "+a[i][j]);
    }
    System.out.println();
}
System.out.println("\nMirror image matrix\n");
for(i=0;i< m;i++)
{
 for(j=m-1;j>=0;j--)
 {
      System.out.print(" "+a[i][j]);
    }
    System.out.println();
}

     }
     public static void main(String args[]) throws Exception
     {
      isc2013Q_2 ob=new isc2013Q_2();
      ob.show();
      }
      }
