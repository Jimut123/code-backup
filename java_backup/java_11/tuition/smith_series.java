import java.io.*;
class smith_series
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        int N,n,s=0,d,i,j,v=0,n1,s1=0,s2=0,d1,g=0,b;
        for(b=665;b<=667;b++)
        {
        n=b;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        i=2;
        while(i<=n)
        {
            if(n%i==0)
            {
                n=n/i;
                s1=s1+i;
                continue;
             }
            else
            {
                i++;
            }
        }
        
        if(s2==s)
        {
            System.out.println("So "+b+" is a SMITH NUMBER");
        }
       
}
}
}
        
        