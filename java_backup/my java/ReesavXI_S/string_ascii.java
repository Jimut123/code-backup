import java.util.*;
class string_ascii
{
    String s="";
    string_ascii(String n)
    {
        s=n;
    }
    void clac()
    {
        int i=0,j=0,k=0,f=0;
        char ch=' ';
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            j=(int)ch;
            f=0;
            for(k=2;k<j;k++)
            {
                if(j%k==0)
                {
                f=1;
                break;
            }
            }
            if(f!=1)
            {
             System.out.print((char)(j+1));
            }
            else
            System.out.print(s.charAt(i));
        }
    }
}