import java.io.*;
class Pattern_1
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int s=0;
        while(n>0)
        {
            int k=n%10;
            s=(s*10)+k;
            n=n/10;
        }
        int s1=s;
        int c=0;
        while(s1>0)
        {
           c++;
           s1=s1/10;
        }
           int i=1;
           while(i<=c)
           {
               s1=s;int j=1;
               while(j<=i)
               {
                   System.out.print(s1%10+" ");
                   s1=s1/10;
                   j=j+1;
                }
                System.out.println("");
                i++;
            }
        }
    }


        