package file_operation;
import java.io.*;
import java.util.*;
class prime
{
    void calc()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("prime.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        for(int i=2;i<100;i++)
          if(prime(i)==true)
            pw.println(i);
        pw.close();
    }
    boolean prime(int d)
    {
        int cr=0;
        for(int i=2;i<d;i++)
        if(d%i==0)
        cr++;
        if(cr==0)
        return true;
        else
        return false;
    }
}        