import java.io.*;
class smith_number
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        int N,n,d,s=0,s1=0,s2=0,i,s3=0,v;
        System.out.println("Enter a number:");
        N=Integer.parseInt(cd.readLine());
        n=N;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println(s);
        i=2;
        n=N;
        while(i<=n)
        {
            if(n%i==0)
            {
                n=n/i;
                int j=i;
                if(j>9)
                {
                    while(j>0)
                    {
                     d=j%10;
                    s1=s1+d;
                    j=j/10; 
                }
               }
                else
                {
                   s1=s1+i;
                }
                System.out.println(s1);
               continue;
             }
            else
            {
                i++;
            }
        }
        System.out.println(s1);
        if(s==s1)
        {
            System.out.println("So "+N+" is a SMITH NUMBER");
        }
        else
        {
            System.out.println("So "+N+" is not a SMITH NUMBER");
        }
    }
}
        
        