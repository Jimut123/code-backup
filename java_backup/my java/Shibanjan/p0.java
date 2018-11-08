import java.io.*;
class p0
{
  InputStreamReader read=new InputStreamReader(System.in);
  BufferedReader in=new BufferedReader(read);
  String s;int k;
  void input()throws IOException
  {
    s=in.readLine();
    k=palincheck(s);
    if(k==1)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("not palindome");
    }
  }
  int palincheck(String s)
  {
    String m="";
    for(int i=s.length()-1;i>=0;i--)
    {
      char w=s.charAt(i);
      m=m+w;
    }
    if(m.equalsIgnoreCase(s)==true)
    {
      k=1;
      
    }
    else
    {
      k=0;
      
    }
return k;
  }
  public static void main(String arg[])throws IOException
  {
    p0 p=new p0();
    p.input();
  }
}  