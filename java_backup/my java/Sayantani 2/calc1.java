import java.util.*;
class calc1
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      
          int a,b,c;
          String ch;
                     
              System.out.println("Press + for Addition:");
              System.out.println("Press - for Sutraction:");
              System.out.println("Press * for Multiplication:");
              System.out.println("Press / for Division:");
              System.out.println("Press % for Remainder:");
              System.out.println("Press E for Exit:");
              System.out.println("Enter Choice:");
              ch=sc.nextLine();
              switch(ch.charAt(0))
              {
                  case '+':        System.out.println("Enter data:");
                                    a=sc.nextInt();
                                    b=sc.nextInt();
                                   c=a+b;
                                   System.out.println(c);
                                   break;
                                   
                  case '-':        System.out.println("Enter data:");
                                    a=sc.nextInt();
                                    b=sc.nextInt();
                                   c=a-b;
                                   System.out.println(c);
                                   break; 
                  
                  case '*':        System.out.println("Enter data:");
                                    a=sc.nextInt();
                                    b=sc.nextInt();;
                                   c=a*b;
                                   System.out.println(c);
                                   break; 
                                   
                  case '/':        System.out.println("Enter data:");
                                    a=sc.nextInt();
                                    b=sc.nextInt();;
                                   c=a/b;
                                   System.out.println(c);
                                   break; 
                                   
                  case '%':        System.out.println("Enter data:");
                                    a=sc.nextInt();
                                    b=sc.nextInt();;
                                   c=a%b;
                                   System.out.println(c);
                                   break;
                                   
                  case 'E':        System.exit(0);
                                   break;
                  default:         System.out.println("Entered wrong choice:");
                }
            
                
            
        }
    }
                                  