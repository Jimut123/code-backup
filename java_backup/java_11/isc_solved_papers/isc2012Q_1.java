/*Program number 1 of 2012 ISC computer science practical paper

A prime palindrome integer is a positive integer (without leading zeros) which is prime as well as a palindrome. Given two positive integers m and n, where m &lt; n, write a program to determine how many prime-palindrome integers are there in the range between m and n (both inclusive) and output them.

The input contains two positive integers m and n where m&lt; 3000 and n&lt; 3000. Display the number of prime palindrome integers in the specified range along with their values in the format specified below:


Test your program with the sample data and some random data:

Example 1:
INPUT: m=100
N=1000
OUTPUT: The prime palindrome integers are:
101,131,151,181,191,313,351,373,383,727,757,787,797,919,929

Frequency of prime palindrome integers: 15


Example 2:
INPUT: 
M=100
N=5000
OUTPUT: Out of Range*****/


import java.io.*;
class isc2012Q_1
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int m,n;
    int c;
    public void showPalPrime() throws Exception
    {
         c=0;
         System.out.println("Enter the Lower Limit:");
         m=Integer.parseInt(br.readLine());
        System.out.println("Enter the Upper Limit:");
         n=Integer.parseInt(br.readLine());
         if(m>=n || n>=3000)
         System.out.println("Out of Range.");
         else
         {
            System.out.println("The Prime Palindrome integers are:");
            while(m <=n)
             {
               if(palPrime(m))
               {
                    if(c==0)
                    System.out.print(m);
                    else
                    System.out.print(", "+m);
                    c++;
                }
                m++;
            }
                System.out.println("\nFrequency of Prime Palindrome integers: "+c);
            }
        }
        private boolean palPrime(int x)
        {
            boolean bool=false;
            int i;
            int rev=0;
            for(i=2;i<  x;i++)
            {
                 if(x%i==0)
                 break;
                }
                if(i==x)
                bool=true;
                if(bool)
                {
                    for(i=x;i >0;i=i/10)
                    {
                         rev=rev*10+i%10;
                        }
                        if(rev!=x)
                        bool=false;
                    }
                    return bool;
                }
                public static void main(String args[]) throws Exception
                {
                    isc2012Q_1 ob=new isc2012Q_1 ();
                     ob.showPalPrime();
                    }
                }
                        
