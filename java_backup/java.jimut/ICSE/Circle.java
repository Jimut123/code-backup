import java.io.*;
class Circle
{
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    float r,pi,area,cir;
    Circle()
    {
        pi=(float)3.14;
    }
    Circle(float X)
    {
        r=X;
    }
    float findarea()throws IOException
    {
        area = (float)pi*r*r;
        return(area);
    }
    float findcir()throws IOException
    {
        cir = (float)2*pi*r;
        return(cir);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int r1;
        System.out.println("Enter the radius:");
        r1 = Integer.parseInt(cd.readLine());
        Circle ob = new Circle(r1);
        float ar1=ob.findarea();        
        System.out.println("The area is:"+ar1);
        float cir1=ob.findcir();
        System.out.println("The circumference is:"+cir1);
    }
}
    
    
    