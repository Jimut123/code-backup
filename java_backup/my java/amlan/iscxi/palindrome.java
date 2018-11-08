package iscxi;

import java.io.*;
class palindrome
 { 
   public  static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int up,dn,n;
          System.out.println("Enter a number");
          n=Integer.parseInt(br.readLine());
          up=n;dn=n;
         if(isPal(n)!=1)
          {
              outer: while(n>0)
              {
                  up++;
                  if(isPal(up)==1)
                  {
                  System.out.println("The Nearest palindrome number from upper side is : " +up);
                  break outer;
                }
                  else
                  continue outer;
                }
              inner: while(n>0)
              {
                 dn--;
                  if(isPal(dn)==1)
                  {
                  System.out.println("The Nearest Palindrome number from lower side is: " +dn);
                  break inner;
                }
                  else 
                  continue inner;
                }
            }
            else if(isPal(n)==1)
             System.out.println("The Number is Palindrome");
        }
        static int isPal(int n)
        {
            int k=0,d,s=0,c=n;
            do
            { 
                d=n%10;
                s=s*10+d;
                n=n/10;
            }while(n!=0);
            if(s==c)
            k=1;
            else
            k=0;
            return k;
        }
    }
    
                
              

