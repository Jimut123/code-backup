import java.io.*;
class bank_account
{
    long acno;
    char tac;
    String name;
    int ba;
    bank_account()
    {
        acno=0;
        tac=' ';
        name="";
        ba=0;
    }
    bank_account(long a,String b,char c,int d)
    {
        acno=a;
        tac=c;
        name=b;
        ba=d;
    }
    void deposit(int d1)
    {
        ba=ba+d1;
    }
    void withdraw(int w)
    {
        ba=ba-w;
    }
    void display()
    {
        System.out.println("Balance :: "+ba);
        System.out.println("Name :: "+name);
        System.out.println("Account number :: "+acno);
        System.out.println("Type of account :: "+tac);
    }
    /*
   public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        long a1;
        String b1;
        char c1;
        int d1,e1,f1;
        System.out.println("Enter your name:");
        b1=cd.readLine();
        System.out.println("Enter your account number:");
        a1=Long.parseLong(cd.readLine());
        System.out.println("Enter your type of account:");
        c1=(char)(cd.readLine());
        System.out.println("Enter your balance:");
        d1=Integer.parseInt(cd.readLine());
        System.out.println("Enter your withdrawal:");
        e1=Integer.parseInt(cd.readLine());
        System.out.println("Enter your deposits:");
        f1=Integer.parseInt(cd.readLine());
        bank_account ob = new bank_account();
        ob.deposit( d1);
        ob.withdraw(e1);
        ob.display();
    } **/
   
}
        
        
        
        
        
        
        
        