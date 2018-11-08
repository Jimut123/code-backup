/*Write a program to accept a sentence as input. The words in the string are to be separated by a blank. Each word must be in upper case. The sentence is terminated by either “.”,”!” or “?”. Perform the following tasks:

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
Rearranged Sentence: BE GOOD OTHERS TO

Same program using alternate technique.**/
  
import java.io.*;
import java.util.*;
class Matrixmult_Q_2_2013
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   String words[]=new String[20];
 
    int i,j,x;
   public void take()throws Exception
   {
       int flag;
       while(true)
       {
           flag=0;
       System.out.println("\nEnter the sentence:");
       str=br.readLine();
      for(i=0;i < str.length();i++)
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
    str=str.replace('.',' ');
   str=str.replace(',',' ');
   str=str.replace('?',' ');
   str=str.replace('!',' ');
       x=0;
      
       while(true)
       {
          i=str.indexOf(' ');
          if(i < 0)
          break;
          words[x++]=str.substring(0,i);
          str=str.substring(i+1);
          }
          words[x++]=str;
          
        System.out.println("Length="+(x-1));
        for(i=0;i <  x-1;i++)
        {
             for(j=i+1;j <  x;j++)
             {
                 if(words[i].compareTo(words[j]) > 0)
                 {
                     str=words[i];
                     words[i]=words[j];
                     words[j]=str;
                    }
                }
            }
            System.out.println("\nRearranged Sentence:\n");
            for(i=0;i <  x;i++)
            {
                if(i==x-1)
                System.out.print(words[i]);
                else
                System.out.print(words[i]+" ");
            }
        }
                public static void main(String args[]) throws Exception
                {
                     Matrixmult_Q_2_2013 ob=new Matrixmult_Q_2_2013();
                     ob.take();
                    }
                }
