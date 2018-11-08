
import java.io.*;
class no_char
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader ab=new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
         System.out.println("\f");
        String s;
        int i,l,j,count=0,m=0;
        char ch,c,v;
        System.out.println("Enter a string, but the no. of special letters, blank spaces will not be counted but you have to enter all the letters in capital:");
        s = cd.readLine();
        l=s.length();
        for(i=65;i<90;i++)
        {
            ch = (char)i;
            for(j=0;j<l;j++)
            {
                c=s.charAt(j);
                if(ch==c)
                {
                    count++;
                  
                }
            }
            
    }
}
}
                    
    
        