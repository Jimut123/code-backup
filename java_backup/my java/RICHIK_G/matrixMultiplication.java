import java.util.*;
public class matrixMultiplication
{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    int n;
    int i=0;
    int j=0;
    System.out.println("Enter dimensions");
    n=sc.nextInt();
    int a[][]=new int [n][n];
    int b[][]=new int [n][n];
    int c[][]=new int [n][n];
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println("Enter data for array a in row"+i+"and column"+j);
            a[i][j]=sc.nextInt();
            System.out.println("Enter data for array b in row"+i+"and column"+j);
            b[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            c[i][j]=0;
            c[i][j]=c[i][j]+(a[i][j]*b[j][i]);
        }
    }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(c[i][j]);
            }
        }
      
    
    
}

}
            
