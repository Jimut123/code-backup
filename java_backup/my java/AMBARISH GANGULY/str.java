import java.io.*;
class str
{
  public static void main()throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       int l;
       int i;
       int j;
       //j= l-1;
       System.out.print("enter a string");
       s= br.readLine();
       l=s.length();
      String w="";
       for(i=0;i<l;i++)
       {
         if(s.charAt(i)==' ')
         {
             for(j=w.length()-1;j>=0;j--)
             System.out.print(w.charAt(j));
             System.out.print(" ");
             w="";
            }
            else
            w=w+s.charAt(i);
        }
        for(j=w.length()-1;j>=0;j--)
        System.out.print(w.charAt(j));
    }
}