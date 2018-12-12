import java.io.*;
class interest
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int p,r,y;
    double ci,a,ra;
    System.out.print("Enter Principal : ");
    p=Integer.parseInt(br.readLine());
    System.out.print("Enter rate : ");
    r=Integer.parseInt(br.readLine());
    System.out.print("Enter number of years : ");
    y=Integer.parseInt(br.readLine());
    ra=1+(double)r/100;
    ci = p * Math.pow(ra,y);
    a = p + ci;
    System.out.println("Interest : "+ci);
    System.out.println("Amount : "+a);
  }
}