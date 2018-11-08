import java.io.*;
import java.util.StringTokenizer;
class wordFrequency
{
 public static void main(String args[]) throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n=0,f,t,t1,f1;
     String s2[]=new String[100];
     String s1[]=new String[100];
     String s,w;
     System.out.println("Enter String:");
     s=br.readLine();
     t=0;
     w="";
     for(i=0;i<s.length();i++)
     {
         if(s.charAt(i)==' ')
         {
             s2[t++]=w;
             w="";
            }
            else
            w=w+s.charAt(i);
        }
     s2[t++]=w;
     f=0;
     t1=0;
     for(i=0;i<t;i++)
     {
        f1=0;
         for(j=i+1;j<t;j++)
         {
             for(k=0;k<t1;k++)
              if(s2[j].equalsIgnoreCase(s2[k])==true)
               {
                   f1=1;
                   break;
                }
                if(f1==0)
                {
          if(s2[i].equalsIgnoreCase(s2[j])==true)
          {
              f++;
            }  
     
 }
}
             
     
     
     