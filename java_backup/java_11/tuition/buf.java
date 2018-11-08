import java.io.*;
class buf
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s;
        int n;
        System.out.println("Enter a String:");
        s=cd.readLine();
        System.out.println("Enter a number:");
        n = Integer.parseInt(cd.readLine());
        StringBuffer s1 = new StringBuffer(s);
        int i,c=0,f=0,l=0;
        char ch;
        for(i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
            {
                c++;
            
            if(c==(n-1))
            {
                f=i;
            }
            if(c==n)
            {
                l=i;
            }
           }
        }
        s1.delete(f,l);
        System.out.println(s1);
    }
}