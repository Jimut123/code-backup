import java.io.*;
class lopalo
{
    public static void main(String args[])throws IOException
    {
     InputStreamReader ab = new InputStreamReader(System.in);
     BufferedReader cd = new BufferedReader(ab);
     for(int i = 3;i>1;i++)
     {
         System.out.println((char)i);
         for(int j=0;j<20000000;j++);

        }
    }
}
              