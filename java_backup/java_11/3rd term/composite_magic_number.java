import java.io.*;
class composite_magic_number
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,s=0,n,s1,n1,d1;
        System.out.println("Enter a number:");
        n=Integer.parseInt(cd.readLine());
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            s=s+1;
        }
        n1=n;
        if(s>0)
        {
            s1=n1;
            while(s1>9)
            {
                n1=s1;
                s1=0;
                while(n1!=0)
                {
                    d1=n1%10;
                    s1=s1+d1;
                    n1=n1/10;
                }
            }
            if(s1==1)
            {
                System.out.println("Composite magic number.");
            }
        }
        else
        {
            System.out.println("Not a composite magic number.");
        }
    }
}