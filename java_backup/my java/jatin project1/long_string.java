import java.io.*;
class long_string
    {
        public static void main(String args[])throws IOException
            {
            int i,p;
            String s,w1;
            InputStreamReader ISR=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ISR);
            s=br.readLine();
            s=s+" ";
            String w="";
            p=0;
            w1="";
            for(i=0;i<s.length();i++)
            {
                 if(s.charAt(i)==' ')
                 {
                     if(w.length()>p)
                     {
                         p=w.length();
                         w1=w;
                        }
                    
                        w="";
                    }
                        else
                        w=w+s.charAt(i);
                  
                }
                
            System.out.print(w1+"Length:"+p);
        }
    }
    
                                                      