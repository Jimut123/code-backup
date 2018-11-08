import java.io.*;
class series9
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a,b;
                
                double s=0,i;
                
                System.out.println("Enter a:");
                  a=Integer.parseInt(br.readLine());
                   System.out.println("Enter b:");
                   b=Integer.parseInt(br.readLine());
                  
                for(i=1;i<=10;i++)
                    {
               s=s+(Math.pow(a,i))/(Math.pow(b,i));
            }
                
                System.out.println(s);
            }
        }