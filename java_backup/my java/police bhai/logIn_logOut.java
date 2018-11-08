import java.io.*;
public class logIn_logOut
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int h1, h2, m1, m2, hour, min;
    public void input()throws IOException
    {
        System.out.println("enter log in hour");
        h1=Integer.parseInt(br.readLine());
        System.out.println("enter log in minute");
        m1=Integer.parseInt(br.readLine());
        System.out.println("enter log out hour");
        h2=Integer.parseInt(br.readLine());
        System.out.println("enter log out minute");
        m2=Integer.parseInt(br.readLine());
        if(m1>60||m2>60)
        {
        System.out.println("invalid input");
        System.exit(0);
    }
        calc();
    }
    public void calc()
    {
        if((h2>=1 && h2<12)&& h1>=12)
        h2=h2+24;
        if(m2<m1)
        {
            m2=m2+60;
            h2=h2-1;
        }
        hour=h2-h1;
        min=m2-m1;
        System.out.println("time difference is:"+hour+":"+min);
    }
}
        
                