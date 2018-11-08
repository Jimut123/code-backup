import java.io.*;
class xyz

   {
       public static void main(String args[])throws IOException
       
       {
           int i;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String s,w;
           System.out.println("Enter String");
           s=br.readLine();
           w="";
           for(i=0;i<s.length();i++)
           {
               if(s.charAt(i)==' ')
               {
                   System.out.print(w.charAt(0));
                   System.out.print(".");
                   w="";
                }
                else 
                w=w+s.charAt(i);
            }
            System.out.print(w);
        }
    }