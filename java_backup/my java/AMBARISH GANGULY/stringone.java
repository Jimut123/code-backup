import java.io.*;
class stringone
{ 
   public static void main()throws IOException
      {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String s;
           int w,l,i;
          System.out.print("Enter string");
          s= br.readLine();
          l=s.length();
         
          w=0;
          for(i=0;i<l;i++)
          { if (s.charAt(i)==' ' )
              w=w+1;
            }
              System.out.print((w+1));
            
        }
    }
        
          