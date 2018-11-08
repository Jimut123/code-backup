import java.util.*;
public class binary_add
{
    void main()
    {
        Scanner sc=new Scanner(System.in); 
        String a,b;
        int c,d,h,cr,i;
        System.out.println("enter number 1");
        a=sc.nextLine();
        System.out.println("Enter number 2");
        b=sc.nextLine();
        c=a.length();
        d=b.length();
        int e[]=new int[c];
        int g[]=new int[d];
        for(h=c-1;h>=0;h=h-1)
        {
            if(a.charAt(h)=='1')
            {
                e[h]=1;
            }
            else
            {
                e[h]=0;
            }
            if(b.charAt(h)=='1')
            {
                g[h]=1;
            }
            else
            {
                g[h]=0;
            }
        }
        //for(i=0;i<e.length;i++)
        //System.out.println(e[i]);
        //for(i=0;i<g.length;i++)
        //System.out.println(g[i]);
        //int k[]=new int [c];
        cr=0;
       
        for(i=c-1;i>=0;i=i-1)
        {
           
                if(e[i]==1 && g[i]==1 && cr==1)
                {
                    System.out.print("1" );
                    cr=1;
                }
                else if(e[i]==0 && g[i]==1 && cr==1)
                {
                    cr=1;
                    System.out.print("0");
                }
                else if(e[i]==1 && g[i]==0 && cr==0)
                
                {
                    System.out.print("1");
                    cr=0;                    
            }
            else if(e[i]==0 && g[i]==1 && cr==0)
            {
                System.out.print("1");
                cr=0;
            }
            else if(e[i]==1 && g[i]==0 && cr==1)
            {
                cr=1;
                System.out.print("0");
            }
            else if(e[i]==0 && g[i]==0 && cr==0)
            {
                System.out.print("0");
            cr=0;
        }
        else
         if(e[i]==1 && g[i]==1 && cr==0)
                {
                    System.out.print("0" );
                    cr=1;
                }
                else
                 if(e[i]==0 && g[i]==0 && cr==1)
                {
                    System.out.print("1" );
                    cr=0;
                }
    }
        System.out.print(cr);
    }
}