import java.io.*;
class prime_nos_between
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,n,j,d=0;
        System.out.println("Enter a number ::");
        n = Integer.parseInt(cd.readLine());
        for(i=1;i<n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    d=1;
                }
            }
                if(d==0)
                {
                    System.out.print(i+",");
                }
                d=0;
            }
        }
    }