package project;

import java.io.*;
class character_frequency
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s;
    int f,a,i;
    
    void input()throws IOException
    {
        System.out.println("enter the sentence");
        s=br.readLine();
        freq_check();
    }
    void freq_check()
    {
        for (int i=65;i<=90;i++)
        {
            f=0;
            for (int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==(char)i)
                f++;
                else
                 if(s.charAt(j)==(char)(i+32))
                f++;
            }
            if(f>0)
        System.out.println("Frequency::"+"Of Char "+(char)i+" "+f);    
            
        }
        //return f;
    }
    void disp(int a)
            {
                if(a>0)
                System.out.println((char)i+"="+a);
            }
}