import java.util.*;
public class demo
 {
     public void main()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Input name,roll number,marks");
          String str = sc.nextLine();
          int r = sc.nextInt();
          double m = sc.nextDouble();
          double m1 = sc.nextDouble();
          double m2 = sc.nextDouble();
         double tot = m+m1+m2;
          double avg = tot/2;
          System.out.println("the average"+avg);
        }//end of void main
    }//end of public class      
     