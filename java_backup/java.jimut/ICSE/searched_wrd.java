import java.io.*;
class searched_wrd
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",p;
        int l,i,count=0,x=0;
        char ch;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        System.out.println("Enter the searching word::");
        p = cd.readLine();
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
                if(p.equals(m))
                {
                    count++;
                    x=1;
                }
                m="";
        }
        }
        if(x==1)
        {
             System.out.println("Searched word occurs "+count+" times");
        }
        else if(x==0)
        {
             System.out.println("Search unsucessful.");
        }
       
} 
}