import java.io.*;
import java.util.*;
public class calculations extends banks implements interest
{
    int t;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.println("Enter time");
        t=sc.nextInt();
        System.out.println(+(super.inv+(super.inv*t*r)/100));
        super.display();
        show();
    }
    void show()
    {
        System.out.println(+t);
    }
    public  void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n,b;
        System.out.println("Enter number of people");
        n=sc.nextInt();
        calculations ob=new calculations();
        FileWriter fw=new FileWriter("inter.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        for(b=0;b<n;b++)
        {
            ob.input();
            pw.write(ob.t);
            pw.write(super.c);
            pw.write(super.inv);
            pw.write(super.na);
        }
        pw.close();
        bw.close();
        fw.close();
    }
           
}
        