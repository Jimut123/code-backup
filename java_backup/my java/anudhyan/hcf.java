import java.util.*;
class hcf
{
    int a,b,c,k;
    Scanner ob=new Scanner(System.in);
    hcf(int x,int y)
    {
        a=x;b=y;
        calc(a,b);
    }
        
            void calc(int a,int b)
            {
                while(a%b!=0)
                {
                    k=a%b;
                    a=b;
                    b=k;
                }
                System.out.println(b);
            }
                public static void  main()
                {
                   int x,y;
                   Scanner ob=new Scanner(System.in);
                   x=ob.nextInt();
                   y=ob.nextInt();
                    hcf h=new hcf(x,y);
                    
                }
            }
        