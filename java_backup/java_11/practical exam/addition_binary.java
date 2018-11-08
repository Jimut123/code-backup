import java.io.*;
class addition_binary
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s="",s2="",s1="";
        int n,m,n1,m1,d,l1,l2,l=0,i;
        char ch1='0',ch2='0',r='0';
        System.out.println("Enter two numbers:");
        m=Integer.parseInt(cd.readLine());
        n=Integer.parseInt(cd.readLine());
        n1=n;m1=m;
        while(n1!=0)
        {
            d=n1%2;
            if(d==0)
            {
                s1='0'+s1;
            }
            else
            {
                s1='1'+s1;
            }
            n1=n1/2;
        }
        
         while(m1!=0)
        {
            d=m1%2;
            if(d==0)
            {
                s2='0'+s2;
            }
            else
            {
                s2='1'+s2;
            }
            m1=m1/2;
        }
       
       
        System.out.println(s1);
        System.out.println(s2);
        s="";
        l1=s1.length();
        System.out.println(l1);
        l2=s2.length();
           System.out.println(l2);
       if(l2>l1)
        {
          l=l2;
         }
        else 
        {
             l=l1;
           }
           r='0';
        for(i=l-1;i>=0;i--)
        {
             
            if(i<=l1)
            {
                ch1=s1.charAt(i);
                  
            }
            if(i<=l2)
            {
                ch2=s2.charAt(i);
            }
             if((ch1=='0')&&(ch2=='0')&&(r=='0'))
            {
                s='0'+s;
                r='0';
            }
             if((ch1=='0')&&(ch2=='1')&&(r=='0'))
            {
                s='1'+s;
                r='0';
            }
             if((ch1=='1')&&(ch2=='0')&&(r=='0'))
            {
                s='1'+s;
                r='0';
            }
             if((ch1=='1')&&(ch2=='1')&&(r=='0'))
            {
                s='0'+s;
                r='1';
            }
             if((ch1=='1')&&(ch2=='1')&&(r=='1'))
            {
                s='1'+s;
                r='1';
            }
             if((ch1=='0')&&(ch2=='0')&&(r=='1'))
            {
                s='1'+s;
                r='0';
            }
             if((ch1=='0')&&(ch2=='1')&&(r=='1'))
            {
                s='0'+s;
                r='1';
            }
             if((ch1=='1')&&(ch2=='0')&&(r=='1'))
            {
                s='0'+s;
                r='1';
            }
        }
        System.out.println("Sum="+s);
        
    }
}
        
        
        
        