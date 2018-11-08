package gr;

import java.io.*;
 class strencrip
{
    String s,s1,s2;
    int i,m,n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    strencrip()throws IOException
    {
        s=br.readLine();
        cal(s);
    }
    void cal(String s)
    {
     
        for(i=0;i<s.length();i++)
        {
            s1=s.substring(i,i+2);
            s2=s.substring(i,i+3);
            m=Integer.parseInt(s1);
            n=Integer.parseInt(s2);
            if((m>=65 && m<=90)||(m>=97 && m<=99)||m==32)
            {
             System.out.print((char)m);
             i++;
            }
            else
            if(n>=100 && n<=122)
            {
             System.out.print((char)n);
             i=i+2;
            }
        }
    }
    
}
