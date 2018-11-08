import java.io.*;
class strfour
{
   public static void main()throws IOException
   {
       int i;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;int l;int j;int f;int w;
      System.out.print("enter string");
       s = br.readLine();
       l=s.length();
       j=l-1;
       for(i=j;i>=0;i--)
       { 
           System.out.print(s.charAt(i));
    }
    
}}
      
      