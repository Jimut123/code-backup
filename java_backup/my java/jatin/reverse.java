import java.io.*;
class reverse
    {
        int k,s;
       InputStreamReader ISR=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ISR);
       void input()throws IOException
        {
            int n,d;
            n=Integer.parseInt(br.readLine());
            d=reverse(n);
            System.out.print("reverse"+d);
        }
        int reverse(int n)
            {
                while(n>0)
                    {
                        k=n%10;
                        s=(s*10)+k;
                        n=n/10;
                        
                    }
                    return(s);
                }
            }
                        