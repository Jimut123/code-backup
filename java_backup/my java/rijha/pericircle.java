import java.io.*;
class pericircle
{
    double r,p;
    double pi;
    pericircle()
    {
        pi=3.14;
        
    }
     pericircle(double x)
    {
       r=x;
       pi=3.14;
       System.out.println("perimeter:"+calperi());
    }
    double calperi()
    {
        //System.out.println(r);
       
        p=2.0*pi*r;
        return p;
    }
    public static void main()throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     double x;
     x=Double.parseDouble(br.readLine());
      pericircle p=new pericircle(x);
    }
}
     
   
    