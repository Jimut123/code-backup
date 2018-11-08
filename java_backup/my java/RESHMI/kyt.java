import java.io.*;
class kyt
  {
      public static void main(String args[])throws IOException
      {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String s,w;
          int i,j,p;
          s=br.readLine();
          w="";
          p=0;
          for(i=s.length()-1;i>=0;i--)
          {
              if(s.charAt(i)==' ')
              {
                   //System.out.print(w);
                  for(j=w.length()-1;j>=0;j--)
                  
                   System.out.print(w.charAt(j));
                   p=i;
                    w="";
                   break;
                
               
                }
                else
                w=w+s.charAt(i);
            }
            for(i=0;i<p;i++)
            System.out.print(s.charAt(i));
        }
    }
                  
