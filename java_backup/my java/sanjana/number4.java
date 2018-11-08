import java.io.*;
class number4
{
    public static void main (int n)throws IOException
    {
        int i, j; 
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a number");
        for (i=5; i>=1; i--)
        {
            for (j=1; j<=i; j++)
            System.out.print(j);
            System.out.println("");
        }
    }
}
            
        
            
            
        
        