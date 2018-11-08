/*
Accepting inputs for an array and then printing it.
*/

import java.util.*;

class Array
{
    public static void main()
    {
        int a[]; // the array
        int n; // variable to store the length of the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        n = sc.nextInt();
        a = new int[n]; // array initialized
        int i; // loop variable
        System.out.println("THE INPUT FOR THE ARRAY:");
        for(i = 0; i < n; i++)
        {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        } // input for the array taken
        System.out.print("THE ARRAY ::");
        for(i = 0; i < n; i++)
        {
            System.out.printf("  %d", a[i]);
        } // displaying the array
    }
}

/*
DONE
 */