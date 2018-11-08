//program to find of two series-a)sum=2-4+6-8.....-20
//                              b)sum=x/2+x/5+x/8+x/11....x/20  
import java.io.*;
class menudriven
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch,sum,i,a;
        System.out.println("\n1:a)sum=2-4+6-8.....-20 \n2:b)sum=x/2+x/5+x/8+x/11....x/20");
        System.out.println("enter your choice");
        ch=Integer.parseInt(br.readLine());
        switch (ch)
        {
            case 1:
            a=2;
            sum=0;
            while (a<=20)
            {
                sum=sum + a;
                if (a>0)
                {
                    a=a*(-1);
                    a=a-2;
                }
                else if (a<0)
                {
                    a=a*(-1);
                    a=a+2;
                }
            }
            System.out.println("the sum of the series is:"+sum);
            break;
            case 2:
            a=2;
            double s=0;
            System.out.println("givethe value of x");
            int x=Integer.parseInt(br.readLine());
            while (a<=20)
            {
                s=s + x/a;
                a=a + 3;
            }
            System.out.println("the sum of the series is:"+s);
            break;
            default: 
            System.out.println("incorrect selection");
        }
    }
}