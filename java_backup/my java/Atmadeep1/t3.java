import java.io.*;
class area
{
int a,ar,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void sq()throws IOException
{
 System.out.println("enter side");
 a=Integer.parseInt(br.readLine());
 ar=a*a;
 System.out.println("area of square="+ar);
}
 void rec()throws IOException
 {
  System.out.println("enter length");
  a=Integer.parseInt(br.readLine());
  System.out.println("enter breadth");
  b=Integer.parseInt(br.readLine());
  ar=a*b;
  System.out.println("area of rectangle="+ar);
 }
  void tri()throws IOException
  {
   System.out.println("enter heigth");
   a=Integer.parseInt(br.readLine());
   System.out.println("enter base");
   b=Integer.parseInt(br.readLine());
   ar=(a*b)/2;
   System.out.println("area of triangle="+ar);
  }
   void cir()throws IOException
   {
    System.out.println("enter radius");
    a=Integer.parseInt(br.readLine());
    ar=(22/7)*(a^2);
    System.out.println("area of circle="+ar);
   }
}
 class t3
 {
  public static void main(String args[])throws IOException
  {
   area a=new area();
   a.sq();
   a.rec();
   a.tri();
   a.cir();
  }
 }
