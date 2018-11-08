import java.io.*;
class ssum
{
    int m;double s;int p;String w;
   
    ssum(int i,int j)
    {
        m=i+j;
        System.out.print(m);
    }
    ssum(double a,double b)
    {
        s=a+b;
        System.out.print(s);
    }
    ssum(char c,char d)
    {
        p=c+d;
        System.out.print(p);
    }
    ssum(String f,String k)
    {
        w=f+k;
        System.out.print(w);
    }
    public static void main(String args[])throws IOException
    {
        int m,n;double p,q;char d,k;String b,c;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer data:");
         m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        ssum a=new ssum(m,n);
        System.out.println("Enter Double data:");
         p=Double.parseDouble(br.readLine());
        q=Double.parseDouble(br.readLine());
        ssum a1=new ssum(p,q);
        System.out.println("Enter Character data:");
         d=(char)System.in.read();
        k=(char)System.in.read();
        ssum a2=new ssum(d,k);
        System.out.println("Enter String data:");
        b=br.readLine();
        c=br.readLine();
        ssum a3=new ssum(b,c);
        
    }
}
        