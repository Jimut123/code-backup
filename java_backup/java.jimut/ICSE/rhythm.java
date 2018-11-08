import java.io.*;
class rhythm
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,w="",m="",d="";
        int l,i,j,k,o=0;
        char ch,c;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s.toLowerCase();
        s=s+" ";
        l = s.length();
          for(i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                m=m+ch;
            }
            else if (ch==' ')
            {
                k=m.length();
                for(j=0;j<=k-1;j++)
                {
                    c = m.charAt(j);
                    if((c!='a')||(c!='e')||(c!='i')||(c!='o')||(c!='u'))
                    {
                        d=d+c;
                        o=1;
                    }
                    else
                    {
                        o=0;
                    }
                }
                 if(o==1)
                 {
                    System.out.println(d);
                }
                 m="";
            }

        }
       
 } 
}
