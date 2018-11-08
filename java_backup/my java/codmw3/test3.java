import java.util.*;
public class test3
{
   Scanner sc=new Scanner(System.in);
   int a,b,c,d;
   void input()
   {
       System.out.println("Enter number");
       a=sc.nextInt();
   }
   void ch()
   {
       b=a;
       c=0;
       while(b>0)
       {
           c++;
           b=b/10;
        }
        d=0;
        b=a;
        pr(a);
    }
    void pr(int k)
    {
        if(k/100==0)
        {
            System.out.println(+k%10);
            return;
        }
        String s="";
        s+=k;
        k=k/(int)(Math.pow(10,s.length()-1));
        k=k*(-1);
        k=k%10;
        pr(k);
    }
}
        
        
           
    
   
        