
import java.io.*;
public class Labour
{
   //public static void main(String args[])throws  IOException
  public static void input(int a,int b,int d,int charge)throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 //int a,int b,int d,int charge;
    
// public static void input(int a,int b,int d,int charge)
      System.out.println("Enter ph.no:");
      a=Integer.parseInt(br.readLine());
      System.out.println("Enter bike.no:");
      b=Integer.parseInt(br.readLine());
      System.out.println("Enter no.of days:");
      d=Integer.parseInt(br.readLine());
    System.out.println("Charge=");
    charge=Integer.parseInt(br.readLine());
    }
      //compute(a,b,d);
public static void compute(int a,int b,int d)
{
 int charge=0;
 if(d<=5)
 {
     charge=(500*d);
}
else if((d>5) && (d<=10))
{
 charge=(500*5)+ (400*(d-5));
}
else if(d>10 && d<=20)
{
charge=(500*5)+(400*5)+(300*(d-5));
}
 else 
 {
     charge=(500*5)+(400*5)+(300*5)+(200*(d-10));
    }
    display(a,b,d,charge);
}

   public  static void display(int a,int b,int d,int charge)
{
  System.out.println("Phone number ="+a);
  System.out.println("Bike number ="+b);
  System.out.println("Days ="+d);
  System.out.println("Charge ="+charge);
}
}