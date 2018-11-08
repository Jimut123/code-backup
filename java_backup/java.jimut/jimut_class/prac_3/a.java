package prac_3;

import java.io.*;
class a
{
    
        void num(int n)throws IOException
        {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial="+f);
       }



    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter a number for times of factorial you will do::");
        int d = Integer.parseInt(cd.readLine());
        for(int l=1;l<=d;l++)
        {
            a ob = new a();
            System.out.println("Enter a number for factorial you will do::");
            int d1 = Integer.parseInt(cd.readLine());
            ob.num(d1);
        }
    }
}
    
            