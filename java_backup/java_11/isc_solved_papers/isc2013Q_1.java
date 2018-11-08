/**Question number 1:
An ISBN (International Standard Book Number) is a ten digit code which uniquely identifies a book.

The first nine digits represent the group, publisher and title of the book and the last digit is used to check whether ISBN is correct or not.

Each of the first none digits of the code can take a value between 0 to 9. Sometimes it is necessary to make the last digit equal to ten. This is done by writing the last digit of the code as X.

To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third digit and so on until we add 1 time the last digit. If the final number leaves no remainder while divided by 11, the code is a valid ISBN

For example:
0201103311=10*0+9*2+8*0+7*1+6*1+5*0+4*3+3*3+2*1+1*1=55
This is a valid ISBN

007462542X=10*0+9*0+8*7+7*4+6*6+5*2+4*5+3*4+2*2+1*10=176

Similarly 0112112425 is not a valid ISBN.

Sample input-output:
Input code: 0201530821
Output: Sum=99
Leaves no remainder – valid ISBN

Input code: 356680324
Output: Sum=invalid input

Input code: 0231428031
Output: Sum=122
Leaves remainder – invalid ISBN
Solution of the program number 1*/

import java.io.*;
class isc2013Q_1
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   int digit,c=1,x=0,i,len;
   char ch;
   public void show()throws Exception
   {
    System.out.println("Enter the ISBN code:");
    str=br.readLine();
    len=str.length();
    if(len!=10)
    {
     System.out.println("Invalid input.");
    return;
    }
   for(i=len-1;i>=0;i--)
   {
     ch=str.charAt(i);
     if(ch=='X')
     digit=10;
     else
     digit=ch-48;
     x=x+digit*c;
     c++;
     }
     System.out.println("\nSum="+x);
     if(x%11==0)
     System.out.println("Leaves no remainder - valid ISBN code.");
     else
     System.out.println("Leaves remainder - invalid ISBN code.");
     }
     public static void main(String args[]) throws Exception
     {
       isc2013Q_1 ob=new  isc2013Q_1();
       ob.show();
      }
      }
