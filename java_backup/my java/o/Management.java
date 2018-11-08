
//mangement of the book in the library
import java.io.*;
class Management
{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         public String books[][]={{"Harry Potter","Twilight","Angels and Demons","Oliver Twist","Chicken Soup"," "},{"Self Tutor","Concise Physics","Candid Chemistry","Self Study in Biology","Julius Caesar"," "},{"Vogue","Femina","The Traveller","India Today","Graphitti"," "},{"Tintin","Spiderman","Archie","Superman","Richie Rich"," "}};
         public int book_id[][]={{1001,1002,1003,1004,1005,0},{2001,2002,2003,2004,2005,0},{3001,3002,3003,3004,3005,0},{4001,4002,4003,4004,4005,0}};
         public int book_no[][]=new int[5][7];         
         borrow1 obj1=new borrow1();         
         public int mem=10071;
         Return obj2=new Return();
         public int member[][]=new int[3][10];         
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
    public void regis()throws IOException  //to accept the input from user
    {       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                             PLEASE FILL IN YOUR REGISTRATION FORM --  \n                                             NAME");
        String name=br.readLine();
        System.out.println("                                             GENDER");
        String gender=br.readLine();
        System.out.println("                                             OCCUPATION");
        String occ=br.readLine();
        System.out.println("                                             ADDRESS");
        String add=br.readLine();
        System.out.println("                                             CONTACT NO.");
        long phone=Long.parseLong(br.readLine());
        int s=(mem-1)%10;
        member[0][s]=mem;
        System.out.println("                                     YOUR MEMBER ID IS "+mem++);     
    }
    
    public void newEntry(String books[][],int book_id[][])throws IOException
    {
        System.out.println("Enter the type of book \n Enter 1 for fiction  \n Enter 2 for reference  \n Enter 3 for magazine and journals  \n Enter 4 for comics ");
        int ch=Integer.parseInt(br.readLine());
        System.out.println("Enter the book name");
        books[ch-1][5]=br.readLine();
        System.out.println("Enter the book id");
        book_id[ch-1][5]=Integer.parseInt(br.readLine());
    }        
}
    
    
    