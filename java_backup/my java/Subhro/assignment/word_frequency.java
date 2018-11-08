package project;

import java.io.*;
class word_frequency
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s,w,w2;
    char ch;
    int i,j;
    void input()throws IOException
    {
        System.out.println("enter the sentence");
        s=br.readLine();
        System.out.println("Enter searching word:");
        w2=br.readLine();
        freq_check();
       
    }
    void freq_check()
    {
        int f;
        f=0;
        
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
                     
            if(ch==' ')
            {
             if(w.equalsIgnoreCase(w2)==true)
               f++;
            w="";
        }
        else
        w=w+ch;
    }
    //System.out.println(w);
     if(w.equalsIgnoreCase(w2)==true)
               f++;
    
    System.out.println("The searching word:"+" "+w2+" "+"Frequency:"+f);
            }
}

                
             