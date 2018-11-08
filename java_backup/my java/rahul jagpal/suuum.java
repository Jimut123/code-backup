import java.io.*;
class suuum
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,b,c,d,e,f;
        System.out.println("Enter data");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        d=a+b+c;
        e=a+b+c/3;
        if(e<=30)
        System.out.println("FAIL");
        else
        System.out.println("PASS");
    }
}
        