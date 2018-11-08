import java.io.*;
class Abbreviate
{
 int i;
 String w;String s;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input(String Args[])throws IOException
 {
   
   s=br.readLine();
   w="";
 }
 void abr(String Args[])throws IOException
 {
    
     for(i=0;i<s.length();i++)
     {
         if(s.charAt(i)==' ')
         {
             System.out.print( w.charAt(0)+".");
             w="";
         }
         else
         w=w+s.charAt(i);
     }
     System.out.println(w);
 }
}
 