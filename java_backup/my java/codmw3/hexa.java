import java.util.*;
public class hexa
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("ENter number");
        a=sc.nextInt();int n=0;
        int b,d=1,e;
        b=a;
        String c="",g="";
        while(b>0)
        {
            d=b%16;
            b=b/16;
            if(d==10)
            {
                c=c+'A';
            }
            else if(d==11)
            {
               c=c+'B';
            }
            else if(d==12)
            {
                c=c+'C';
            }
            else if(d==13)
            {
                c=c+'D';
            }
            else if(d==14)
            {
                c=c+'E';
            }
            else if(d==15)
            {
                c=c+'F';
            }
            else 
            {
                c=c+d;
            }
        }
        for(n=c.length()-1;n>=0;n=n-1)
        {
            System.out.println(c.charAt(n));
        }
    }
}
        