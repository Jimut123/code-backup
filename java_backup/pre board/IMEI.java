import java.io.*;
class IMEI
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s;
        int l,i=2,s1=0,s2=0;
        char ch,c;
        System.out.println("Enter the number to be checked as an IMEI number:");
        s=cd.readLine();
        l=s.length();
        for(i=l-1;i>=0;i-=2)
        {
            c=s.charAt(i);
            s2=s2+((int)c-48)*2;
        }
        for(i=l-1;i>=0;i-=2)
        {
             ch=s.charAt(i);
             s1=s1+(int)ch-48;
        } 
        int sum=s1+s2;
        if(sum%10==0)
        {
            System.out.println("It is a valid IMEI number.");
        }
        else
        {
            System.out.println("It is not a valid IMEI number.");
        }
    }
}

            