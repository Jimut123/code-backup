//the main program of linklist which has the menu
import java.util.*;
public class LinklistMain 
    {
        public static void main(String args[])
        {
            int ch;//data members
            int d;
            Linklist ob=new Linklist();//creating an object of class linklist
            while(true)
            {
                System.out.println(" enter 1 to insert in the beginning,2 to insert in the middle,3 to insert at the end,4 to dislay,5 to search a number,6 to count the number of nodes,7 to delete a node and 8 to exit ");
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your choice ");
                ch=sc.nextInt();//taking the choice of the user
                switch(ch)//menu driven programming
                {
                    case 1:System.out.println("Enter the number to be inserted ");
                    d=sc.nextInt();
                    ob.addAtBeg(d);
                    break;
                    case 2:System.out.println("Enter the element to be added and the node number after which it will be inserted ");
                    d=sc.nextInt();
                    int n=sc.nextInt();
                    ob.addAtMid(d,n);
                    break;
                    case 3:System.out.println("Enter the element to be inserted ");
                    d=sc.nextInt(); 
                    ob.addAtEnd(d);
                    break;
                    case 4:ob.display();
                    break;
                    case 5:System.out.println("Enter the number to be searched ");
                    int m=sc.nextInt();
                    ob.search(m);
                    break;
                    case 6:int c=ob.countNode();
                    System.out.println("The number of nodes is = "+c);
                    break;
                    case 7:System.out.println("Enter the value to be deleted ");
                    d=sc.nextInt();
                    ob.deleNode(d);
                    break;
                    case 8:System.exit(0);
                }//end of switch
            }//end of while
        }//end of function
    }//end of class
            
                    