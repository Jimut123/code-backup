package before_exam;

import java.io.*;
class search
{
public static void main()throws IOException
{
String b="";
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter sentence:");
 String s= br.readLine();
 s=s+" ";
  System.out.println("Enter search word:");
  String t=br.readLine();
  int f=0;
  for(int i=0;i<s.length();i++)
  {
      if(s.charAt(i)!=' ')
      {
          b=b+s.charAt(i);
        }
        else
        {
            
             if(b.equalsIgnoreCase(t)==true)
               {
                  f=1;
                  break;
                }
            b="";   
            }
            
        }
        if(f==1)
        System.out.println("Found...");
        else
        System.out.println("Not Found...");
    }
}

