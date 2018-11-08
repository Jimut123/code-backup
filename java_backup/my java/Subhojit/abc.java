import java.io.*;
class abc
{
    public static void main()throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int a,b,c;
       a=Integer.parseInt(br.readLine());
       b=Integer.parseInt(br.readLine());
       c=a+b;
       System.out.println(c);
    }
}
