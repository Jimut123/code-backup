import java.io.*;
class vow_rep_char
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="";
        int l,i,w;
        char ch,c;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s.toLowerCase();
        s=s+" ";
        l = s.length();
          for(i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            {
                w = (int)ch;
                w++;
                c = (char)w;
                m=m+c;
            }
            else
            {
                m=m+ch;
            }
        }
        System.out.println(m);
 } 
}
