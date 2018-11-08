import java.io.*;
public class file_ar
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,fl;
        System.out.println("Enter limit");
        a=Integer.parseInt(br.readLine());
        
        int ar[]=new int[a];
        for(b=0;b<a;b++)
        {
            System.out.println("Enter element");
            ar[b]=Integer.parseInt(br.readLine());
        }
        FileWriter f1=new FileWriter("even.txt");
        BufferedWriter b1=new BufferedWriter(f1);
        PrintWriter p1=new PrintWriter(b1);
        for(b=0;b<a;b++)
        {
            if(ar[b]%2==0)
            {
                p1.println(ar[b]);
                
            }
        }
        p1.close();
        b1.close();
        f1.close();
        FileWriter f2=new FileWriter("ODD.txt");
        BufferedWriter b2=new BufferedWriter(f2);
        PrintWriter p2=new PrintWriter(b2);
        for(b=0;b<a;b++)
        {
            
            if(ar[b]%2!=0)
            {
                p2.println(ar[b]);
            }
        }
        p2.close();
        b2.close();
        f2.close();
         FileWriter f3=new FileWriter("prime.txt");
        BufferedWriter b3=new BufferedWriter(f3);
        PrintWriter p3=new PrintWriter(b3);
        for(b=0;b<a;b++)
        {
            fl=1;
            for(c=2;c<ar[b]/2;c++)
            {
                if(ar[b]%2==0)
                {
                    fl=2;
                    break;
                }
            }
            if(fl==2)
            {
                p3.println(ar[b]);
            }
        }
    }
}
    