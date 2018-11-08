import java.util.*;
public class con1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        
        int a,c,d,e,g,fl,b,fl2=0;
        fl=0;
        System.out.println("Enter number");
        a=sc.nextInt();
        
       b=a;
       c=a;
       e=0;
       while(b>0)
       {
           d=b%10;
           e=e+1;
           g=0;
           c=a;
           fl=0;
           fl2=1;
           while(c>0)
           {
               g=g+1;
           if(d-c%10==1 || d-c%10== -1)
           {
               fl=1;
               
               
            }
            else if(d-c%10==0 && e!=g)
            {
                fl=0;
            }
            else if(fl==0 && d-c%10!=1)
            {
                fl=0;
            }
           c=c/10;
        }
        if(fl==0)
        {
        System.out.println("Digits are not consecutive ");
        break;
        }
        b=b/10;
   }
   if(fl==1)
   {
       System.out.println("Digits are  consecutive");
    }
}
}
        
        
        