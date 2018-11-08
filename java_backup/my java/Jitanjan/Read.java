import java.io.*;
class Read
{
 public static void main(String args[]) throws IOException
 {
     BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
     int i;
     String s;
     FileReader std=new FileReader("prime.dat");
     BufferedReader mat=new BufferedReader(std);
     while((s=mat.readLine())!=null)
     {
         i=Integer.parseInt(s);
     System.out.println(i );
    }
 }
}