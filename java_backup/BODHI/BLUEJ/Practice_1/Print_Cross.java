/*
Printing a cross taking the unit components of the cross and the size of the each arm of the cross as input.

Ex: size = 5, unit element = a
Output:
a               a
  a           a 
    a       a  
      a   a             
        a       
      a   a           
    a       a    
  a           a   
a               a
 
*/

import java.util.*;

class Print_Cross
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        // taking necessary inputs
        System.out.printf("\nSize of each arm of cross = ");
        int n = sc.nextInt();
        System.out.printf("\nThe unit elements of the cross = ");
        char ch = sc.next().charAt(0);
        
        int i, j; // loop variables
        // printint the upper half of the cross
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < i; j++) // printing the spaces on the left of the cross
            {
                System.out.printf("  ");
            } 
            System.out.printf("%c ", ch); // printing the element for the upper-left arm
            for(j = 1; j <= (2 * n - 2 * i - 1); j++) // printing the spaces inbetween the arms of the cross
            {
                System.out.printf("  ");
            } 
            System.out.printf("%c\n", ch); // printing the element for the upper-right arm
        }
        //printing the middle row of the cross
        for(i = 0; i < n; i++)
        {
            System.out.printf("  ");
        }
        System.out.printf("%c\n", ch);
        //printing the lower half of the cross
        for(i = (n - 1); i >= 0; i--)
        {
            for(j = 0; j < i; j++) // printing the spaces on the left of the cross
            {
                System.out.printf("  ");
            } 
            System.out.printf("%c ", ch); // printing the element for the lower-left arm
            for(j = 1; j <= (2 * n - 2 * i - 1); j++) // printing the spaces inbetween the arms of the cross
            {
                System.out.printf("  ");
            } 
            System.out.printf("%c\n", ch); // printing the element for the lower-right arm
        }
    }
}

/*
DONE
*/