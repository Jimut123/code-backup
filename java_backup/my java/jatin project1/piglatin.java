import java.io.*;
class piglatin 
    {
        public static void main(String args[])throws IOException
            {
            int i,p,j;
            String s;
            InputStreamReader ISR=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ISR);
            s=br.readLine();
            p=0;
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a'||
                    s.charAt(i)=='A'||
                    s.charAt(i)=='E'||
                    s.charAt(i)=='e'||
                    s.charAt(i)=='i'||
                    s.charAt(i)=='I'||
                    s.charAt(i)=='o'||
                    s.charAt(i)=='O'||
                    s.charAt(i)=='u'||
                    s.charAt(i)=='U')
                        {
                            p=i;
                            break;
                        }
                    }
            j=p;
            while(p<s.length())
                {
                    System.out.print(s.charAt(p));
                    p++;
                }
            for(i=0;i<j;i++)
            System.out.print(s.charAt(i));
            System.out.print("AY");
        }
    }
    
    
    