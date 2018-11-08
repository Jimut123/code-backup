import java.io.*;
class encode_2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,p="";
        int l,i,m;
        char ch,c;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s.toUpperCase();
        s=s+" ";
        l = s.length();
        
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                m=(int)ch;
                if(m<=88)
                {
                     m=m+2;
                     c=(char)m;
                     p=p+c;
                }
                else if(m>=88)
                {
                   
                    if(m==90)
                    {
                        m=m-2;
                    }
                     m=90-m;
                    m=m+64;
                    c=(char)m;
                    p=p+c;
                }
            }
        }
        System.out.println(p);
        }
}