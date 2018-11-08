import java.io.*;
class l_wrd
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",v="";
        int l,i,k,max;
        char ch;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s+" ";
        l = s.length();
        max=0;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                m=m+ch;
            }
            else if(ch==' ')
            {
                k=m.length();
                if(k>max)
                {
                    max=k;
                    v=m;
                    
            }
            m="";
        }
        }
        System.out.println("Longest word:"+v);
        System.out.println("No. of characters:"+max);
} 
}