/*Program Number 2 of ISC 2011-encryption of message


Encryption is a technique of coding messages to maintain their secrecy. A String array of size ‘n’ where ‘n’ is greater than 1 and less than 10, stores single sentences (each sentence ends with a full stop) in each row of the array.

Write a program to accept the size of the array. Display an appropriate message if the size is not satisfying the given condition. Define a string array of the inputted size and fill it with sentences row-wise. Change the sentence of the odd rows with an encryption of two characters ahead of the original character. Also change the sentence of the even rows by storing the sentence in reverse order. Display the encrypted sentences as per the sample data given below.

Test your program on the sample data and some random data.

Input: n=4

IT IS CLOUDY.
IT MAY RAIN.
THE WEATHER IS FINE.
IT IS COOL.

Output:
 KV KU ENQWFA.
RAIN MAY IT.
VJG YGCVJGT KU HKPG.
COOL IS IT.

Input: n=13
Output: INVALID ENTRY

Codes of this encryption program using BlueJ**/

import java.io.*;
class isc2011_Q_2
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String str[],s;
 int i,n;
 public void takeString() throws Exception
 {
  System.out.println("\nHow many sentences:");
  n=Integer.parseInt(br.readLine());
  if(n<1 || n>9)
  {
    System.out.println("\nINVALID ENTRY:");
    return;
  }
  str=new String[n];
  for(i=0;i< n;i++)
  {
    System.out.println("\nEnter sentence ( ends with full stop):");
    s=br.readLine().trim();
    if(s.charAt(s.length()-1)!='.')
    {
     System.out.println("\nFull stop at the end is mandatory:");
     i--;
     continue;
     }
    str[i]=s;
  }
  for(i=0;i< n;i++)
  {
   s=str[i];
   if(i%2==0)
   encrypt(s);
   else
   reverse(s);
  }
  }
  public void encrypt(String s)
  {
   int i,len;
   char ch;
   String st="";
   len=s.length();
   for(i=0;i< len;i++)
   {
    ch=s.charAt(i);
    if((ch >=65 && ch<=90)||(ch >=97 && ch<=122))
    {
       ch=(char)(ch+2);
  if(ch >90 && ch< 97)
  {
   ch=(char)((64+ch-90));
   }
  else if(ch >122)
  {
   ch=(char)((96+ch-122));
   }
 }
  st=st+ch;
  }
 System.out.println(st);
 }

 public void reverse(String s)
 {
  int i;
  String s1;
  s=s.trim();
  s=s.substring(0,s.length()-1);
  while(true)
  {
  i=s.lastIndexOf(" ");
  if(i<0)
  break;
  s1=s.substring(i).trim();
  System.out.print(s1+ " ");
 s=s.substring(0,i).trim();
 }
 System.out.println(s+".");
 }
  public static void main(String args[]) throws Exception
  {
   isc2011_Q_2 ob=new isc2011_Q_2();
   ob.takeString();
   }
   }

