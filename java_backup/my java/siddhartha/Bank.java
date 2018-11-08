import java.io.*;
class Bank
{
int a,bal,with,dep;
    String n; 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()throws IOException
  {
   bal=500; 
   name();
   Accno();
   deposit();
   withdraw();
   display();
    }
    void name()throws IOException
    {
        System.out.println("Enter name:");
        n=br.readLine();
        }
    void Accno()throws IOException
    {
        System.out.println("enter Acc.no:");
        a=Integer.parseInt(br.readLine());
    } 
       void deposit()throws IOException
    {
      System.out.println("enter amt. of deposit:");
     dep=Integer.parseInt(br.readLine());
    bal=dep+bal;
    System.out.println("your balance:"+bal);
    }
    void withdraw()throws IOException
    {
        System.out.println("enter amt. of withdraw:");
        with=Integer.parseInt(br.readLine());
        bal=bal-with;
        System.out.println("Your balance:"+bal);
    }
    void display()
    {
        System.out.println("Name"+"  "+"Acc.no."+"  " +"balance");
        System.out.println(n+"  "+a+"  " +bal);
    }
}

        
    