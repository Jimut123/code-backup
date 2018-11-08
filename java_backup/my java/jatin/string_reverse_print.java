import java.io.*;
class string_reverse_print  
    {
       public static void main(String args[])throws IOException
            {
                int i,j,k;
                String s,w;
                String s1[]=new String[100];
                InputStreamReader ISR=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(ISR);
                  System.out.println("give strings");
                  s=br.readLine();
                  w="";
                  j=0;
                  for(i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)==' ') 
                            {
                              s1[j++]=w;
                              w="";
                            }
                            else
                            w=w+s.charAt(i);
                        }
                        s1[j++]=w;
                        for(i=0,k=j-1;i<j/2;i++,k--)
                        System.out.print(s1[i]+","+s1[k]+",");
                        System.out.print(s1[i]);
                    }
                }