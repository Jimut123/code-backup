import java.util.*;
public class TwosCompliment
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary No.");
        String s=sc.nextLine();
        String f="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                f=f+'1';
            }
            else if(s.charAt(i)=='1')
            {
                f=f+'0';
            }
        }
        f=f+s.charAt(s.length()-1);
        System.out.println(f);
    }
}