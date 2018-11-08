import java.io.*;
    class streeeeeen
{
    public static void main(String args[])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int p;
       System.out.println("Enter the required string");
       String s=br.readLine();
       String w="";
       p=0;
       for(int i=0;i<s.length();i++)
       {
           if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
           p=(int)s.charAt(i)+32;
           else
           if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
           p=(int)s.charAt(i)-32;
           w=w+(char)p;
        }
        System.out.println(w);
    }
}