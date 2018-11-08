import java.io.*;
class series
 {
     public static void main(String args[])
     {
         int s=0,s1=0,s2=0,p=1,i;
         for(i=1;i<=9;i++)
         {
             s1=s1+i;
             p=p*(i+1);
             s2=s2+p;
            }
            s=s1+s2;
           System.out.println(" sum = "+s); 
        }
        }

         
         
         
         
         
         
         