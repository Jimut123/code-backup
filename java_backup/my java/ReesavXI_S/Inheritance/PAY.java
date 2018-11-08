package Inheritance;
import java.io.*;
import java.util.*;
class PAY extends Deduction
{
    int net;
    void paycheck()
    {
        super.deduce();
        net=TOTAL-(tax+pfund);
    }
    void send()throws IOException
    {
        super.deduce_show();
        System.out.println("Your NET PAY "+net);
        FileWriter fw=new FileWriter("HIGH.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        if(net>10000)
        pw.println(net);
        pw.close();
        bw.close();
        fw.close();
    }
}
        