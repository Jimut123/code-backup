package Inheritance;
import java.io.*;
class Paycheck extends Employee
{
    int da,hra,tot,pf,net;
    void input()
    {
        super.input();
        da=(15/100)*super.basic;
        hra=5000;
        tot=da+hra+super.basic;
        pf=(10/100)*super.basic;
        net=tot-pf;
    }
    void display()
    {
        super.display();
        System.out.println("DA :-"+da);
        System.out.println("HRA :-"+hra);
        System.out.println("Total pay :-"+tot);
        System.out.println("Income tax :-"+pf);
        System.out.println("Net pay :-"+net);
    }
    void send()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileWriter fw=new FileWriter("D:\\Employee.dat");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        if(net>10000||net<5000)
        {
            pw.println(name);
            pw.println(code);
            pw.println(basic);
            pw.println(net);
        }
        pw.close();
        bw.close();
        fw.close();
    }
}