//Input length and breadth of a rectangle and calculate area and perimeter//
import java.io.*;
class calculation
{
    public static void main(String args[])throws IOException
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
   int l,b,a,p;
   System.out.println("enter data:");
   l=Integer.parseInt(br.readLine());
   b=Integer.parseInt(br.readLine());
   a = l * b;
   p = 2*(l*b);
    System.out.println(a);
    System.out.println(p);
}
}
    