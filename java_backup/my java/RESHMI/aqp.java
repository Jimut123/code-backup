import java.io.*;
class aqp
{
  int a,b,c;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()throws IOException

  {
      System.out.println("Enter values");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      c=sum(a,b);
      System.out.print(c);
    }

      int sum(int x,int y)
      {
          a=x;
          b=y;
          c=a+b;
          return c;
        }
    }
    
    