package project;

import java.io.*;
class imitate_functions
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    void CompareTo(String s1, String s2)
    {
        int f1,f2;
        f1=0;
        f2=0;
        for(int i=0;i<s1.length();i++)
        {
            if((int)s1.charAt(i)>(int)s2.charAt(i))
            {
                f1=1;
                break;
            }
            else 
            if((int)s1.charAt(i)<(int)s2.charAt(i))
            {
                f2=1;
                break;
            }
        }
        if(f1==1)
        System.out.println("the largest string is:"+s1);
        else if(f2==1)
        System.out.println("the largest string is:"+s2);
        else
        System.out.println("both the strings:"+s1+"and"+s2+"are same");
    }
    void Trim(String w)
    {
        int i,j;
        i=0;
        while(w.charAt(i)==' ')
        {
            i++;
        }
            j=w.length()-1;
            while(w.charAt(j)==' ')
            j--;
            while(i<=j)
            {
                System.out.println(w.charAt(i));
                                i++;
            }
            
        }
    
    void subString(String s,int pos,int num)
    {
        int len,i;
        len=s.length();
        for(i=pos;i<=num;i++)
        System.out.println(s.charAt(i));
    }
}
        
            