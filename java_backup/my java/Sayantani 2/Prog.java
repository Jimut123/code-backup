import java.util.*;
class Prog
{
    public static void main(String[]args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println ("Input a String");
           String s;
           s=sc.nextLine ();
           for (int i=0; i< s.length(); i++)
           {
               for (int j=0; j<=i; j++)
               System.out.print(s.charAt(j));
               System.out.println("");
            }
        }
    }