package Rounak_practical_test;
import java.io.*;
import java.lang.*;
class final_p
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,k,lim,s1=0,j,c=1;
        String m="";
       
       
        System.out.println("Enter a number:");
        lim =Integer.parseInt(cd.readLine());
         
        
             for(i=1;i<=lim;i++)
           {
              for(j=1;j<i;j++)
                {
                   
            
            
                    if((i % j) == 0)
                    {
                       s1=s1+j;
                       
                       m=m+j+",";
                      
                
                    }
                }
                m="("+m+")";
                     if( s1== i)
                  {
                   
                   System.out.print(s1+"="+m);
                  
                  System.out.println();
        
                }
                  
                m="";
                s1=0;
          }
            
           
        
    }
}

            

