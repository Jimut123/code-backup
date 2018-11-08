package Rounak_practical_test;
import java.io.*;
class number
{
    int i,s,j,s1,lim,y;
    String m;
    
    
    int sumoffactors(int n)
    {
        for(i=1;i<n;i++)
        {
            if((n%i)==0)
            {
                s=s+i;
            }   
        }

        return(s);
    }
     boolean isperfect(int n)
    {
        
        if(n ==s)
        {
         return( true );
           
        }
        else 
        {
           return( false );
         }
        
       
    }
   void perfectnosbelow(int lim)
    {
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
      public static void main(String args[])throws IOException
          {
               InputStreamReader ab = new InputStreamReader(System.in);
               BufferedReader cd = new BufferedReader(ab);
               number ob  = new number();
               int n1,lim1,y;
               
              
               System.out.print("Enter the number for checking perfect number or not::");       
               n1 =Integer.parseInt(cd.readLine());
               
               ob.sumoffactors(n1);
               ob. isperfect(n1);
                if(true)
                {
                 System.out.println("The number is  perfect");
                 
                }
                else 
                {
                     System.out.println("The number is not perfect");
                 
                      
                }
                    
               System.out.print("Enter the upper limit number::");
               lim1 =Integer.parseInt(cd.readLine());
               ob.perfectnosbelow(lim1);
               
              
               
              
            }
        }
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               