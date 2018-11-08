import java.io.*;
class number5
{
    public static void main(int n)throws IOException
    {
        int i, j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        i=0;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            System.out.print("*");
            System.out.println("");
        }
    }
}
        
            
       