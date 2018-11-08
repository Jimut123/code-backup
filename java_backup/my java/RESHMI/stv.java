import java.io.*;
class stv

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
                 for(j=0;j<=i;j++)
                 System.out.print(s.charAt(j));
                 System.out.println("");
                }
            }
        }
    }
    
  
       
     