import java.io.*;
class str
{
String s;int w;int q;
    str(String a)
    {
        s=a;
        piglatin(s);
    }
    void piglatin(String s)
    {
       int p,i;
       p=0;
        for( i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='U'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O')
            {
            p=i;
            break;
        }
    }
            
    for( i =p;i<s.length();i++)
            System.out.print(s.charAt(i));
           for( i=0;i<p;i++)
           System.out.print(s.charAt(i));
           System.out.print("AY");
        }
    
    public static void main(String args[])throws IOException
    {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine();
        str s1=new str(s);
       
}
}