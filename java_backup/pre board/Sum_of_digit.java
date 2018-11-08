import java.io.*;
class Sum_of_digit
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int m,n,i,n1,d,s=0,j,v=0;
        System.out.println("Enter the numbers m and n :");
        m=Integer.parseInt(cd.readLine());
        n=Integer.parseInt(cd.readLine());
        if((m>=3000)||(n>=3000)||(m>n))
        {
            System.out.println("m should be less than n and m and n < 3000.");
        }
        else
        {
            for(i=m;i<=n;i++)
            {
                n1=i;
                while(n1!=0)
                {
                    d=n1%10;
                    s=s+d;
                    n1=n1/10;
                }
                for(j=2;j<s;j++)
                {
                    if(s%j==0)
                    v=1;
                }
                if(v==0)
                {
                    System.out.println("The sum is : "+s+" and the number is : "+i);
                }
                v=0;
                s=0;
            }
        }
    }
}