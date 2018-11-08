import java.util.*;
class Telephone
{
    String name="";
    int code;
    String Tno="";
    void accept()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter name ");
        name=sc.nextLine();
        System.out.print("Enter Tno ");
        Tno=sc.nextLine();
        System.out.print("Enter code ");
        code=sc.nextInt();
        
    }
    void display()
    {
        System.out.println("Name "+name);
        System.out.println("Code "+code);
        System.out.println("Tno "+Tno);
    }
}
    