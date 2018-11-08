package project1_May2016;

//To check whether a number is buzz or not
import java.io.*;
class buzznumber
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        //input
        System.out.print("Enter value:");
        n=Integer.parseInt(br.readLine());
        //checking of the number
        if(n%10==7 ||n%7==0)
         System.out.print("buzz number");
         else
         System.out.print("non-buzz number");
        }
    }