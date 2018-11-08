import java .io.*;
public class patteronology
{
  public static void main(String args[])
  {
       int j,i;
        for (i = 1 ; i<=5; i++)
        {
        for (j = 1 ; j<=i; j++);
        System.out.println(j);
        for (j = i -1 ;j >= 1; j--)
        System.out.println(j);
       System.out.println(" ");
        }
  }
}
