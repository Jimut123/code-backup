/*Program number 2 of 2012 ISC computer science practical paper

Write a program to accept a sentence as input. The words in the string are to be separated by a blank. Each word must be in upper case. The sentence is terminated by either “.”,”!” or “?”. Perform the following tasks:

Obtain the length of the sentence (measured in words)
Arrange the sentence in alphabetical order of the words

Test your program with the sample data and some random data:

Example 1: 
INPUT: NECESSITY IS THE MOTHER OF INVENTION.

OUTPUT:
Length: 6
Rearranged Sentence:
INVENTION IS MOTHER NECESSITY OF THE

Example 2:

INPUT: BE GOOD TO OTHERS.
OUTPUT:
Length: 4
Rearranged Sentence: BE GOOD OTHERS TO**/


import java.io.*;
import java.util.*;
class Matrixmult1_Q_2_2013
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   String words[];
   StringTokenizer stk;
    int i,j,c,x;
   public void take()throws Exception
   {
       int flag;
       while(true)
       {
           flag=0;
       System.out.println("Enter the sentence:");
       str=br.readLine();
      for(i=0;i <  str.length();i++)
      {
          if(Character.isLowerCase(str.charAt(i)))
          {
              flag=1;
              break;
            }
        }
        if (flag==0)
        break;
    }	
       stk=new StringTokenizer(str," .,?!");
       c=stk.countTokens();
       x=0;
       words=new String[c];
       while(stk.hasMoreElements())
       {
           words[x++]=stk.nextToken();
        }
        System.out.println("Length="+c);
        for(i=0;i <  x-1;i++)
        {
             for(j=i+1;j < x;j++)
             {
                 if(words[i].compareTo(words[j])>0)
                 {
                     str=words[i];
                     words[i]=words[j];
                     words[j]=str;
                    }
                }
            }
            System.out.println("\nRearranged Sentence:\n");
            for(i=0;i <  c;i++)
            System.out.print(words[i]+" ");
        }
                public static void main(String args[]) throws Exception
                {
                    Matrixmult1_Q_2_2013 ob=new Matrixmult1_Q_2_2013();
                     ob.take();
                    }
                }
                        

