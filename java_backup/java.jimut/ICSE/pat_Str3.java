import java.io.*;
class pat_Str3
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s;
        int i,l,j,m;
        System.out.print("Enter a string::");
        s = cd.readLine();
        l = s.length();
        m=l-1;
        for(i=l-1;i>=0;i--)
        {
            for(j=i;j<=l-1;j++)
            {
                System.out.print(s.charAt(m));
            }
            m--;
            System.out.println("");
        }
    }
}