import java.io.*;
public class File3
{
    void main()throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int c,b,g;
        String d="",k,a;
        System.out.println("Enter Sentence");
        a=bf.readLine();
        FileWriter Fout=new FileWriter("File.dat");
        BufferedWriter Bout=new BufferedWriter(Fout);
        PrintWriter Pout=new PrintWriter(Bout);
        c=0;
        for(b=0;b<a.length();b++)
        {
            if(a.charAt(b)==' ')
            {
                c++;
            }
        }
        String st[]=new String[c+1];
        for(b=0;b<a.length();b++)
        {
            d=d+a.charAt(b);
            if(a.charAt(b)==' ')
            {
                d=d.trim();
                Pout.println(d);
                d="";
            }
        }
        Pout.println(d);
        Pout.close();
        Bout.close();
        Fout.close();
        c++;
        FileReader Fin=new FileReader("File.dat");
        BufferedReader bin=new BufferedReader(Fin);
        for(b=0;b<c;b++)
        {
            k=bin.readLine();
            st[b]=k;
        }
        for(b=0;b<c;b++)
        {
            for(g=0;g<c-1-b;g++)
            {
                if(st[g].compareTo(st[g+1]) >0)
                {
                    k=st[g];
                    st[g]=st[g+1];
                    st[g+1]=k;
                }
            }
        }
        bin.close();
        Fin.close();
        FileWriter Fout2=new FileWriter("File.dat");
        BufferedWriter Bout2=new BufferedWriter(Fout2);
        PrintWriter Pout2=new PrintWriter(Bout2);
        
        for(b=0;b<c;b++)
        {
            Pout2.println(st[b]);
        }
        Pout2.close();
        Bout2.close();
        Fout2.close();
         FileReader Fin2=new FileReader("File.dat");
        BufferedReader bin2=new BufferedReader(Fin2);
         for(b=0;b<c;b++)
        {
            k=bin2.readLine();
            System.out.println(k);
        }
         bin2.close();
        Fin2.close();
        
    }      
}   