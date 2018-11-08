
import java.io.*;
class no_of_characters
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s;
        int i,l,j,count=0;
        char ch,c;
        System.out.println("Enter a TEXT ::");
        s =cd.readLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=65;i<=90;i++)
        {
            ch = (char)i;
            for(j=0;j<l;j++)
            {
                c = s.charAt(j);
                if(c==ch)
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println("Number of "+ch+" characters is:"+count);
            }
            count=0;
        }
    }
}