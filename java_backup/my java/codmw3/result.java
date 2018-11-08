import java.io.*;
public class result extends student
{
    int m,m1,m2,total;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        super.input2();
        System.out.println("Enter marks1");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter marks2");
        m1=Integer.parseInt(br.readLine());
        System.out.println("Enter marks3");
        m2=Integer.parseInt(br.readLine());
    }
    void cal()
    {
        total=m+m1+m2;
    }
    void send()throws IOException
    {
        FileWriter fr=new FileWriter("str.txt",true);
        BufferedWriter b=new BufferedWriter(fr);
        PrintWriter pr=new PrintWriter(b);
        pr.println(name);
        pr.println(roll);
        pr.println(sec);
        if(total>200)
        {
            pr.println(total);
        }
        pr.close();
        b.close();
        fr.close();
    }
}
