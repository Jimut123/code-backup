/*
Program to try out functions.
 */

import java.util.*;

class Function
{
    Scanner sc = new Scanner(System.in);
    
    public void main()
    {
        int a[]; // the array
        System.out.printf("Size of the array = ");
        int n = sc.nextInt();
        a = new int[n]; // memory allocated for the array 
        
        int i; // loop variable
        for(i = 0; i < n; i++) // taking inputs for the array
        {
            a[i] = input(i);
        }
        
    }
    
    public int input(int i)
    {
        int num;
        System.out.printf("a[%d] = ",i);
        num = sc.nextInt();
        return num;
    }
    
    public void display(int a, int b)
    {
        System.out.printf("a = %d      b = %d", a, b);
    }
}