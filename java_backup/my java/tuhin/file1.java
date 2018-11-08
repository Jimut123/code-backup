
import java.io.*;
public class file1
{
 static String filename=("name.txt");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public static void main(String args[])throws IOException
  {
   try{
       FileWriter fw=new FileWriter(filename);
       BufferedWriter bw=new BufferedWriter(fw);
       PrintWriter pw=new PrintWriter(bw);
       for(int i=1;i<100;i++)
         {
           if(isprime(i)==true)
             {
                              pw.println(i);
             }
         }
         pw.close();
      }
     
      catch(IOException e)
      {
        System.err.print(e);
      }
   }
   static boolean isprime(int x)
   {
    for(int i=2;i<x;i++)
    {
        if(x%i == 0)
        return false;
       
    
    }
    return true;
}
}
