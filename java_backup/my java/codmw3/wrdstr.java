import java.util.*;
public class wrdstr
{
    Scanner sc=new Scanner(System.in);
    String s,ar[];
    void input()
    {
        System.out.println("Enter sentence");
        s=sc.nextLine();
    }
    void store()
    {
        int m,c=0;
        String w="";
        for(m=0;m<s.length();m++)
        {
            if(s.charAt(m)==' ')
            {
                c+=1;
            }
        }
        ar=new String[c+1];
        c=0;
        for(m=0;m<s.length();m++)
        {
            if(s.charAt(m)==' ')
            {
                ar[c++]=w;
                w="";
            }
            w+=s.charAt(m);
        }
        ar[c]=w;
    }
    void print()
    {
        int m,n,c,i,fl=0;
        char ch[]={'a','e','i','o','u'};
        c=0;
        for(m=0;m<ar.length;m++)
        {
            for(i=0;i<5;i++)
            {
                fl=0;
               for(n=0;n<ar[m].length();n++)
               {
                  if(ar[m].charAt(n)==ch[i])
                  {
                      c+=1;
                    }
                }
                if(c==0)
                {
                    break;
                }
                else
                {
                    fl=1;
                }
                c=0;
            }
            if(fl==1)
            {
                System.out.println(ar[m]);
            }
        }
    }
    void main()
    {
        input();
        store();
        print();
    }
}            