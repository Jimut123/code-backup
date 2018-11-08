package project1_May2016;

//To check whether a number is armstrong or not
import java.io.*;
class armstrongnumber
{
     void main()throws IOException
     {
         //declaration
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n,k=0,s=0,m=0;
         //input
         System.out.println("Enter Value:");
         n=Integer.parseInt(br.readLine());
         m=n;
         while(n>0)
         {
             k=n%10;
             s=s+(k*k*k);
             n=n/10;
            }
            if(s==m)
            System.out.print("armstrong number");
            else
            System.out.print("non-armstrong number");
        }
    }

         