
//returning the book
import java.io.*;
class r
{
       private int mem2;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Management obj11=new Management();
    public void isReturning(String books[][],int book_id[][],int mem,int member[][],int book_no[][])throws IOException
    {
        boolean res;        
        int id;
        do
        {
         System.out.println("Enter your member id");
         mem2=Integer.parseInt(br.readLine());
         res=check( mem);
        }while(res==false);
        do
        {
          
          System.out.println("Enter your book id");
          id=Integer.parseInt(br.readLine());
        }while(member[1][(mem2-1)%10]!=id);
        System.out.println("Enter today's date---");
        int date=Integer.parseInt(br.readLine());
        int fine=member[2][(mem2-1)%10];
        System.out.println("Your fine is Rs. "+fine);
        book_no[id/1000][id%1000]++;
        System.out.println("Would you like to do anything else?(y/s)");
        String c=br.readLine();
        if(c.equalsIgnoreCase("y"))
        obj11.accept();
        else
        System.out.println("Thank You");
    }
        
    public boolean check(int mem)
    {
         if(mem2<=10070 || mem2>mem)
         {
            mem2=0;
            System.out.println("Invalid memeber id.");
            
            return false;
        }
        return true;
    }
    public void renew(String books[][],int book_id[][],int mem,int member[][],int book_no[][])throws IOException
    {
        int id;
        boolean res;
        do
        {
         System.out.println("Enter your member id");
         mem2=Integer.parseInt(br.readLine());
         res=check(mem);
        }while(res==false);
        do
        {
          
          System.out.println("Eenter your book id");
          id=Integer.parseInt(br.readLine());
        }while(member[1][(mem2-1)%10]!=id);
       System.out.println("Enter today's date ");
       int date=Integer.parseInt(br.readLine());
       member[2][(mem2-1)%10]=date;
       System.out.println("Would you like to do anything else?(y/s)");
        String c=br.readLine();
        if(c.equalsIgnoreCase("y"))
        obj11.accept();
        else
        System.out.println("Thank You");
     
    }   
}