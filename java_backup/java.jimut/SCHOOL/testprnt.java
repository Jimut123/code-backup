import java.io.*;
class testprnt
{
    int i;
    void print(int x)
    {
        System.out.println("printing"+x);
    }
    void print1()
    {
      for(i=1;i<=10;i++)
      {
         print(i);
        }
    }
    public static void main(String args[])throws IOException
    {
        testprnt ob = new testprnt();
        
        ob.print1();
    }
}