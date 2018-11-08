package Rounak_practical_test;
import java.io.*;
import java.lang.*;
class perfectno
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,k,lim,s1=0;
       
        System.out.println("Enter a number:");
        lim =Integer.parseInt(cd.readLine());
        
        
        for(i=1;i<lim;i++)
        {
        
        {
            
            
            if((lim % i) == 0)
            {
                s1=s1+i;
                
            }
        
        }
    }
            
            if(s1==lim)
            {
                System.out.println("perfect number");
            }
            else
            {
                System.out.println("not perfect no");
            }
        
    }
}
            



