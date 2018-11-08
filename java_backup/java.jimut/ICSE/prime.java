import java.io.*;
class prime
{
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    int m,n,i,d=0,j;
    boolean b;
    void input()throws IOException
    {
        System.out.println("Enter m(m is less than n):");
        m = Integer.parseInt(cd.readLine());
        System.out.println("Enter n:");
        n = Integer.parseInt(cd.readLine());
    }
    boolean isprime(int x)
    {
        for(i=2;i<x;i++)
        {
            if((x%i)==0)
            {
                d=1;
            }
        }
        if(d==1)
        {
           b = false;
        }
        else if(d==0)
        {
            b = true;
        }
        return(b);
    }
    void twinprime()
    {
        for(j=m;j<=(n-2);j=j+2)
        {
           if((((isprime(j)) == true)&&(isprime(j+2)) == true))
            {
                System.out.print(j+" "+(j+2)+" "+","+" ");
            }
            d=0;
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        prime  ob = new prime();
        ob.input();
        ob.twinprime();
    }
}
    
    
    
    
    
    
    
    
    
    