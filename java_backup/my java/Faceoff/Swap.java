import java.io.*;
class Swap
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        if(n<10)
        {
            System.out.println("Number Must be greater than or equal to 10");
            System.exit(0);
        }
            int p=n%10;
            int n1=n;
            int p1=0;
            while(n1>0)
            {
                p1=n1%10;
                n1=n1/10;
            }//End of while
            n1=0;
            while(n>0)
            {
                n1=(n1*10)+(n%10);
                n=n/10;
            }
            int s=0;
           //System.out.println(n1);
            while(n1>0)
            {
                int k=n1%10;
                if(k==p)
                s=(s*10)+p1;
                else
                if(k==p1)
                s=(s*10)+p;
                else
                s=(s*10)+k;
                n1=n1/10;
            }
            System.out.println(s);
            if(p1%p==0)
            System.out.println("Divisible");
            else
            System.out.println("Not Divisible");
            System.out.println(p1);
            System.out.println(p);
    }
}


        