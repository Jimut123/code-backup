/**
Printing natural numbers upto 'n'.
'n' to be taken as input
 */

import java.util.*;

public class IntergerPrint2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n; // to store the largest natural number to be stored
        System.out.print("Enter n = ");
        n = sc.nextInt();
        System.out.printf("THE SERIES :: ");
        int i; // loop variable
        for(i = 1; i <= n; i++)
        {
            System.out.printf("  %d", i);
        }
    }
}

/*
DONE
 */