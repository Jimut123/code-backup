package before_exam;

import java.io.*;
class Freq
{
public static void main()throws IOException
{
String t="";
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter sentence:");
 String s=br.readLine();
 System.out.println("Enter searching word:");
 String c=br.readLine();
 int k=0;
 s=s+" ";
 for(int i=0;i<s.length();i++)
 {
     if(s.charAt(i)!=' ')
     {
         t=t+s.charAt(i);
        }
        else
        {
           if(t.equalsIgnoreCase(c)==true)
            k++;
            t="";
        }
    }
    if(k>0)
    {
    System.out.println("The searchword is found and occurs "+k+ "times");
}
else
{
System.out.println("The searchword is not found");
}
}
}
