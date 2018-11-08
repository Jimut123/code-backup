import java.io.*;
class reversestring 
    {
        public static void main(String args[])throws IOException
        {
            int i,j;
            String s;
            InputStreamReader ISR=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ISR);
            s=br.readLine();
            String w="";
           
            w="";
            for(i=s.length()-1;i>=0;i--)
            {
                if(s.charAt(i)==' ')
                {
                    for(j=w.length()-1;j>=0;j--)
                    {
                        System.out.print(w.charAt(j));
                        
                    }
                System.out.print(" ");    
                w="";
                }
                    else
                    w=w+s.charAt(i);
                
            }
            for(j=w.length()-1;j>=0;j--)
                    {
                        System.out.print(w.charAt(j));
                        
                    }
        }
        
    }
