import java.io.*;
class number1
{
    public static void main(int n)throws IOException
    {
        int i,f;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        f=1;
        for (i=1; i<=n; i++)
        {
            f=f*i;
            
        }
        System.out.println(f);
    }
}

            
        