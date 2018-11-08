import java.io.*;
class a1
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,w;
        s=br.readLine();
        w="";
        int i;
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                int f=0;
                int f1=0;
                if(w.charAt(0)=='a'||w.charAt(0)=='e'||w.charAt(0)=='i'||w.charAt(0)=='o'||w.charAt(0)=='u')  
                {
                    f=1;
                }
                if(w.charAt(w.length()-1)=='a'||w.charAt(w.length()-1)=='e'||w.charAt(w.length()-1)=='i'||w.charAt(w.length()-1)=='o'||w.charAt(w.length()-1)=='u'||w.charAt(w.length()-1)=='A'||w.charAt(w.length()-1)=='E'||w.charAt(w.length()-1)=='I'||w.charAt(w.length()-1)=='O'||w.charAt(w.length()-1)=='U')
                {
                    f1=1;
                }
                if(f==0&&f1==1)
                System.out.print(w);
                else
                if(f1==0&&f==1)
                System.out.print(w);
                if(f==0&&f1==0)
                System.out.print(w);
                w="";
            }
            else
            w=w+s.charAt(i);
        }
    }
}