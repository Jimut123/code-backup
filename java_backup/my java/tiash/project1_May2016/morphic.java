package project1_May2016;

//to check whethera number is automorphic or not,using functions
import java.io.*;
class morphic
{
    int digits(int m)
    {
        int c,p,k;c=0;k=0;
        while(m!=0)
        {
            k=m/10;
            c=c+1;
            m=k;
        }
        return(c);
    }
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,b,p;
        double r;
        r=0;
        morphic ob=new morphic();
        System.out.println("Enter your number");
        n=Integer.parseInt(br.readLine());
        m=n;
        p=m*m;
        b=ob.digits(n);
        r=p%(Math.pow(10,b));
        if(m==r)
        System.out.println("Automorphic number");
        else
         System.out.println("Non-automorphic number");
        }
    }