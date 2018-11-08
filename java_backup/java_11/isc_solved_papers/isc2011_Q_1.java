/*ISC 2011-solved computer application practical programs 

Program Number 1 of ISC 2011 on displaying number in word

Write a program to input a natural number less than 1000 and display it in words. Test your program on the sample data and some random data.


Sample input and output of the program

Input: 29
Output: TWENTY NINE

Input: 17001
Output: OUT OF RANGE

Input: 119
Output: ONE HUNDRED AND NINETEEN

Input: 500
Output: FIVE HUNDRED

 Codes of the program**/

import java.io.*;
class isc2011_Q_1
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str="",str1="",str2="";
 int h=0,t=0,u=0,i=0,n;
 public void takeNumber() throws Exception
 {
  System.out.println("\nEnter the number:");
  n=Integer.parseInt(br.readLine());
  if(n<1 || n>999)
  {
    System.out.println("\nINVALID ENTRY:");
    return;
  }
  while(true)
  {
   if(i==0)
   u=n%10;
   else if(i==1)
   t=n%10;
   else if(i==2)
   h=n%10;
   i++;
   n=n/10;
   if(n==0)
   break;
   }
  if(h!=0)
  str=word1(h)+ " HUNDRED ";
  if(t>1)
  str1= word2(t);
  if(t==1)
  str2= word3(u);
  else
  str2=word1(u);
  if(!str1.equals("") || !str2.equals(""))
  str=str+ "AND ";
  if(!str1.equals(""))
  str=str+ str1+ " ";
  if(!str2.equals(""))
  str=str+ str2;
  System.out.println(str);
 }
 String word1(int x)
 {
  String s="";
  switch(x)
  {
   case 1:
   s="ONE";
   break;
   case 2:
   s="TWO";
   break;
   case 3:
   s="THREE";
   break;
   case 4:
   s="FOUR";
   break;
   case 5:
   s="FIVE";
   break;
   case 6:
   s="SIX";
   break;
   case 7:
   s="SEVEN";
   break;
   case 8:
   s="EIGHT";
   break;
   case 9:
   s="NINE";
   break;
   }
    return s;
    }
 String word2(int x)
 {
  String s="";
  switch(x)
  {
   case 2:
   s="TWENTY";
   break;
   case 3:
   s="THIRTY";
   break;
   case 4:
   s="FOURTY";
   break;
   case 5:
   s="FIFTY";
   break;
   case 6:
   s="SIXTY";
   break;
   case 7:
   s="SEVENTY";
   break;
   case 8:
   s="EIGHTY";
   break;
   case 9:
   s="NINETY";
   break;
   }
    return s;
    }
 String word3(int x)
 {
  String s="";
  switch(x)
  {
   case 0:
   s="TEN";
   break;
   case 1:
   s="ELEVEN";
   break;
   case 2:
   s="TWELVE";
   break;
   case 3:
   s="THIRTEEN";
   break;
   case 4:
   s="FOURTEEN";
   break;
   case 5:
   s="FIFTEEN";
   break;
   case 6:
   s="SIXTEEN";
   break;
   case 7:
   s="SEVENTEEN";
   break;
   case 8:
   s="EIGHTEN";
   break;
   case 9:
   s="NINETEEN";
   break;
   }
    return s;
    }

  public static void main(String args[]) throws Exception
  {
    isc2011_Q_1 ob=new isc2011_Q_1();
   ob.takeNumber();
   }
   }
