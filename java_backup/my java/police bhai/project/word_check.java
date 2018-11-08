
package project;

import java.io.*;
class word_check
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int l,wf,vf;
    String s;
    void input ()throws IOException
    {
        System.out.println("enter the string");
        s=br.readLine();
        wf=words();
        vf=vowels();
        disp(wf,vf);
    }
    int words()
    {
        int c=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
             c=c+1;
        }
        c=c+1;
    return c;
    }
    int vowels()
    {
       int c1=0;
        for(int i=0;i<s.length();i++)
        {
            
            
                    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                     c1=c1 + 1;
                
            }
        
        return c1;
    }
    void disp(int wf, int vf)
    {
        System.out.println("no.of words"+wf);
        System.out.println("no.of vowels"+vf);
    }
}