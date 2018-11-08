// not working for 98
// check the recursive function for fibonacci series
import java.io.*;
class  palindrome_15_steps
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s=0,d,k,c=0,d1=0,n1,p=0;
        System.out.println("Enter the number:");
        n=Integer.parseInt(cd.readLine());
        k=n;
        n1=n;
        while(k!=0)
        {
            d=k%10;
            s=s+1;
            k=k/10;
        }
        k=n;
        if(s<2)
        {
            System.out.println("Enter a number more than 1 digit:");
        }
        else
        {
            while(c!=15)
            {
                c++;
                s=0;
                n1=n;
                
                while(n!=0)
                {
                     d=n%10;
                     s=s*10+d;
                     n=n/10;
                }
                p=n1+s;
               
                n=p;
                if(n1==s)
                {
                     d1=1;
                    break;
                 }
              }
            System.out.println("The initial number ="+k+" the palindrome number:"+n1);
            if(d1==1)
            {
                System.out.println(" Palindrome number found upto "+c+"steps.");
            }
            else
            {
                System.out.println(" No Palindrome number found upto 15 steps.");
            }
        }
    }
}
