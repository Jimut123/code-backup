package Apc;
import java.io.*;
class Apc_62_6
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i;
        for(i=0;i<=15;i++)
        {
        System.out.println("Enter your name : ");
        String name = cd.readLine();
        System.out.println("Enter your amount : ");
        int n = Integer.parseInt(cd.readLine());
        double d=0.0,neta=0.0;
        if(n>=70000)
        {
            d=0.18*n;
        }
        else if((n>=55001)&&(n<70000))
        {
            d=0.16*n;
        }
        else if((n>=35001)&&(n<=55000))
        {
            d=0.12*n;
        }
        else if((n>=25001)&&(n<=35000))
        {
            d=0.10*n;
        }
        else if(n<=25000)
        {
            d=0.02*n;
        }
        neta = (double)n-d;
        System.out.println("Sl.No.\t Name\t Ticket Charge\t Discount\t Net Amount ");
        System.out.println(i+"\t"+name+"\t\t"+n+"\t\t"+d+"\t\t"+neta);
      }
   }
}