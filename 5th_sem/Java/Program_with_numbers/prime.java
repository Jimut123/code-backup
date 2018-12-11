import java.io.*;
class prime
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n,i,c,num;
    System.out.print("Enter a number : ");
    n=Integer.parseInt(br.readLine());
    num=n;
    System.out.println("Factor\tPower");
    for(i=2;i<=n;i++)
    {
       c=0;
       while(n%i == 0)
       {
         ++c;
         n=n/i;
       }
       if(c>0)
       System.out.println(i+"\t"+c);
    }
  }
}