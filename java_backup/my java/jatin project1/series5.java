import java.io.*;
class series5
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a;
                double s=0,i,k;
                k=1;
                   System.out.println("Enter number:");
                   a=Integer.parseInt(br.readLine());
                for(i=1;i<=10;i++)
                    {
               if(i==1)
                s=s+(i*k);
               else
               {
                   s=s+((a*a)/i)*k;
                }
                k=k*-1;
            }
                
                System.out.println(s);
            }
        }