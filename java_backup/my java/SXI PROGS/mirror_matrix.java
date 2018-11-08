 import java.io.*;
class mirror_matrix
{     
public static void main()throws IOException    
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no.of rows and columns");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
int ar[][]=new int[m][n];
int i,j,k,temp;
//creation of the first matrix
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
    System.out.println("Enter the elements for the matrix");
    ar[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println(" The Original matrix");
System.out.println();
System.out.println();
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
    System.out.print(ar[i][j]);
}
System.out.println();
}
//to create the mirror image of the matix
int mid=n/2;
for(i=0;i<m;i++)
{
    k=n-1;
    for(j=0;j<mid;j++)
    {
        temp=ar[i][j];
        ar[i][j]=ar[i][k];
        ar[i][k]=temp;
        k=k-1;
    }
}
System.out.println();
System.out.println();
System.out.println("The mirror matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
    System.out.print(ar[i][j]+"\t");
}
System.out.println();
}
}
}
/**
 * Enter the no.of rows and columns
3
3
Enter the elements for the matrix
1
Enter the elements for the matrix
2
Enter the elements for the matrix
3
Enter the elements for the matrix
4
Enter the elements for the matrix
5
Enter the elements for the matrix
6
Enter the elements for the matrix
7
Enter the elements for the matrix
8
Enter the elements for the matrix
9
 The Original matrix


123
456
789


The mirror matrix is
3	2	1	
6	5	4	
9	8	7Enter the no.of rows and columns
3
3
Enter the elements for the matrix
1
Enter the elements for the matrix
2
Enter the elements for the matrix
3
Enter the elements for the matrix
4
Enter the elements for the matrix
5
Enter the elements for the matrix
6
Enter the elements for the matrix
7
Enter the elements for the matrix
8
Enter the elements for the matrix
9
 The Original matrix


123
456
789


The mirror matrix is
3	2	1	
6	5	4	
9	8	7
 */