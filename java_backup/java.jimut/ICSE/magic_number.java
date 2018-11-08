import java.io.*;
class magic_number
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s,d;
        System.out.println("Enter a number to check whether it is a magic number or not::");
        n = Integer.parseInt(cd.readLine());
        s=n;
         while(s>9)
         {
             n=s;
             s=0;
            
           while(n!=0)
            {
                d=n%10;
                s=s+d;
                n=n/10;
            }
        }
            if(s==1)
            { 
                System.out.println("Magic number.");
            }
            else
            {
                System.out.println("Not a Magic number.");
            }
         }
        }