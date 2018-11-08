//
import java.io.*;
class borrow1
{
     int ch;
     int bookch;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public int mem=10071;
    public int member[][]=new int[3][10];   
    //Management obj9=new Management();
        public void working(String books[][],int book_id[][],int mem,int member[][],int book_no[][])throws IOException
    {
        int f=0;
        do
        {
            System.out.println("What kind of book do you want? \n Enter 1 for fiction  \n Enter 2 for reference  \n Enter 3 for magazine and journals  \n Enter 4 for comics ");
            ch=Integer.parseInt(br.readLine());
        }while(ch!=1&&ch!=2&&ch!=3&&ch!=4);
        System.out.println("The books available are--");
        for(int i=0;i<5;i++)
        {
            if(book_no[ch-1][i]!=0)
            System.out.println(books[0][i]+"  Code__  "+book_id[ch-1][i]);
        }
        selection(ch,books,book_id,mem, member,book_no);   
    }    
    public void selection(int ch,String books[][],int book_id[][],int mem,int member[][],int book_no[][])throws IOException
    {
        System.out.println("                             ENTER NAME OR PART OF THE NAME OF YOUR DESIRED BOOK");
        String book=br.readLine();
        int f=1;
        
            for(int j=0;j<books[0].length;j++)
            {
                 if(books[ch-1][j].indexOf(book)>=0)
                 
                     System.out.println("                             "+f++ +".  "+ books[ch-1][j]+"  Book id "+book_id[ch-1][j]);
            }
        int b=0;
        if(f==1)
        {
            System.out.println("                             SORRY!! BOOK NOT AVAILABLE \n                              PRESS 1 TO BORROW ANY OTHER BOOK ");
            int av=Integer.parseInt(br.readLine());
            if(av==1)
               working(books,book_id,mem,member,book_no);
            else
            {
               System.out.println("                             THANK YOU ");
               System.exit(0);
            }
        }
        System.out.println("                             IS YOUR BOOK AMONG THE LISTED ONES?  PRESS 1 FOR YES");
        int g=Integer.parseInt(br.readLine());
        if(g!=1)
        System.exit(0);        
        System.out.println("Are you a new member?(y/n)");
        String newch=br.readLine();
        if(newch.equalsIgnoreCase("y"))
        {
        regis();
        borrowForm(books,book_id,mem,member,book_no );        
        }
        else
        borrowForm(books,book_id,mem,member,book_no );      
    }
    
    public void borrowForm(String books[][],int book_id[][],int mem,int member[][],int book_no[][])throws IOException  //to accept the input from user
     { 
        int m;        
        System.out.println("                             PLEASE FILL IN YOUR BOOK BOROWING FORM --  \n                              MEMBER ID(only the last digit)");
        m=Integer.parseInt(br.readLine());
        if(m<=10070 || m>mem)
        {
        m=0;
        System.out.println("You are not an existing member . Do you want to be a member now?(y/n)");
        String choice=br.readLine();
        if (choice.equalsIgnoreCase("y"))
        regis();
        else
        System.exit(0);
        }        
        System.out.println("                                        ID of the borrowed book");
        int b_id=Integer.parseInt(br.readLine());
        System.out.println("                                        BORROW DATE");
        member[2][(m-1)%10]=Integer.parseInt(br.readLine());
        
        System.out.println("                                        Please return the book within 7 days");
        System.out.println("                             NOW YOU MAY BORROW YOUR DESIRED BOOK");        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(book_id[i][j]==b_id)
                
                book_no[i][j]--;
            }   
        } 
        
    }
    public void regis()throws IOException  //to accept the input from user
    {       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int mem;
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
    
}
        
           
        
        
                    
        