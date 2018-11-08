import java.io.*;
class series6
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a;
                double s=0,i;
                
                   System.out.println("Enter number:");
                   a=Integer.parseInt(br.readLine());
                for(i=1;i<=10;i++)
                    {
                   s=s+(i/(a*a));
                }

                System.out.println(s);
            }
                
                
            }
     