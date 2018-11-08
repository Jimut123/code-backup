//sachin ramesh tendulkar
//tendulkar sachin ramesh
import java.io.*;
public class word_swap
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s;
    public void input(String args[])throws IOException
    {
        System.out.println("enter name");
        s=br.readLine();
        calc();
    }
    int i, l, pos;
    public void calc()
    {
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
              pos=i;
              break;
            }
        }
        for(i=pos+1;i<l;i++)
        System.out.print(s.charAt(i));
        System.out.print(" ");
        for(i=0;i<pos;i++)
        System.out.print(s.charAt(i));
    }
}
              