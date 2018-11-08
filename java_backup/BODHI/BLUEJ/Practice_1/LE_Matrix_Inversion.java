/*
Solving a system of equations using Matrix Inversion Method
*/

import java.util.*;
import java.io.*;

class LE_Matrix_Inversion
{
    public static void main()
    {
        float a[][] = new float[10][10]; // to store the coefficient matrix
        float aug[][] = new float[10][20]; // to store the augmented matrix
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
        
        // creating the augmented matrix
        int n2 = 2 * n;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++) // creating the left half of the augmented matrix
            {
                aug[i][j] = a[i][j];
            }
            for(j = n; j < n2; j++) // creating the right half of the augmented matrix
            {
                if((i + n) == j)
                    aug[i][j] = 1;
                else
                    aug[i][j] = 0;
            }
        }
        
        // displaying the augmented matrix before matrix-inversion
        System.out.printf("\n\nThe Augmented System: (BEFORE MAT_INV)\n");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n2; j++)
            {
                System.out.printf("(%f)x%d", aug[i][j], (j + 1));
                if(j < n2 - 1)                        
                    System.out.print(" + ");
                else
                    System.out.print(" = ");
            }
            System.out.printf("%f \n", b[i]);
        }
        
        // performing Matrix Inversion method
        float ai, ak; // Multiplier for i-th and k-th rows.
        for(i = 0; i < n; i++) // obtaining the inverse matrix
        {
            ai = aug[i][i];
            for(j = 0; j < n2; j++)
            {
                aug[i][j] = aug[i][j] / ai;
            }
            for(k = 0; k < n; k++)
            {
                if(k != i)
                {
                    ak = aug[k][i];
                    for(j = 0; j < n2; j++)
                    {
                        aug[k][j] -= ak * aug[i][j];
                    }
                }
            }
        } // obtaining the inverse matrix
        float s = 0; // to store the value of each element of product of inverse matrix and b[] 
        for(i = 0; i < n; i++) // obtaining the roots by matrix multiplcation
        {
            s = 0;
            for(j = 0; j < n; j++)
            {
                s += a[i][j + n] * b[j];
            }
            x[i] = s;
        } // obtaining the roots by matrix multiplcation
        
        // displaying the augmented matrix after matrix-inversion
        System.out.printf("\n\nThe Augmented System: (AFTER MAT_INV)\n");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n2; j++)
            {
                System.out.printf("(%f)x%d", aug[i][j], (j + 1));
                if(j < n2 - 1)                        
                    System.out.print(" + ");
                else
                    System.out.print(" = ");
            }
            System.out.printf("%f \n", b[i]);
        }
        
        // displaying the solution of the system
        System.out.printf("\n\nThe Solutions:\n");
        for(i = 0; i < n; i++)
        {
            System.out.printf("x%d = %f\n", (i + 1), x[i]);
        }
    }
}

/*
Something wrong with the matrix inversion section of the code
*/