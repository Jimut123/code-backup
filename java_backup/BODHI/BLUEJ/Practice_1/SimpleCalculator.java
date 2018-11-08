/**
Program to perform the 4 binary arithmetic operations.
(Addition, Subtraction, Multiplication, Division) 
 */

import java.util.*;

class SimpleCalculator
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        double a, b; // the 2 operands
        System.out.print("Enter the 1st operand = ");
        a = sc.nextInt(); // input for 1st operand taken
        System.out.print("Enter the 2nd operand = ");
        b = sc.nextInt(); // input for 2nd operand taken
        
        // variables initialized to store the sum, difference product and quotient of the 2 operands
        double add, sub, mul, div;
        
        add = a + b; // calculating the sum
        sub = a - b; // calculating the difference
        mul = a * b; // calculating the product
        div = a / b; // calculating the quotient
        
        System.out.printf("\nSUM = %f + %f = %f", a, b, add);
        System.out.printf("\nDIFFERENCE = %f - %f = %f", a, b, sub);
        System.out.printf("\nPRODUCT = %f - %f = %f", a, b, mul);
        System.out.printf("\nQUOTIENT = %f / %f = %f", a, b, div);
    }
}

/*
DONE
 */