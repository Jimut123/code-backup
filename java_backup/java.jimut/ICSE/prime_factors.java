import java.io.*;
class prime_factors
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,n,j,d=0,k=0;
        System.out.println("Enter a number ::");
        n = Integer.parseInt(cd.readLine());
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                d=1;
            }
            if(d==1)
            {
                 for(j=2;j<i;j++)
                 {
                     if(i%j==0)
                     {
                         k=1;
                     }
                 }
                 if(k==0)
                 {
                     System.out.print(i+",");
                 }
                 k=0;
            }
                d=0;
            }
        }
    }