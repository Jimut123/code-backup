//returning the book
import java.io.*;
class Return
{
       private int mem2;
       public int book_no[][]=new int[5][7];    
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //Management obj11=new Management();
    borrow1 obj1=new borrow1();
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
        accept();
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
        accept();
        else
        System.out.println("Thank You");
     
    }   
    public void accept()throws IOException
         {   
             for(int i=0;i<5;i++)
             {
                 for(int j=0;j<5;j++)
                 {
                      book_no[i][j]=5;
                 }
             }
             System.out.println(" *        *  * ** *   * ** *    *  *   * ** *   *       * ");
             System.out.println(" *        *  *     *  *     *  *    *  *     *    *   * ");
             System.out.println(" *        *  * ** *   * ** *   * ** *  * ** *       * ");
             System.out.println(" *        *  *     *  *  *     *    *  *  *         * ");
             System.out.println(" * * * *  *  * ** *   *   **   *    *  *   **       * "); 
             System.out.println(" BY Sayantani Ghosh and Minakshi Paul  \n   Standard - X  \n    School-  Salt Lake School  \n Topic-  Library Management");
             System.out.println("                             WELCOME TO THE NATIONAL LIBRARY \n                             Rules of the library \n                          •  You have to be a registered member to borrow books.\n                          •	You cannot borrow more han one book at a time. \n                          •  Your member_id is your identity in the library.Please remember it. \n                          •	You can borrow a book for a week.For further time you need to renew the book. \n                          •  If your due date of returning the book passes before retuning the book then you will be \n                             personally contacted by the library.Legal action may be taken if the book is not returned \n                             within a week after the due date.");
             System.out.println("                                        What would you like to do? \n                                        Press 1 for borrow book \n                                        Press 2 for return book \n                                        Press 3 for renew book \n                                        Press 4 for registering as a new member\n                                        Press 5 to update the library stock");
             int co=Integer.parseInt(br.readLine());
             switch(co)
             {
                 case 1:obj1.working(books,book_id,mem,member,book_no);
                        break;
                 case 2:obj2.isReturning(books,book_id,mem,member,book_no);
                        break;
                 case 3:obj2.renew(books,book_id,mem,member,book_no);
                        break;
                 case 4:regis();
                        System.out.println("Do you want to borrow any book??(y/n)");
                        String c=br.readLine();
                        if(c.equalsIgnoreCase("y"))
                        obj1.working(books,book_id,mem,member,book_no);
                        else
                        System.out.println("Thank You!!");
                        break;
                 case 5:newEntry(books,book_id);
                        break;
                default:System.out.println("Invalid entry");
                
             }
         }    
}