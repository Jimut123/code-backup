package project1_May2016;

//To print prime numbers between 1 and 100
import java.io.*;
class primerange
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,f=0;
        //input
        System.out.println("Prime numbers are:");
        
        for(i=1;i<=100;i++)
        {
            f=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            System.out.print(i+",");
        }
    }
}
        
        
