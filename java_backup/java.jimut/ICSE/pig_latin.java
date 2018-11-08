import java.io.*;
class pig_latin
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",v="",o,x,wr="";
        int l,i,k,max,j;
        char ch;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s.toUpperCase();
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
        
        for(i=0;i<v.length();i++)
        {
            ch = v.charAt(i);
            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
            {
                j=i;
                break;
            }
        }
        o=v.substring(i,l-1);
        x=v.substring(0,i);
        wr=o+x+"AY";
        System.out.println(wr);
        System.out.println("Longest word:"+v);
        System.out.println("No. of characters:"+max);
} 
}