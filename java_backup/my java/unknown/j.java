import java.io.*;
public class j
{
public static void main(String args[])throws IOException     
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int j,d = 9;
      j =++d+d--+ ++d + d--;
      System.out.println(j);
    }
}
