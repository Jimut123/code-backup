import java.io.*;
class spiral_matrix_generator
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s,i=0,j=0,n1,c=0,l;
        System.out.println("Enter a number 'greater than 2 ':");
        n=Integer.parseInt(cd.readLine());
        s=n;
        n1=n*n;
        int a[][]=new int[n][n];
        while(s!=0)
        {
            c++;
            while(j<s)
            {
               
                a[i][j]=n1--;
                j++;
                
            }
            j--;
            i++;
            while(i<s)
            {
                
             
                a[i][j]=n1--;
                i++;
                
            }
            i--;
            j--;
            while(j>=(c-1))
            {
                
                
                a[i][j]=n1--;
                j--;
                
               
            }
            j++;
            i--;
            while(i>=c)
            {
                
                 
                a[i][j]=n1--;
                i--;
                
                
            }
            i++;
            j++;
            s--;
        }
         for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        