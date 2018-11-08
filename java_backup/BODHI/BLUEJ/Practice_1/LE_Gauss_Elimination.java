/*
Solving a system of equations using Gauss Elimination Method
 */

import java.util.*;
import java.io.*;

class LE_Gauss_Elimination
{
    public static void main()
    {
        float a[][] = new float[10][10]; // to store the coefficient matrix
        float b[] = new float[10]; // to store the constant values
        float x[] = new float[10]; // to store the solutions
        int n; // for storing the count of equations or variables
        
        
        // Setting up the system of equations
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter the no. of variables present = "); 
        n = sc.nextInt();
        int i, j, k; // loop variables
        System.out.printf("\n\nSETTING UP THE SYSTEM OF EQUATIONS:\n");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.printf("a[%d][%d] = ", (i + 1), (j + 1));
                a[i][j] = sc.nextFloat();
            }
            System.out.printf("b[%d] = ", (i + 1));
            b[i] = sc.nextFloat();
        }
        
        // displaying the system of equations
        System.out.printf("\n\nThe Entered System:\n");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.printf("(%f)x%d", a[i][j], (j + 1));
                if(j < n - 1)                        
                    System.out.print(" + ");
                else
                    System.out.print(" = ");
            }
            System.out.printf("%f \n", b[i]);
        }
        
        // performing Gauss Elimination method
        float am;
        for(i = 0; i < n; i++) // obtaining the matrix whose lower triangle elements are all zeros
        {
            for(k = (i + 1); k < n; k++)
            {
                am = a[k][i] / a[i][i];
                for(j = 0; j < n; j++)
                {
                    a[k][j] -= am * a[i][j];
                }
                b[k] -= am * b[i]; 
            }
        } // obtaining the matrix whose lower triangle elements are all zeros
        float s;
        for(i = (n - 1); i >= 0; i--) // obtaining the roots by backward substitution
        {
            s = 0;
            for(j = (i + 1); j < n; j++)
            {
                s += x[j] * a[i][j]; 
            }
            x[i] = (b[i] - s) / a[i][i];
        }// obtaining the roots by backward substitution
        
        // displaying the solution of the system
        System.out.printf("\n\nThe Solutions:\n");
        for(i = 0; i < n; i++)
        {
            System.out.printf("x%d = %f\n", (i + 1), x[i]);
        }
    }
}

/*
DONE
*/
