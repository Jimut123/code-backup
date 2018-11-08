import java.io.*;
class question_twelve
{
 public static void main()throws IOException
  { 
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s;char a,b;
   int i;
   System.out.print("enter a string");
   s=br.readLine();
   for(i=0;i<s.length();i++)
   {
       if(s.charAt(i)>=65 && s.charAt(i)<=90)
       System.out.print((char)(s.charAt(i)+32));
       else
       if(s.charAt(i)>=97 && s.charAt(i)<=122)
       System.out.print((char)(s.charAt(i)-32));
}
}
}