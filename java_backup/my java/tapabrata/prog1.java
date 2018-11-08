import java.io.*;

public class prog1
{
 public static void main(String args[])throws IOException
 {
     InputStreamReader reader=new InputStreamReader(System.in);
     BufferedReader input=new BufferedReader(reader);
     int g=0;
     do{
     System.out.println("enter the number");
     int n=Integer.parseInt(input.readLine());
     System.out.println("press 1 to convert to octal");
     System.out.println("press 2 to convert to hexadecimal");
     int ch=Integer.parseInt(input.readLine());
     int r=0,b=0;String ans="";
     if(ch==1)
     {b=8;
        
        }  else if(ch==2)
        {
            b=16;
        }
        else
        System.out.println("invalid input");
       if(ch==1||ch==2)
        {while(n>0)
         {
             r=(n%b);
             ans=r+ans;
             n=n/b;
        
        }
        System.out.println("the result: "+ans);
    System.out.println("to continue press 0 press 1 to quit");
     g=Integer.parseInt(input.readLine());
    }
    }while(g==0);
    }
}
      