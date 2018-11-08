 import java.io.*;
 class encryption2
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         int i;
         String str1,str2="";
         char ch;
         System.out.println("Enter a text : ");
         str1=cd.readLine();
         for(i=0;i<str1.length();i++)
         {
             ch=str1.charAt(i);
             if((Math.abs((int)ch-(int)str1.charAt(i+1))==32)||(ch==str1.charAt(i+1)))
             {
                 str2+=ch;
                 i++;
                }
                else
                str2+=ch;
            }
             System.out.println(str2);
            }
        }
        //abcdefghijklmnopqrstuvwxyz