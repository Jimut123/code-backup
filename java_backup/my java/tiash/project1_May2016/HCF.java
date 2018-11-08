package project1_May2016;

//To find the HCF of two numbers
import java.io.*;
class HCF
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,k=0;
        //input
        System.out.println("Enter values:");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        //checking of the loop
        while(a%b!=0)
        {
            k=a%b;
            a=b;
            b=k;
        }
        System.out.print("HCF is:"+b);
    }
}