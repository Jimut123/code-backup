package Rounak_practical_test;
import java.io.*;
import java.lang.*;
class range_pn
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,k,lm,s1=0,j,c=1;
       
       
        System.out.println("Enter a number:");
        lm =Integer.parseInt(cd.readLine());
         int a[] = new int[c];
        
             for(i=1;i<=lm;i++)
           {
              for(j=1;j<i;j++)
                {
            
            
                    if((i % j) == 0)
                    {
                       s1=s1+j;
                
                    }
                }
                     if( s1== i)
                  {
                   
                   System.out.print(s1+",");
                  
        
                }
                s1=0;
          }
            
           
        
    }
}

            



