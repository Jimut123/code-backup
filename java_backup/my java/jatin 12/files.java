import java.io.*;
public class files
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int st=0;
    char ch;
    void input()throws IOException
    {
        FileWriter fw=new FileWriter("number.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        ch='y';
        while(ch=='y')
        {
            System.out.println("Do you want to continue?");
            ch=(br.readLine().charAt(0));
            if(ch=='n')
            {
                break;
            }
            System.out.println("Enter number");
            pw.println(br.readLine());
        }
        pw.close();
        bw.close();
        fw.close();
        second();
    }
    void second()throws IOException
    {
        FileWriter f2=new FileWriter("pal.txt");
        BufferedWriter b2=new BufferedWriter(f2);
        PrintWriter p2=new PrintWriter(b2);
        int fl;
        String k;
        FileReader fr=new FileReader("number.txt");
        BufferedReader b=new BufferedReader(fr);
        boolean bl=false;
        try
        {
        while(!bl)
        {
            fl=0;
            k=b.readLine();
            if(k==null)
            {
                break;
            }
            fl=check(Integer.parseInt(k));
            if(fl==1)
            {
                st++;
                p2.println(k);
            }
        }
    }
    catch(EOFException e)
    {
        bl=true;
    }
        b.close();
        fr.close();
        p2.close();
        b2.close();
        f2.close();
    }
    int check(int a)throws IOException
    {
        int k,k2;
        k=0;
        k2=a;
        while(a>0)
        {
            k=(k*10)+a%10;
            a=a/10;
        }
        if(k==k2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    void sort()throws IOException
    {
        int ar[]=new int[st];
        int m,n,k;
        FileReader fr=new FileReader("pal.txt");
        BufferedReader b=new BufferedReader(fr);
        for(m=0;m<st;m++)
        {
            ar[m]=Integer.parseInt(b.readLine());
        }
        b.close();
        fr.close();
        FileWriter f2=new FileWriter("pal.txt");
        BufferedWriter b2=new BufferedWriter(f2);
        PrintWriter p2=new PrintWriter(b2);
        for(m=0;m<st;m++)
        {
            for(n=0;n<st-1;n++)
            {
                if(ar[n]>ar[n+1])
                {
                    k=ar[n];
                    ar[n]=ar[n+1];
                    ar[n+1]=k;
                }
            }
        }
        for(m=0;m<st;m++)
        {
           p2.println(ar[m]);
        }
    }
}
