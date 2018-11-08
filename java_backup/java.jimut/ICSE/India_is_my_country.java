import java.io.*;
import java.lang.*;
class India_is_my_country
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",r="",n="";
        int l,i,j;
        char ch,c;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s+" ";
        l = s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                m=m+ch;
            }
            else if(ch==' ')
            {
             for(j=m.length()-1;j>=0;j--)
             {
                 c=m.charAt(j);
                 r=r+c;
             }
             n=n+r+" ";
             r="";
             m="";
           
            }
        }
         System.out.println(n);
        } 
}