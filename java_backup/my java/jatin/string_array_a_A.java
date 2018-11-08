import java.io.*;
class string_array_a_A    
    {
        public static void main(String args[])throws IOException
            {
                int i,j;
                String s[]=new String[5];
                  InputStreamReader ISR=new InputStreamReader(System.in);
                  BufferedReader br=new BufferedReader(ISR);
                   System.out.println("give 5 strings");
                for(i=0;i<5;i++)
               
                s[i]=br.readLine();
                for(i=0;i<5;i++)
                    {
                       
                                if(s[i].charAt(0)=='a'||s[i].charAt(0)=='A')
                                System.out.println(s[i]);
                            }
                        }
                    }
               
