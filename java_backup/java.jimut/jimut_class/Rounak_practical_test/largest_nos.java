package Rounak_practical_test;
import java.io.*;
class largest_nos
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,max=0;
        
        
        
        int n[]=new int[10];
        System.out.println("Enter list of 10 nos:");
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter the"+i+"number::");
            n[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<=9;i++)
        {
            if(n[i]>max)
            {
                max = n[i];
            }
        }
        System.out.println("Largest number is::"+max);
        
    }
}