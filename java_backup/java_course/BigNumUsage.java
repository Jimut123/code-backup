import java.io.*;
public class BigNumUsage
{
  public static void main()throws IOException
  {
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    System.out.println("\f");
    String n,m;
    System.out.println("Enter a big number");
    n=cd.readLine();
    System.out.println("Enter another big number");
    m=cd.readLine();
    BigNum x=new BigNum(n);
    BigNum y=new BigNum(m);
    System.out.println(" "+x.msp+""+x.lsp);
    System.out.println(" "+y.msp+""+y.lsp);
    BigNum z=x.Add(y);
    System.out.println(z.msp+""+z.lsp);
}
}
