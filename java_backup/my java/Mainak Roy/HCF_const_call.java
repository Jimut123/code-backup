import java.io.*;
public class HCF_const_call
{
  public static void main(String args[]) throws IOException
  {
      DataInputStream in=new DataInputStream(System.in);
      System.out.println("enetr 1st no.");
      int n1=Integer.parseInt(in.readLine());
      System.out.println("enetr 2nd no.");
      int n2=Integer.parseInt(in.readLine());
      HCF_const h=new HCF_const(n1,n2);
      int r=h.cal();
      System.out.println("HCF = "+r);
    }
}
