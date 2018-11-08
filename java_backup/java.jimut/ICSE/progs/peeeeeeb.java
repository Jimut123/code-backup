package progs;
import java.io.*;
class peeeeeeb
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd  = new BufferedReader(ab);
        int min,i,j,t;
        int m[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for(i=0;i<10;i++)
        {
            System.out.println("ENTER THE"+(i+1)+"th ELEMENT NUMBERS:");
            m[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<=8;i++)
        {
            min=i;
        for(j=i+1;j<=9;j++)
        {
            if(m[min]>m[j])
            {
                min=j;
            }
        }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
        
        }
        System.out.println("TEN SORTED NUMBERS ARE:");
         for(i=0;i<10;i++)
        {
            System.out.println(m[i]);
        }
    }
}