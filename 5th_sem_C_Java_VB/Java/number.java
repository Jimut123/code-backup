import java.io.*;
class number
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    int l,f,fa,i,na;
    long n=0;
    System.out.print("Enter a number = ");
    s=br.readLine();
    l=s.length();
    fa=s.charAt(0)-48;
    f=fa;
    if(fa<l)
    {
       for(i=1;i<=fa;i++)
       {
          na=s.charAt(i)-48;
          n=n+na*(long)Math.pow(10,--f);  
       }
     }
     else
     {
       f=l-1;
       for(i=1;i<l;i++)
       {
          na=s.charAt(i)-48;
          n=n+na*(long)Math.pow(10,--f);  
       }
     }
     System.out.println("The number "+n+" * 3  = "+n*3);
  }
}