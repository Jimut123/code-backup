import java.io.*;
class rss

 {
     public static void main(String args[])throws IOException
     
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s;
         s=br.readLine();
         int i,j;
         {
             for(i=0;i<s.length();i++)
             {
                 for(j=i;j>=0;j--)
                 System.out.print(s.charAt(j));
                 System.out.print("");

                }
            }
        }
    }
    
                         