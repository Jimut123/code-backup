//this class will inter-convert bases of number systems
import java.util.*;
class Base
{
    private String n;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Choose the number system in which you want to give your input:\n1. Binary\n2. Octal\n3. Decimal\n4. Hexadecimal\nInput: ");            
            int ch=sc.nextInt();
            System.out.print("Enter your number: ");
            n=sc.next();
            if(!validifyInput(ch))
            {
                System.out.println("Please give a valid input!");
                continue;
            }
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter the base you wish to convert your number to:\n1. Octal\n2. Decimal\n3. Hexadecimal\nInput: ");
                    switch(sc.nextInt())
                    {
                        case 1: System.out.println("Octal Equivalent: " + convertToAny(8, convertToDec(2, n))); break;
                        case 2: System.out.println("Decimal Equivalent: " + convertToDec(2, n)); break;
                        case 3: System.out.println("Hexadecimal equivalent: " + convertToAny(16, convertToDec(2, n))); break;
                        default: System.out.println("Error in input!");
                    }
                    break;
                }        
                case 2:
                {
                    System.out.println("Enter the base you wish to convert your number to:\n1. Binary\n2. Decimal\n3. Hexadecimal\nInput: ");
                    switch(sc.nextInt())
                    {
                        case 1: System.out.println("Binary Equivalent: " + convertToAny(2, convertToDec(8, n))); break;
                        case 2: System.out.println("Decimal Equivalent: " + convertToDec(8, n)); break;
                        case 3: System.out.println("Hexadecimal equivalent: " + convertToAny(16, convertToDec(8, n))); break;
                        default: System.out.println("Error in input!");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the base you wish to convert your number to:\n1. Binary\n2. Octal\n3. Hexadecimal\nInput: ");
                    switch(sc.nextInt())
                    {
                        case 1: System.out.println("Binary Equivalent: " + convertToAny(2, Long.parseLong(n))); break;
                        case 2: System.out.println("Octal Equivalent: " + convertToAny(8, Long.parseLong(n))); break;
                        case 3: System.out.println("Hexadecimal equivalent: " + convertToAny(16, Long.parseLong(n))); break;
                        default: System.out.println("Error in input!");
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the base you wish to covert your number to:\n1. Binary\n2. Octal\n3. Decimal\nInput: ");
                    switch(sc.nextInt())
                    {
                        case 1: System.out.println("Binary Equivalent: " + convertToAny(2, convertToDec(16, n))); break;
                        case 2: System.out.println("Octal Equivalent: " + convertToAny(8, convertToDec(16, n))); break;
                        case 3: System.out.println("Decimal Equivalent: " + convertToDec(16, n)); break;
                        default: System.out.println("Error in input!");
                    }
                }
            }
            System.out.print("Do you wish to enter a different number? (Y/N): ");
            if(!sc.next().equalsIgnoreCase("Y")) System.exit(0);
            System.out.println();
        }
    }

    public long convertToDec(int base, String number)//converts a number in any other base to decimal base
    {
        long no=0;
        for(int i=0; i<number.length(); i++)        
            no+=Math.pow(base, number.length()-i-1) * "0123456789ABCDEF".indexOf(number.charAt(i));            
        return no;
    }

    public String convertToAny(int base, long n)//converts a number in decimal base to any other base
    {
        char hex[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String no="";  
        while(n!=0)
        {
            no=hex[(int)n%base] + no;
            n/=base;
        }
        return no;
    }

    public boolean validifyInput(int choice)
    {
        if(choice>4) return false;
        String noSet = choice==1?"01":(choice==2?"01234567":(choice==3?"0123456789":(choice==4?"0123456789ABCDEF":"")));
        for(int i=0; i<n.length(); i++)
            if(noSet.indexOf(n.charAt(i))==-1) return false;
        return true;
    }
}

public class BaseConverter
{
    public static void main(String args[])
    {
        new Base().get();
    }
}