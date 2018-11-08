/*Question number 3:

A palindrome is a word that may be read the same in either direction.
Accept a sentence in upper case which is terminated by either ‘.’,’,’, ‘?’, ‘!’. Each word in the sentence is separated by a blank space.
Perform the following tasks:

1.    Display the count of palindromic words in the sentence
2.    Display the palindromic words in the sentence.

Example 1:
Input: MOM AND DAD ARE COMING AT NOON.

Output: MOM DAD NOON
Number of palindromic words: 3

Example 2:
Input: HOW ARE YOU?
Output: No palindromic words


Solution of the program number 3**/


import java.io.*;
import java.util.*;

class isc2013Q_3
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   StringTokenizer st;
   String s;
   int i=0;
    public void show()throws Exception
   {
    System.out.println("Enter the sentence:");
    str=br.readLine().toUpperCase();
    st=new StringTokenizer(str," .,?!");
    while(st.hasMoreTokens())
    {
        s=st.nextToken();
        if(palin(s))
        System.out.print(" "+s);
    }
    if(i==0)
    System.out.println("\nNo palindromic words");
    else
    System.out.println("\nNumber of palindromic words :"+i);
    }
    
    private boolean palin(String s1)
    {
         int x,j,len;
         len=s1.length();
         x=len-1;
         for(j=0;j< len/2;j++)
         {
             if(s1.charAt(j)!=s1.charAt(x))
             break;
             x--;
            }
            if(j< len/2)
            return false;
            else
{
i++;
            return true;
        }
        }
        
     public static void main(String args[]) throws Exception
     {
      isc2013Q_3 ob=new isc2013Q_3();
      ob.show();
      }
      }

