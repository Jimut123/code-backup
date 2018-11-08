package before_exam;

import java.io.*;
class signature
{
 public static void main()throws IOException
 {
     String t=" ";
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter name:");
     String s=br.readLine();
      System.out.print(s.charAt(0));
          for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)==' ')
         {
             //System.out.print(s.charAt(0));
             System.out.print(t.charAt(0));
             System.out.print(".");
            t="" ;
            }
            else
            {
                t=t+s.charAt(i);
            }
        }
       
          System.out.print(t);
        }}
