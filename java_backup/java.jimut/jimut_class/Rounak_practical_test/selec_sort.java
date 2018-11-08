package Rounak_practical_test;
import java.io.*;
class selec_sort
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,j,t,min;
        int m[]=new int[35];
        for(i=0;i<35;i++)
        {
            System.out.println("Enter the numbers:");
            m[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<34;i++)
        {
            min = i;
            for(j=i+1;j<35;j++)
            {
            if(m[j]<m[min])
            {
                min=j;
            }
            t = m[i];
            m[i] = m[min];
            m[min]=t;
        }
    }
     System.out.println("Second largest number is::"+m[33]);
}
}
