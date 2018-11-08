import java.io.*;
class abc
{
public static void main(String args[])throws IOException

  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s,w;
   System.out.print("Enter String");
   s=br.readLine();
   w="";
   s=s+"";
   int i,j;
   s=s+" ";
   for(i=0;i<s.length();i++)
   {
       if(s.charAt(i)==' ')
       {
           for(j=w.length()-1;j>=0;j--)
           System.out.print(w.charAt(j));
           w="";
        }
        else
        w=w+s.charAt(i);
    }
}
}
   