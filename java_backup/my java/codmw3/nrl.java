import java.io.*;
public class nrl
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class tst
    {
        int a;
        void input()throws IOException
        {
            System.out.println("Enter number");
            a=Integer.parseInt(br.readLine());
        }
        void display()
        {
            System.out.println(+a);
        }
        tst b;
    }
    tst ob=new tst();
    tst ob2=ob;
    void start()throws IOException
    {
        String ch;
        ch="y";
        while(ch.equals("y"))
        {
            System.out.println("Enter choice");
            ch=br.readLine();
            if(ch.equals("n"))
            {
                ob2=null;
                break;
            }
            ob2.input();
            ob2.b=new tst();
            ob2=ob2.b;
        }
        ob2=ob;
        while(ob2!=null)
        {
            ob2.display();
            ob2=ob2.b;
        }
    }
}