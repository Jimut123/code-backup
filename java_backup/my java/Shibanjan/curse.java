import java.io.*;
class curse
{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        void input(String s)throws IOException
        {
            s=br.readLine();
            int c=0;String k;
            String s1="";
            k=print(s1);
            System.out.print(k);        
        }
        String print(String s)
        {
            String s1="";int m=0;char w;              
            if(c==s.length())
            return null;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                m++;
            }
            w=s.charAt(c);
            if(w==' '&&c==1||w==' '&&c==m)
            {
                return s1;
            }
            else
            {
            s1=s1+w;

            }
            c++;
            print(s);
        }
    }
