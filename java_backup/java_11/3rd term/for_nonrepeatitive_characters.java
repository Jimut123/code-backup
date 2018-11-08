import java.io.*;
class for_nonrepeatitive_characters
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String a,s="";
        int i,l,j,m=0;
        char ch,c;
        System.out.println("Enter a string:----->");
        a=cd.readLine();
        l=a.length();
        for(i=0;i<l;i++)
        {
            ch=a.charAt(i);
            for(j=0;j<s.length();j++)
            {
                c=s.charAt(j);
                if(ch==c)
                 m=1;
            }
            if(m==0)
            s=s+ch;
            m=0;
        }
        System.out.println("The new string="+s);
    }
}
