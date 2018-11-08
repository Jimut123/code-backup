import java.io.*;
class Palindrom
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int f=0;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
            
    }
}



