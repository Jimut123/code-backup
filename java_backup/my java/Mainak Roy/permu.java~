import java.util.*;
class permu
{
    String s="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter code");
        s=" "+sc.nextLine();
    }
    void calc()
    {
        char a[]=new char[s.length()];
        int i=0,s23=0,k=0,a32=0,b=0,f=0,j=0,fact=1;
        for(i=1;i<s.length();i++)
         a[i]=s.charAt(i);
        int x=(int)Math.pow(10,s.length());
        fact=11;    
        for(i=0;i<x;i++)
        {
            k=i;
            while(k>0)
            {
                a32=k%10;
                f=1;
                for(j=1;j<=a32;j++)
                f*=j;
                s23=s23+f;
                k=k/10;
            }
            if(s23==fact)
            {
                while(s23>0)
                {
                    b=s23%10;
                    System.out.print(a[b]);
                    s23=s23/10;
                }
                System.out.println();
            }
        }
    }
}