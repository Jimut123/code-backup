/*
Printing a plus-sign taking the unit components of the cross and the size of each arm as input.

Ex: size = 5, unit element = a
OUTPUT:
          a
          a
          a
          a
          a
a a a a a a a a a a a a
          a
          a
          a
          a
          a

*/

import java.util.*;

class Print_Plus
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        // taking necessary inputs 
        System.out.printf("\nSize of each arm of plus-sign = ");
        int n = sc.nextInt();
        System.out.printf("\nThe unit elements of plus-sign = ");
        char ch = sc.next().charAt(0);
        
        int i, j; // loop variables
        //printing the upper half of the plus-sign
        for(i = 0; i < n; i++)
        {
            for(j = 1; j <= (n * 2); j++) // printing the space on the left of the plus-sign
            {
                System.out.printf(" ");
            }
            System.out.printf("%c\n", ch); // printing an unit element of the plus-sign 
        }
        for(j = 1; j <= (n * 2 + 1); j++) // printing middle row of the plus-sign
        {
            System.out.printf("%c ", ch);
        }
        System.out.println();
        //printing the lower half of the plus-sign
        for(i = 0; i < n; i++)
        {
            for(j = 1; j <= (n * 2); j++) // printing the space on the left of the plus-sign
            {
                System.out.printf(" ");
            }
            System.out.printf("%c\n", ch); // printing an unit element of the plus-sign 
        }
    }
}

/*
DONE
 */