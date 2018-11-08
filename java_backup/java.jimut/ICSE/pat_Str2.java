import java.io.*;
class pat_Str2
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
        for(i=0;i<=l-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(m));
            }
            m--;
            System.out.println("");
        }
    }
}