import java.io.*;
class series8
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a,n;
                
                double s=0,k,i;
                System.out.println("Enter limit:");
                   n=Integer.parseInt(br.readLine());
                   System.out.println("Enter a:");
                   a=Integer.parseInt(br.readLine());
                   k=2;
                for(i=1;i<=n;i++)
                    {
               s=s+(Math.pow((i+1),a))/(a+i);
            }
                
                System.out.println(s);
            }
        }