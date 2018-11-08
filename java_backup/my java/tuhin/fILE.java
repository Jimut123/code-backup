import java.io.*;
public class fiLE
{
 static String filename=("prime.txt");
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
}

