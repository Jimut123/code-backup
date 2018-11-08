import java.io.*;
class String2
{
 public static void main(String args[]) throws IOException
 { 
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter The  Number of Sentence");
     int n=Integer.parseInt(br.readLine());
     String s;
      
     if(n<1 || n>=4)
     {
         System.out.println("Invalid Entry");
     }
     else
     {
      System.out.println("Enter The Sentence");
     s=br.readLine();
 }
}
}
     