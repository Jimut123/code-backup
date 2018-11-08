package project1_May2016;

//To check whether a number is magic or not
import java.io.*;
class magic
{
     void main()throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n,k=0,n1=0,s;
         //input
         System.out.print("Enter value:");
         n=Integer.parseInt(br.readLine());
         while(n>=10)
         {
             n1=n;
             s=0;
             //checking of the loop
             while(n1>0)
             {
                 k=n1%10;
                 s=s+k;
                 n1=n1/10;
                }
                n=s;
            }
            if(n==1)
            System.out.print("magic number");
            else
            System.out.print("non-magic number");
        }
    }