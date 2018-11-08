import java.io.*;
class Link
{
  int data;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void input()throws IOException
  {
      System.out.println("enter a number");
       data=Integer.parseInt(br.readLine());
    }
    public void display()
    {
        System.out.println(data+" ");
    }
    Link next;
}
