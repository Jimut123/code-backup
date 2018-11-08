//prog. to calculate factorial using exception handlig
import java.io.*;
class ExceptionHandlig
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()
  {
     int n;
     try
     {
        System.out.println("enter a no.");
         n=Integer.parseInt(br.readLine());
        fact(n);
       }
       catch(Exception e)
       {
          System.out.println("numerical value needed");
          input();
         }
     }
  void fact(int n)
     {
        int i,f=1;
        for(i=1;i<=n;i++)
          f=f*i;
        System.out.println("factorial="+f);
       } 
 }