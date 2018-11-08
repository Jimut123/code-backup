import java.io.*;
class calculator
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
          int a,b,c;
          char ch;
          
             
              System.out.println("Press + for Addition:");
              System.out.println("Press - for Sutraction:");
              System.out.println("Press * for Multiplication:");
              System.out.println("Press / for Division:");
              System.out.println("Press % for Remainder:");
              System.out.println("Press E for Exit:");
              System.out.println("Enter Choice:");
              ch=(char)System.in.read();
              switch(ch)
              {
                  case '+':        System.out.println("Enter data:");
                                    a=Integer.parseInt(br.readLine());
                                    b=Integer.parseInt(br.readLine());
                                   c=a+b;
                                   System.out.println(c);
                                   break;
                                   
                  case '-':        a=Integer.parseInt(br.readLine());
                                   b=Integer.parseInt(br.readLine());
                                   c=a-b;
                                   System.out.println(c);
                                   break; 
                  
                  case '*':        a=Integer.parseInt(br.readLine());
                                   b=Integer.parseInt(br.readLine());
                                   c=a*b;
                                   System.out.println(c);
                                   break; 
                                   
                  case '/':        a=Integer.parseInt(br.readLine());
                                   b=Integer.parseInt(br.readLine());
                                   c=a/b;
                                   System.out.println(c);
                                   break; 
                                   
                  case '%':        a=Integer.parseInt(br.readLine());
                                   b=Integer.parseInt(br.readLine());
                                   c=a%b;
                                   System.out.println(c);
                                   break;
                                   
                  case 'E':        System.exit(0);
                                   break;
                  default:         System.out.println("Entered wrong choice:");
                }
            
                
            
        }
    }
                                  