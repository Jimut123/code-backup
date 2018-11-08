/*
Printing a cross taking the unit components of the cross and the radius of the circle as input.

Ex: size = 6, unit element = k
Output:
      k k k k k k k
    k               k
  k                   k
k                       k
k                       k
k                       k
k           O           k
k                       k
k                       k
k                       k
  k                   k
    k               k
      k k k k k k k

Ex: size = 5, unit element = a
Output:
      a a a a a      
    a           a 
  a               a 
a                   a
a                   a
a         O         a
a                   a
a                   a
  a               a 
    a           a 
      a a a a a 
      
Ex: size = 4, unit element = t
Output:
    t t t t t
  t           t
t               t
t               t
t       O       t 
t               t
t               t
  t           t
    t t t t t
    
Ex: size = 3, unit element = z
Output:
    z z z
  z       z
z           z     
z     O     z   
z           z
  z       z
    z z z
*/

import java.util.*;

class Print_Cirlce
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        // taking necessary inputs
        System.out.printf("\nRadius of the circle = ");
        int n = sc.nextInt();
        System.out.printf("\nThe unit elements of the circle = ");
        char ch = sc.next().charAt(0);
        
        int i, j; // loop variables
    }
}