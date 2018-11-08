package project1_May2016;

//To check whether a number is duck or not
import java.io.*;
class duck
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,k=0;
        //input
        System.out.print("Enter value:");
        n=Integer.parseInt(br.readLine());
        int f=0;
        //checking of the loop
        while(n>0)
        {
            k=n%10;
            if(k==0)
            {
                f=1;
                break;
            }
            n=n/10;
        }
        if(f==1)
         System.out.print("duck number");
         else
        System.out.print("non-duck number");
    }
}
        