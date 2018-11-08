import java.util.*;
public class combination
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,d=0,m,b;
        
        int j;
        System.out.println("Enter Number");
        a=sc.nextInt();
      m=0;
       System.out.println();
        for(b=0;b<=(Math.pow(2,a))-1;b=b+1)
        {
            c=b;
            d=2;
            if(b==0)
            {
                for(j=0;j<a;j=j+1)
            {
            System.out.print("0");
            }
            }
           
            while(c>0)
            {
                d=(d*10)+(c%2);
                c=c/2;
                m=m+1;
            }
            if(b!=0)
            {
                for(j=1;j<=a-m+1;j=j+1)
                {
                System.out.print("0");
            }
        }
            while(d>0)
            {
                if(d%10==0)
                {
                    System.out.print("0");
                }
                else if(d%10==1)
                {
                    System.out.print("1");
                }
                else if(d%10==2)
                {
                    break;
                }
                d=d/10;
            }
            System.out.println();
            m=1;
        }
    }
}
        
                
            
            
       