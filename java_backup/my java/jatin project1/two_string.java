import java.io.*;
class two_string
    {
        void choice()throws IOException
            {
                 int i,j,k;
                 String s,w;
                 InputStreamReader ISR=new InputStreamReader(System.in);
                 BufferedReader br=new BufferedReader(ISR);
                 System.out.println("Give string:");
                 s=br.readLine();
                 System.out.println("Give string:");
                 w=br.readLine();
                 if(s.length()==w.length())
                 {
                     j=w.length()-1;
                 for(i=0;i<s.length();i++,j--)
                  System.out.print(s.charAt(i)+""+w.charAt(j));
                }
                else
                System.out.println("error");
                }
            }
                 