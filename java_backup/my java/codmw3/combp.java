import java.util.*;
public class combp
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,d=0,fl=0,g=0,cc=0,m=0,h;
        
        System.out.println("Enter Number");
        a=sc.nextInt();
        c=a;
        while(c>0)
        {
            d=d+1;
            fl=0;
            for(b=1;b<(c%10)/2;b=b+1)
            {
                if((c%10)/2==0)
                {
                    fl=0;
                }
                else
                {
                    fl=1;
                }
            }
            if(fl==1)
            {
                System.out.println(+c%10);
            }
        }
        c=a;
        g=0;
        h=0;
        cc=0;
        m=0;
    while(b>0)
    {
     cc=cc+1;   
     m=0;  
     c=a;
       while(c>0)
       {
           m=m+1;
           if(m!=cc)
           {
               g=b%10;
           g=(g*10)+c%10;
           System.out.println(+g);
        }
        c=c/10;
    }
    b=b/10;
    }
    }
}
   
   
           
           
                        