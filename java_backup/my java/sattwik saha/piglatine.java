import java.io.*;
public class piglatine
 {
     public void main()throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String s=br.readLine();
          String w="";
          int p;
          p=0;
          for(int i=0;i<s.length();i++)
           {
               if(s.charAt(i)=='A'|| s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
                {
                    p=i;
                    break;
                }
            }
            for(int i=p;i<s.length();i++)
             {
                 System.out.print(s.charAt(i));
                }
                for(int i=0;i<p;i++)
                 {
                     System.out.print(s.charAt(i));
                    }
                    System.out.print("AY");
                }
            }
            

                
            
            
                 
     
      