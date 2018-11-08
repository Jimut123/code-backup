import java.io.*;
public class primefrequency
  {public static void main(String args[])throws IOException
     {InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in=new BufferedReader(read);
      int x,y,k,i,z,j;i=0;k=0;z=0;
      String a,b,c;c="";
      System.out.println("Enter your string");
      a=in.readLine();
      x=a.length();
      System.out.println("Enter your substring to be searched in the string");
      b=in.readLine();
      y=b.length();
      c="";
      k=0;
      for(z=0;z<x;z++)
       {if(a.charAt(z)==' ')
           {
               if(c.compareTo(b)==0)
               k++;
               c="";
            }
            else
            c=c+a.charAt(z);
        }
        if(c.compareTo(b)==0)
               k++;
               //System.out.println(k);
        int f=0;
        for(j=2;j<k;j++)
        {if(k%j==0)
            {f=1;break;
            }
        }
        if(f==0)
        System.out.println("Prime Frequency:"+k);
            }
        
    }

        