import java.io.*;
class special
{
    int n,n1,d,k,s=0,m,n2,n3,i,f=1,s1=0;
    special()
    {
        n=0;
    }
    special(int n1)
    {
        n=n1;
    }
    void sum()
    {
        n2=n;
        d=n2%10;
        while(n2!=0)
        {
            k=n2%10;
            s=s+1;
            n2=n2/10;
        }
        s=s-1;
        m=(int)Math.pow(10,(s));
        System.out.println(m);
        k=n/m;
        System.out.println("The first digit="+k);
        System.out.println("The last digit="+d);
    }
    void is_special()
    {
        n3=n;
        while(n3!=0)
        {
            k=n3%10;
            for(i=1;i<=k;i++)
            {
                f=f*i;
            }
            s1=s1+f;
            f=1;
            n3=n3/10;
        }
        if(s1==n)
        {
             System.out.println("The number is a special number");
        }
        else
        {
             System.out.println("The number is not a special number");
        }
    }
     public static void main(String args[])throws IOException
    {
     InputStreamReader ab = new InputStreamReader(System.in);
     BufferedReader cd = new BufferedReader(ab);
     int m1;
     System.out.println("Enter a number:");
     m1 = Integer.parseInt(cd.readLine());
     special ob = new special(m1);
     ob.sum();
     ob.is_special();
    }
}