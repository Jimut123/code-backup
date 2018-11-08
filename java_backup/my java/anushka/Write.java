
import java.io.*;
public class Write
{
    public static void main(String args[])throws IOException
    {
       FileWriter fw= new FileWriter("number");
       BufferedWriter bw=new BufferedWriter(fw);
       PrintWriter pw=new PrintWriter(bw);
       int i;
       String s;
       for(i=1;i<=100;i++)
       {
           pw.println(i);
           //pw.println("");
        }
        pw.close();
        FileReader fr= new FileReader("number");
       BufferedReader br=new BufferedReader(fr);
       FileWriter fw1= new FileWriter("odd");
       BufferedWriter bw1=new BufferedWriter(fw);
       PrintWriter pw1=new PrintWriter(bw1);
       FileWriter fw2= new FileWriter("even");
       BufferedWriter bw2=new BufferedWriter(fw2);
       PrintWriter pw2=new PrintWriter(bw2);
       int k=1;
       int m=0;
       int u=0;
       while(k<=100)
       {
          s=br.readLine();
          
         
           i=Integer.parseInt(s);
           //System.out.println(i);
           if(i%2!=0)
           {
               m++;
               System.out.println("odd");
           pw1.println(i);
        }
           else
           if(i%2==0)
           {u++;
               System.out.println("even");
           pw2.println(i);
        }
        k++;
        }
        br.close();
        pw1.close();
        pw2.close();
        FileReader fr1= new FileReader("odd");
       BufferedReader br1=new BufferedReader(fr1);
       i=1;
        while(i<m)
       {
          s=br1.readLine();
         
           i=Integer.parseInt(s);
          System.out.println("odd"+i);
          i++;
        }
        br1.close();
        FileReader fr2= new FileReader("even");
       BufferedReader br2=new BufferedReader(fr2);
       i=1; 
        while(i<u)
       {
          s=br2.readLine();
          
           i=Integer.parseInt(s);
          System.out.println(i);
          i++;
        }
       br2.close(); 
    }
}
       