import java.util.*;
import java.io.*;
public class token
{
    void main()throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter string");
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a,nt;
        String s;
        nt=st.countTokens();
        for(a=0;a<nt;a++)
        {
            s=st.nextToken();
            System.out.println(+vowel(s));
        }
    }
    int vowel(String d)
    { int a,c=0;
        char k;
        for(a=0;a<d.length();a++)
        {
            k=d.charAt(a);
            if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
            {
                c++;
            }
        }
        return c;
    }
}
        