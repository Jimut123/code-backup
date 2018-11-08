import java.io.*;
class Keith_number
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int d,a,k=2,s=0,n,i,f=0;
        System.out.println("Enter the no. : ");
        a=Integer.parseInt(cd.readLine());
        n=a;
        int ar[]=new int[3];
        while(a>0)
        {
            d=a%10;
            ar[k--]=d;
            a=a/10;
        }
        for( i=0;i<3;i++)
        {
            System.out.println(ar[i]);
        }
                
        while(s<=n)
        {
            s=0;
            for(i=0;i<3;i++)
            {
                s=s+ar[i];
            }
            if(s==n)
            {
                f=1;
                break;
            }
            else
            {
                for(i=0;i<2;i++)
                {
                    ar[i]=ar[i+1];
                }
                ar[i]=s;
            }
        }
        if(f==1)
        {
             System.out.println("It is a keith no. ");
        }
        else
        {
            System.out.println("It is not a keith no. ");
        }
    }
}