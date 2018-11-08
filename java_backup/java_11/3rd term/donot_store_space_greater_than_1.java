import java.io.*;
class donot_store_space_greater_than_1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,t="",s1="";
        int i,l,d=0;
        char c,ch;
        System.out.println("Enter a string:");
        s=cd.readLine();
        s=s.trim();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
             t=t+ch;
            else
            {
                while(ch==' ')
                {
                    i++;
                    ch=s.charAt(i);
                    d++;
                    
                }
                i--;
            }
            if(d>0)
            {
              s1=s1+t+" ";
              t="";
              d=0;
            }
            
        }
        System.out.println(s1);
}
}
