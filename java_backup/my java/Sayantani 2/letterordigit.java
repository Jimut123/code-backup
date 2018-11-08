import java.util.*;
   
 class letterordigit
   {
       public static void main(String[]args)
      
       {
           
           System.out.println("Please enter an element");
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           char c=s.charAt(0);
           if (c>= 'A' && c<= 'Z' || c>='a' && c<='z')
           System.out.println("Letter");
           else
           if (c>='0' && c<='9')
            System.out.println("Digit");
            else
            System.out.println("None of these");
        }
    }
           