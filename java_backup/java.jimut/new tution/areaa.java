import java.io.*;
class areaa
{
    float area(float n,int r,int side,int length ,int breadth );
     {
         {
             int ac , as , ar;
             ac = ((float)(3.14))*r*r;
             as = (side *side);
             ar = (length*breadth);
         }
      return(ac);
      return(as);
      return(ar);
    }
    public static void main(String args[]) throws IOException
    
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        area ob = new area();
        int rad,side1,length1,breadth1,as1,ar1;
        float ac1;
        System.out.println("enter the radius of the circle");
        rad = Integer.parseInt(cd.readline());
        System.out.println("enter the side of square");
        side1 = Integer.parseInt(cd.readline());
        System.out.println("enter the length and breadth of rectangle");
        length1 = Integer.parseInt(cd.readline());
        breadth1 = Integer.parseInt(cd.readline());
        ac1 = ob.area(rad);
        as1 = ob.area(side1);
        ar1 = ob.area(length1,breadth1);
        System.out.println("Area of circle"+ac1);
        System.out.println("Area of square"+as1);
        System.out.println("Area of rectangle"+ar1);
    }
}
        
        
        
       