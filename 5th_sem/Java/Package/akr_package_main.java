//akr_package_main.java : Write a program to calculate
//sum, average and product of two numbers using defined package.
import java.io.*;
import akr_package.Calculate;
class akr_package_main
{
  public static void main(String args[])throws IOException
  {
    int x,y,s,p;
    float avg;
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("\nEnter 1st number = ");
    x=Integer.parseInt(br.readLine());
    System.out.print("\nEnter 2nd number = ");
    y=Integer.parseInt(br.readLine());
    Calculate C = new Calculate();
    s = C.sum(x,y);
    p = C.product(x,y);
    avg = C.average(x,y);
    System.out.println("x = "+x+" y = "+y+" x + y = "+s+" x*y = "+p+" (x+y)/2 = "+avg);
  }
}