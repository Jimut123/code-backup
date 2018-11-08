import java.io.*;
class Figures
{
    int area(int l,int b)
    {
        return l*b;
    }//End of area()
    double area(double r)
    {
        return(22/7.0*r*r);
    }//End of area()
    double area(double a,double c,double d)
    {
        double s=((a+c+d)/2);
        return (double)Math.sqrt(s*(s-a)*(s-c)*(s-d));
    }//End of area()
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        double r=Double.parseDouble(br.readLine());
        double a=Integer.parseInt(br.readLine());
        double c=Integer.parseInt(br.readLine());
        double d=Integer.parseInt(br.readLine());
        double areaR=area(l,b);
        double areaC=area(r);
        double areaT=area(a,c,d);
        System.out.println("Area="+areaR);
        System.out.println("Area="+areaC);
        System.out.println("Area="+areaT);
    }//End of main()
}//End of class
