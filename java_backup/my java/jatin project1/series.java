import java.io.*;
class series
    {
        public static void main()throws IOException
            {
                int i,s=0,x;
                InputStreamReader ISR=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(ISR);
                x=Integer.parseInt(br.readLine());
                int k=1;
                for(i=1;i<=6;i++)
                    {
                        int f=1,j;
                        for(j=1;j<=i;j++)
                            {
                                f=f*j;
                            }
                            s=s+((((int)Math.pow(x,i))/f)*k);
                            k=k*-1;
                        }
                        System.out.print("Result:"+s);
                    }
                }
                