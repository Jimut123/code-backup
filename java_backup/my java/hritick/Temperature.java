import java.io.*;
class Temperature
{
    public static void main ()throws IOException
    {
      int c,f;
      InputStreamReader read =new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader (read);
      c=Integer.parseInt(br.readLine());
      f=9*c+160/5;
      System.out.println(f);
    }
}
