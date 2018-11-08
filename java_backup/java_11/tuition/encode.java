import java.io.*;
class encode
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String m;
        int n,i,j,o;
        char c1,c;
        String s="",r="",t="";
        System.out.println("Enter a number");
        m = cd.readLine();
        int l=m.length();
        for(i=0;i<=l-2;i+=2)
        {
            for(j=i;j<=i+1;j++)
            {
                 c=s.charAt(j);
                 t=t+c;
            }
            o=Integer.valueOf(t);
            if((o>=65)&&(o<=90))
            {
                c1=(char)o;
                r=r+c1;
            }
            else if((o>=97)&&(o<=122))
            {
                c1=(char)o;
                r=r+c1;
            }
            else if(o==32)
            {
                c1=(char)o;
                r=r+c1;
            }
        }
        System.out.println(r);
    }
}