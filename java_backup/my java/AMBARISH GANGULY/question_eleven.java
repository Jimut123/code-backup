import java.io.*;
class question_eleven
{
 public static void main()throws IOException
  { 
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s;int l;int i,max;
   String s1,s2;
   System.out.print("enter a sentence");
   s=br.readLine();
   l=s.length();
   s1=s2="";
   max=0;
   for( i=0;i<l;i++)
   {
       if(s.charAt(i)==' ')
       {
          if(s1.length()>max)
          {
              max=s1.length();
              s2=s1;
             
            }
             s1="";
            }
            else
            s1=s1+s.charAt(i);
        }
         if(s1.length()>max)
          {
              max=s1.length();
              s2=s1;
             
            }
        System.out.println("Longest word:"+s2);
   
}
}
