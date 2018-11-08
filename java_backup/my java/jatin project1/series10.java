import java.io.*;
class series10
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a,b,n,j;
                
                double s=0,i;
                
                j=2;
                System.out.println("Enter n:");
                  n=Integer.parseInt(br.readLine());
                System.out.println("Enter a:");
                  a=Integer.parseInt(br.readLine());
                   System.out.println("Enter b:");
                   b=Integer.parseInt(br.readLine());
                  
                for(i=1;i<=n;i++)
                    {
               s=s+(Math.pow((a+b),j))/j;
               j=j+1;
            }
                
                System.out.println(s);
            }
        }