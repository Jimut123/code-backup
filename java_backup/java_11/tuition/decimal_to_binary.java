import java.io.*;
class decimal_to_binary
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        long l,d;
        int i;
        String s="",s1="";
        System.out.println("Enter the decimal number:");
        l = Long.parseLong(cd.readLine());
        while(l!=0)
        {
            d=l%2;
            s=s+String.valueOf(d);
            l=l/2;
        }
        for(i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        System.out.println("Binary Code:"+s1);
    }
}
        