//this class will display the smallest base of a number in which it may be palindrome
import java.util.*;
class Palindrome
{
    private int n[];
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        n=new int[sc.nextInt()];
        for(int i=0; i<n.length; i++)
        {           
            do
            {
                System.out.print("Enter element #" + (i+1) + ": ");
                n[i]=sc.nextInt();
                if(n[i]<1 || n[i]>100000) System.out.println("Re enter a number between 1 and 100000");
            }while(n[i]<1 || n[i]>100000);
        }
    }

    public String convert(int base, int n)
    {
        char hex[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
        String no="";
        int copy=n;         
        while(copy!=0)
        {
            no=hex[copy%base] + no;
            copy/=base;
        }
        return no;
    }

    public void findBase()
    {
        for(int i=0; i<n.length; i++)
        {      
            boolean flag=false;      
            for(int j=2; j<=16; j++)
            {
                String c1=convert(j, n[i]), c2="";
                for(int k=0; k<c1.length(); k++)
                    c2=c1.charAt(k)+c2;
                if(c1.equals(c2))
                {
                    flag=true;
                    System.out.println("The smallest base for which " + n[i] + " is a palindrome is " + j 
                        + " and it's palindrome form is: " + convert(j, n[i]));
                    break;
                }
            }

            if(!flag) System.out.println(n[i] + " is not a palindrome in any of the bases between 2 and 16");
        }
    }
}

public class Palindrome_Base
{
    public static void main(String args[])
    {
        Palindrome p=new Palindrome();
        p.get();
        p.findBase();
    }
}