import java.io.*;
class Longest
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Sentence");
        String s=br.readLine();
        s=s+' ';
        int max=0;
        String w="";
        String w1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(w.length()>max)
                {
                    max=w.length();
                    w1=w;
                }
                w="";
            }
            else
            w=w+s.charAt(i);
        }
        System.out.println(max+":word:"+w1);
    }
}

                
                    