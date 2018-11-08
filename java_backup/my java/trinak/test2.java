import java.io.*;
class test2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int p,d;
        System.out.println("Enter purchase amount:");
        p=Integer.parseInt(br.readLine());
        if(p<=10000)
         d=(p*10)/100;
         else 
         if(p<=25000)
         d=(p*15)/100;
         else
         if(p<=50000)
         d=(p*25)/100;
         else
         d=(p*30)/100;
         System.out.println(d);
        }
    }
      
     
       