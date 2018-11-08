import java.io.*;
class ISBN 
{
   String s,s1;double s2;
   void isbn()
   {
      s="";
      s1="";
      s2=0.0;
    }
    void input()throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the no.");
      s=br.readLine();
      cal();
    }
    void cal()
    {
      int p=10;
      int l=s.length();
      if(l!=10)
      {
          System.out.println("Not an ISBN no.");
          System.out.println("There should be 10 no.");
        }
      else
      {
          if(s.charAt(l-1)=='x')
          {
             for(int i=0;i<l-1;i++)
             {
               s2=s2+((s.charAt(i)-48)*p);
               p--;
            }
            s2=s2+(10*1);
        }
        else
        {
           for(int i=0;i<l;i++)
           {
              s2=s2+((s.charAt(i)-48)*p);
              p--;
            }
        }
    }
    check();
}
void check()
{
    if(s2%11==0)
    {
        System.out.println("ISBN no.");
    }
    else
    {
        System.out.println("Not an ISBN no.");
    }
}
}
/**
 * Enter the no.
0201103331
Not an ISBN no.

Enter the no.
097522980x
ISBN no.
 */
