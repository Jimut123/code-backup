import java.io.*;
public class sum implements abd
{
   int s,i,f,a,b,n;
   void input()throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the number");
       n=Integer.parseInt(br.readLine());
       cal(n);
    }
  public int fact(int n)
   {
       f=1;
       int i,f;f=1;i=1;
       for(i=1;i<=n;i++)
       {
           f=f*i;
        }
        return f;
    }
   void cal(int n)
   {
       int b;b=0;a=0;
       s=0;
       for(i=n;i>0;i=i/10)
       {
           a=i%10;
           b=fact(a);
           s=s+b;
        }
    System.out.println(s);
}

}


    
   