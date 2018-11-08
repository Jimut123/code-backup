package file_operation;
import java.io.*;
import java.util.*;
class prime_read
{
    void read()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("prime.txt");
        BufferedReader br=new BufferedReader(fr);
        String s="";
        while((s=br.readLine())!=null)
        System.out.println(s);
        br.close();
    }
}