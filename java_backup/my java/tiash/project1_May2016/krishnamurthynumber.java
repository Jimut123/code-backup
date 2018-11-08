package project1_May2016;

//To check whether a number is krishnamurthy or not
import java.io.*;
class krishnamurthynumber
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,n1=0,f,s,k,j;
        //input
        System.out.println("enter data:");
        n=Integer.parseInt(br.readLine());
        n1=n;
        s=0;
        //checking of the loop
        while(n1>0)
        {
            k=n1%10;
            f=1;
            for( j=1;j<=k;j++)
            {
                f=f*j;
            }
                s=s+f;
                n1=n1/10;
            }  
            if(s==n)
            System.out.print("krishnamurthy number");
            else
            System.out.print("non-krishnamurthy number");
        }
    }

            