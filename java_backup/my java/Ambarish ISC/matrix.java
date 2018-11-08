import java.io.*;
class matrix
{
    int ar[][],m,n,i,j,s1=0,s=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
matrix()throws IOException
    {
    System.out.println("Enter the row");     
    m=Integer.parseInt(br.readLine());
    System.out.print("Enter the Column");
    n=Integer.parseInt(br.readLine()); 
        ar=new int [m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the elements");
                ar[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
    void get_mat()
    {

         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
            ar[i][j]=ar[i][j]+(i*i*i)+(j*j*j);
        }
    }
}
void show()
{
   for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      { 
      System.out.println(ar[i][j]); 
    }
}
}
void calculation()
{
   for(i=0;i<m;i++)
    {
        int f=0;
        for(j=2;j<n;j++)
         {
            if(ar[i][j]%j==0)
            {
                f=1;
                break;
            }
            if(f==0)
            {
                s1=s1+ar[i][j];
            }
            
        }
    }
   for(i=0;i<m-1;i++)
      {
        for(j=0;j<n-1;j++)
        {
            s=s+ar[i][j];
        }
    }
    System.out.println(s1+","+s);
}
public static void main()throws IOException
{
    
    
    matrix ob=new matrix();
    ob.get_mat();
    ob.show();
    ob.calculation();
}
}
/**
 * Enter the row
3
Enter the Column4
Enter the elements
1
Enter the elements
2
Enter the elements
3
Enter the elements
4
Enter the elements
5
Enter the elements
6
Enter the elements
7
Enter the elements
8
Enter the elements
9
Enter the elements
10
Enter the elements
11
Enter the elements
12
1
3
11
31
6
8
16
36
17
19
27
47
116,45

 */      