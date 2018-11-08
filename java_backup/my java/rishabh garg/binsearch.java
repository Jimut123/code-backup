import java.io.*;
class binsearch
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int a[]= new int [10];
        int f=0, l, u, m;
        u=a.length-1;
        l=0;
        System.out.println("Enter 10 elements:");
        for (int i=0; i<10; i++)
        {
             a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the no to be found");
        int val=Integer.parseInt(br.readLine());
        for (int i=0; i<a.length; i++)
        {
            m=(u+l)/2;
            if (a[m]==val)
            {
                f=1;
                System.out.print("Value found at " +i);
                break;
            }
            else
            {
                if(val>a[m])
                l=m+1;
                else
                u=m-1;
            }
        }
        if(f==0)
        {
            System.out.print("Nosuch element found");
        }
    }
}
            
        