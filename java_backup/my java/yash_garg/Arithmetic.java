import java.io.*;
class Arithmetic
{
    /* This program accepts user choice and displays the result of the case */
    public void main()throws IOException
    {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        System.out.println(" 1>. Enter plus symbol for addition ");
        System.out.println(" 2>. Enter minus symbol for substraction ");
        System.out.println(" 3>. Enter star symbol for multiplication ");
        System.out.println(" 4>. Enter backslash symbol for division ");
        System.out.println(" 5>. Enter percentage symbol for remainder ");
        System.out.println(" Enter the user choice ");
        String s;
        s=br.readLine();
        char ch=s.charAt(0);
        double n1,n2;
        switch(ch)
        {
            case '+':
                     n1=Double.parseDouble(br.readLine());
                     n2=Double.parseDouble(br.readLine());
                     double add=n1+n2;
                     System.out.println(" The total of the two is "+add);
                     break;
            case '-':
                     n1=Double.parseDouble(br.readLine());
                     n2=Double.parseDouble(br.readLine());
                     double sub=n1-n2;
                     System.out.println(" The difference of the two is "+sub);
                     break;
            case '*':
                     n1=Double.parseDouble(br.readLine());
                     n2=Double.parseDouble(br.readLine());
                     double mul=n1*n2;
                     System.out.println(" The product of the two is "+mul);
                     break;
            case '/':
                     n1=Double.parseDouble(br.readLine());
                     n2=Double.parseDouble(br.readLine());
                     double div=n1/n2;
                     System.out.println(" The quotient of the two is "+div);
                     break;
            case '%':
                     n1=Double.parseDouble(br.readLine());
                     n2=Double.parseDouble(br.readLine());
                     double rem=n1%n2;
                     System.out.println(" The remainder of the two is "+rem);
                     break;
            default:
                     System.out.println(" Wrong Choice");
                     break;
      }
    }
}