package ISC;

import java.util.*;
public class coding
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        String s;
        int fl=0;
        System.out.println("Enter sentence");
        s=sc.nextLine();
        fl=validation(s);
        if(fl==0)
        {
            convert(s);
        }
    }
    int validation(String a)
    {
        int st1,st2,st3,st4,fl,b,c;
        st1=(int)'a';
        st2=(int)'z';
        st3=(int)'A';
        st4=(int)'Z';
        fl=0;
        for(b=0;b<a.length();b++)
        {
            c=(int)a.charAt(b);
            if((c>=st1 && c<=st2) || (c>=st3 && c<=st4))
            {
                fl=0;
            }
            else 
            {
                fl=1;
                break;
            }
        }
        return fl;
    }
    void convert(String a)
    {
        int st1,st2,st3,st4,b,n,nw;
        String st="";
        st1=(int)'a';
        st2=(int)'z';
        st3=(int)'A';
        st4=(int)'Z';
        System.out.println("Enter distance from letter");
        n=sc.nextInt();
        for(b=0;b<a.length();b++)
        {
            if(a.charAt(b)!=' ')
            {
            nw=(int)a.charAt(b)+n;
            if(nw>st2)
            {
                nw=nw-st2+st1;
            }
            else if(nw>st4)
            {
                nw=nw-st4+st3;
            }
            else if(nw<st1)
            {
                nw=st2-(st1-nw);
            }
            else if(nw<st3)
            {
                nw=st4-(st1-nw);
            }
            st=st+(char)nw;
        }
        else 
        {
            st=st+a.charAt(b);
        }
       }
       System.out.println("Code is : "+st);
    }
}