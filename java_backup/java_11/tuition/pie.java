import java.io.*;
class pie
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        int n=22;//n is the quotient 
        int m,s,i,d=7;//d is the divisor
        System.out.print("\f");
        while(n!=0)
        {
            if(n<10)
            {
             m=n*10;
             s=m/d;
             n=n*10;
             n=n%d;
             System.out.print(s);
            }
            else
            {
               m=n/d;
               n=n%d;
              System.out.print(m);
            }
            
           for(i=0;i<=2000000000;i++);
        }
}
}