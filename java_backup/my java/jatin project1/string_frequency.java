import java.io.*;
class string_frequency
    {
        void choice()throws IOException
            {
                 int i,j,k=0;
                 String s,w;
                 InputStreamReader ISR=new InputStreamReader(System.in);
                 BufferedReader br=new BufferedReader(ISR);
                 System.out.println("Give string:");
                 s=br.readLine();
                 System.out.println("Give word:");
                 w=br.readLine();
                 String w1="";
                 s=s+" ";
                 for(i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)==' ')
                            {
                                if(w1.equalsIgnoreCase(w)==true)
                                k++;
                                w1="";
                            }
                            else 
                            w1=w1+s.charAt(i);
                        }
                        System.out.println("frequency:"+k+"   "+w);
                    }
                }
                
                 