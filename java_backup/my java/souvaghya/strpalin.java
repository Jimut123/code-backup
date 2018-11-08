import java .io.*;
class strpalin
{
   
    int i,j;
    String s;
    void input(String s1)throws IOException
    {
        
        s=s1;
        display(s);
    }
    void display(String s)
    {
        String w="";
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                int k=palincheck(w);
                if(k==1)
                System.out.print(w);
                w="";
            }
            else
            w=w+s.charAt(i);
        }
    }
    int palincheck(String s)
    {
        int f=0;
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
        if(s.charAt(i)!=s.charAt(j))
        {
            f=1;
            break;
        }
        if(f==0)
        return 1;
        else
        return 0;
    }
    public static void main()throws IOException
    {
        String a;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=br.readLine();
        strpalin l=new strpalin();
        l.input(a);
    }
}
            
        