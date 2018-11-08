import java.io.*;
class UTLLTU
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="";
        int l,i;
        char ch;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
      
        l = s.length();
       
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                {
                    ch=Character.toLowerCase(ch);
                }
                else if(Character.isLowerCase(ch))
                {
                    ch=Character.toUpperCase(ch);
                }
            }
            m=m+ch;
        }
         System.out.println(m);
    
        }
}