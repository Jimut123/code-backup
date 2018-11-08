import java.util.*;
class cons
{
    String s;
    char a[];
    int b[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String ");
        s=sc.nextLine();
        a=new char[26];
        b=new int[26];
        s=s.trim();
        s=s.toUpperCase();
    }
    void clac()
    {
        int o=-1,ou=-1;
        int cr=0;
        for(int i=65;i<=90;i++)
         a[++o]=(char)i;
        for(int j=65;j<=90;j++)
        {
            cr=0;
            for(int z=0;z<s.length();z++)
            {
                if((char)j==s.charAt(z))
                cr++;
            }
            b[++ou]=cr;
        }
        for(int h=0;h<25;h++)
        {
            
            
                if(b[h+1]!=0&&b[h]!=0)
                {
                    if(b[h+1]>=b[h])
                    System.out.println("Frequency"+b[h]);
                    else
                    System.out.println("Frequency"+b[h]);
                }
            }
        }
    }
          