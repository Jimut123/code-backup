import java.io.*;
class string_tilak_T
    {
        public static void main(String args[])throws IOException
            {
                int i,n;
                String s;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                s=br.readLine();
                String w="";
                for(i=0;i<s.length();i++)
                    {
                        if (s.charAt(i)==' ')
                            {
                                if(((int)w.charAt(0))>=97 && ((int)w.charAt(0))<=122)
                                System.out.print((char)(((int)w.charAt(0))-32)+".");
                                else
                                System.out.print(w.charAt(0)+".");
                                w="";
                            }
                            else
                            w=w+s.charAt(i);
                        }
                        if(((int)w.charAt(0))>=97 && ((int)w.charAt(0))<=122)
                                System.out.print((char)(((int)w.charAt(0))-32)+".");
                                else
                                System.out.print(w.charAt(0)+".");
                    }
                }
                
