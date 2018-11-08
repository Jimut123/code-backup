import java.io.*;
class piglatin
{ 
   public static void main()throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s;
      int l,i,j,pos;
      System.out.print("enter a word");
      s=br.readLine();
      l=s.length();String w="";
      pos=0;
    for(i=0;i<l;i++)
      if(s.charAt(i)=='a'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
      {pos=i;
          break;
        }
   for(i=pos;i<l;i++)
   System.out.print(s.charAt(i));
   for(i=0;i<pos;i++)
   System.out.print(s.charAt(i));
   System.out.print("AY");
}
}