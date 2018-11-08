 

import java.io.*;
class encrip1
{
    public static void main(String args[])throws IOException
    {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k,i,j,p,m,m1;
        System.out.println("enter string:");
        s=br.readLine();
        s=s.toUpperCase();
        System.out.println("enter number of letters to move:");
        j=Integer.parseInt(br.readLine());
        for(i=0;i<s.length();i++)
        {
            k=(int)s.charAt(i);
            if(k>=65 && k<=90)
            {
            k=k+j;
            if(k>90)
            {
                p=k-90;
                m=1;
                m1=65;
                while(m<=p)
                {
                  m1++;
                  if(m1>90)
                  m1=65;
                  m++;
                }
                System.out.print((char)m1);
            }
            else
            if(k<65)
            {
               p=65-k;
                m=1;
                m1=90;
                while(m<=p)
                {
                  m1--;
                  if(m1<65)
                  m1=90;
                  m++;
                }
                System.out.print((char)m1);
            } 
            
                        else
            System.out.print((char)k);
        }
        else
        if(k>=97 && k<=122)
            {
            k=k+j;
 
            if(k>122)
            {
                p=k-122;
                m=1;
                m1=97;
                while(m<=p)
                {
                  m1++;
                  if(m1>122)
                  m1=97;
                  m++;
                }
                System.out.print((char)m1);
            }
            else
            if(k<97)
            {
               p=97-k;
                m=1;
                m1=122;
                while(m<=p)
                {
                  m1--;
                  if(m1<97)
                  m1=122;
                  m++;
                }
                System.out.print((char)(m1+1));
            }
            else
            System.out.print((char)k);
  //else
                   }
    }
                
            
}
}
