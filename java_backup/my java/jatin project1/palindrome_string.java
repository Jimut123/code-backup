import java.io.*;
class palindrome_string
    {
        void choice()throws IOException
            {
                int i,j,k;
                 String s;
                 InputStreamReader ISR=new InputStreamReader(System.in);
                 BufferedReader br=new BufferedReader(ISR);
                 System.out.println("Give string:");
                 s=br.readLine();
                 String w="",w1="";
                 s=s+" ";
                for(i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)==' ')
                            {
                                   w=w+w1.charAt(0);
                                   w1="";
                                }
                                else 
                                w1=w1+s.charAt(i);
                            }
                            int f=0;
                for(j=0,k=w.length()-1;j<w.length()/2;j++,k--)
                    {
                        if(w.charAt(j)!=w.charAt(k))
                        {
                            f=1;
                            break;
                        }
                        }
                        if(f==0)
                        System.out.println("Palindrom");
                        else
                        System.out.println("Not Palindrom");
                    }
                }
                               
                                