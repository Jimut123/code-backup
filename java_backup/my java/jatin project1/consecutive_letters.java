import java.io.*;
class consecutive_letters
    {
        public static void main(String args[])throws IOException
            {
            int i,m=0,m1=0;
            String s;
            InputStreamReader ISR=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ISR);
            System.out.println("Give string:");
            s=br.readLine();
            for(i=0;i<s.length()-1;i++)
                {
                    m=(int)s.charAt(i);
                    m1=m+1;
                    if(s.charAt(i+1)==(char)m1)
                        System.out.println(s.charAt(i)+","+s.charAt(i+1));
                    else
                    if(s.charAt(i+1)==(char)(m1+32))
                        System.out.println(s.charAt(i)+","+s.charAt(i+1));
                    else
                    if(s.charAt(i+1)==(char)(m1-32))
                        System.out.println(s.charAt(i)+","+s.charAt(i+1));
                    }
                }
            }
            