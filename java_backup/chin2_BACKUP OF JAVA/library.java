import java.io.*;
public class library
{
   int acc_num;
   String title , author;
   public static void main(String args[]) throws IOException
   {
       library abc = new library();
       abc.input();
       abc.compute();
       abc.display();
   }
   public void input()throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("ENTER THE ACCESSION NUMBER:");
       acc_num = Integer.parseInt(br.readLine());
       System.out.println("ENTER THE TITLE OF THE BOOK:");
       title = br.readLine();
       System.out.println("ENTER THE NAME OF THE AUTHOR OF THE BOOK:");
       author = br.readLine();
   }
   public void compute()throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("ENTER THE NUMBER OF DAYS LATE:");
       int late = Integer.parseInt(br.readLine());
       System.out.println("YOUR FINE IS  = Rs."+(late*2));
   }
   public void display()
   {
       System.out.println("ACCESSION NUMBER                        TITLE                          AUTHOR");
       System.out.println();
       System.out.println("     "+acc_num+"                          "+title+"                  "+author);
       System.out.println("                                        ");
       System.out.println("                                       THANK YOU ");
   }
}
