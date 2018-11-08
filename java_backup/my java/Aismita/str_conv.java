
import java.io.*;
class str_conv
{
    public static void main(String s)
    {
        String w="";
        for(int i=0;i<s.length();i++)
        {
            int m=(int)s.charAt(i);
            if(m>=65 && m<=90)
            w=w+Character.toLowerCase(m);
            else if(m>=97 && m<=122)
             w=w+Character.toUpperCase(m);
            
        }
    }    System.out.println(w);
}