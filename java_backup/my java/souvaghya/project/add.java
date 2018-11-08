package project;

import java.io.*;
class add
{
    int a,b,c;
    double x,y,z;
    String k,l,m;
    add()
    {
    }
    add(int m,int n)
    {
        a=m;
        b=n;
        c=a+b;
        System.out.println(c);
    }
    add(double x1,double y1)
    {
        x=x1;
        y=y1;
        z=x+y;
        System.out.println(z);
    }
     add(String k1,String l1)
    {
        k=k1;
        l=l1;
        m=k+l;
        System.out.println(m);
    }
    public void main()throws IOException
    {
        int x,y,z;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer Values:");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        //System.out.println("Enter value");
        add a=new add(x,y);
        double a1,b;
         System.out.println("Enter Double Values:");
        a1=Double.parseDouble(br.readLine());
        b=Double.parseDouble(br.readLine());

        add a2=new add(a1,b);
        String k,l;
         System.out.println("Enter String Values:");
        k=br.readLine();
        l=br.readLine();
        
        add a3=new add (k,l);
    }
}