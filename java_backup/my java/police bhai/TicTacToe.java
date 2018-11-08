import java.util.*;
public class TicTacToe
    {
        public static void main(String args[]) 
        {
            Scanner sc=new Scanner(System.in);
            int ch;
            System.out.println("1. Human vs Computer 2. Human vs Human. Enter your choice(1 or 2)");
            ch=sc.nextInt();
            if(ch==1)
            {
                HumanVsComputer ob1= new HumanVsComputer();
                ob1.openingScreen();
                ob1.play();
            }
            else if(ch==2)
            {
                HumanVsHuman ob2= new HumanVsHuman();
                ob2.openingScreen();
                ob2.play();
            }
            else
            {
                System.out.println("Wrong input");
            }
        }
    }