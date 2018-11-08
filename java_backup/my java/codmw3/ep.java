import java.util.*;
public class ep
{
    int a;
    String c;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter number");
        a=sc.nextInt();
    }
    void check()
    {
        char ch;
        int c2,b,m;
        ch='0';
        int ar[]=new int[10];
        c2=0;
        c+=a;
        for(b=0;b<=9;b++)
        {
            for(m=0;m<c.length();m++)
            {
                if(ch==c.charAt(m))
                {
                    ar[b]+=1;
                }
            }
            ch++;
        }
    }
    void check2()
    {
        int s,m,n,j,g,cc,fl;
        String i="";
        int str[]=new int[10];
        int k[]=new int[c.length()];
        s=a;
        for(m=0;m<c.length();m++)
        {
            k[m]=s%10;
            s/=10;
        }
        for(m=0;m<c.length();m++)
        {
            for(n=0;n<c.length()-1-m;n++)
            {
                if(k[n]<k[n+1])
                {
                 g=k[n];
                 k[n]=k[n+1];
                 k[n+1]=g;
                }
            }
        }
        for(j=0;j<=9;j++)
        {
            for(m=0;m<c.length();m++)
            {
                if(c.charAt(m)==j)
                {
                    str[j]+=1;
                }
            }
        }
        for(m=0;m<c.length();m++)
        {
            s=s*10+k[m];
        }
        for(m=2;m<=s;m++)
        {
            i+=m;
            cc=0;
            fl=0;
            for(n=0;n<=9;n++)
            {
                for(j=0;j<i.length();j++)
                {
                if(i.charAt(j)==n)
                {
                        cc++;
                }
                if(cc>str[n])
                {
                        fl=1;
                        break;
                }
                if(fl==1)
                {
                    continue;
                }
                else
                {
                    pc(m);
                }
            }
           }
        }
}
void pc(int m)
{
    int fl,n;   
    fl=0;
    for(n=2;n<=m/2;n++)
    {
        if(m%n==0)
        {
            fl=1;
            break;
        }
    }
    if(fl==0)
    {
        System.out.println(+m);
    }
}
}