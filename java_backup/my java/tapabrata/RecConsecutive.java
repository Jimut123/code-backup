//displaying consecutive characters of a string using recursion
import java.io.*;
class RecConsecutive
{
  String s;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void get()throws IOException
  {
      int i,l,pos;
      System.out.println("enter a string");
       s=br.readLine();
      l=s.length();
      for(i=0;i<l;i++)
      {
          pos=(int)s.charAt(i);
          find(pos);
        }
    }
    public void find(int p)
    {
        int i,n;
        char c;
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if ((int)c==(p+1))
            {
                System.out.println((char)p+","+c);
                n=(int)c;
                find(n);
            }
        }
        return;
    }
}