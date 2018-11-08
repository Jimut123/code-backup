import java.io.*;
class Reading_file
{
 public static void main(String args[]) throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String Sent;
     int w=0;int i;
     FileReader std=new FileReader("data.txt");
     BufferedReader mat=new BufferedReader(std);
     System.out.println("Sentence \t\t\t Number of Words");
     while ((Sent=mat.readLine())!=null)
     {
         w=0;
         for(i=0;i<Sent.length();i++)
         { 
           if(Sent.charAt(i)==' ')
             w++;
         }
         w++;
         System.out.println(Sent +"!" + w);
     
 }
}
}
             
     
     