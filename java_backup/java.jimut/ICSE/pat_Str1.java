import java.io.*;
class pat_Str1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s;
        int i,l,j,m=4;
        System.out.print("Enter a string::");
        s = cd.readLine();
        l = s.length();
        for(i=l-1;i>=0;i--)
        {
            for(j=l-1;j>=i;j--)
            {
                System.out.print(s.charAt(i));
            }
            m--;
            System.out.println("");
        }
    }
}