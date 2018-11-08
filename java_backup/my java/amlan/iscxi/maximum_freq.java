package iscxi;

import java.io.*;
class maximum_freq
 {
     static void main(String args[])throws IOException
      {   
          int n;
          outer:while(true)
          {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter a number");
          n=Integer.parseInt(br.readLine());
          if(n<=0)
          {
              System.out.println("enter a positive number");
              continue outer;
            }
            else if(n>0)
            break;
        }
          int k,i,c,g=0,m=0;
          c=n;
          int max=n%10;
          while(n>0)
          {
             k=n%10;
              if(max<k)
                 max=k;
              n=n/10;
              g++;
            }
            System.out.println("The Maximum Digit is : "+max);
            for(i=1;i<=g;i++)
            {
                k=c%10;
                c=c/10;
                if(max==k)
                   m++;
                   else 
                   continue;
                }
                System.out.println("The Frequency of "+max+" is "+m);
            }
        }
                   
                   
     

