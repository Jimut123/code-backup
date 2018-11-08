
import java.util.*;
public class scankeyboardinput
 {
     
     public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a line of text followed by <enter>:");
          String str = sc.nextLine();
          System.out.println("Entyer an integer followed by <enter>:");
          int i = sc.nextInt();
          System.out.println("enter a floating-point number followed by <enter>:");
          double d = sc.nextDouble();
          System.out.println("you entered....");
          System.out.println(str+" "+ i + " "  + d);
          
        }// end of void main
    }//end of public class       
