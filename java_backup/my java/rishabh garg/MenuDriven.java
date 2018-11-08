import java.io.*;
class MenuDriven 
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Press 1 to find area of circle or press 2 to find area of square or 3 to find area of rectangle");
        int i;
        i=Integer.parseInt(br.readLine());
        if (i==1)
        {
            System.out.println("Enter the radius");
            Double r=Double.parseDouble (br.readLine());
            Double arc= 3.14*r*r;
            System.out.println("Area is "+arc);
        }
        else if(i==2)
        {
            System.out.println("Enter side");
            Double s=Double.parseDouble (br.readLine());
            Double ars= s*s;
            System.out.println("Area is "+ars);
        }
        else if (i==3)
        {
            System.out.println("Enter the length");
            Double m=Double.parseDouble (br.readLine());
            System.out.println("Enter the breadth");
            Double n=Double.parseDouble (br.readLine());
            Double art= m*n;
            System.out.println("Area is " +art);
        }
    }
}
           
            
          
        
    