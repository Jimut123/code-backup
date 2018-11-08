import java.io.*;
public class prime
{
    public static void main (String ar[])throws IOException
    {
        BufferedReader br=new BufferedReader (
        new InputStreamReader (System.in));
        int i,j,f;
        for (i=1;i<=100;i++)
        {
            f=0;
            for (j=2;j<i;j++)
                        {
               
                
                if (i%j==0)
                {
                    f=1;
                    break;
                }
            }
                if (f==0)
                {
                    System.out.print ("Prime:"+i+" ");
                    for (j=1;j<=i;j++)
                    if (i%j==0)
                    {
                        System.out.print ("Factors are:"+j+",");
                    }
                    System.out.println ("");
                }
            }
        }
    }

            