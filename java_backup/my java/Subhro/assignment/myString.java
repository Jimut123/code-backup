package assignment;

import java.io.*;
class myString
{
    String str;
    int len;
    myString(String s)
    {
        str=s;
        len=str.length();
    }
    char code(int index)
    {
        int x=0;
        char ch;
        ch=str.charAt(index);
        return ch;
    }
    void largestWord()
    {
        String w, w1;
        int max, i;
        w1=w="";
        max=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(w.length()>max)
                {
                    max=w.length();
                    w1=w;
                    
                }
                 
                w="";
            }
            else
            w=w+str.charAt(i);
        }
        if(w.length()>max)
                {
                    max=w.length();
                    w1=w;
                    //System.out.println("longest word"+w+"length"+max);
                }
                 
                w="";
                System.out.println("longest word::"+w1+" length::"+max);
    }
}