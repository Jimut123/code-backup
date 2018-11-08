import java.io.*;
class Prime
{
 public static void main(String args[]) throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int i;int S,j;
     FileWriter std=new FileWriter("prime.dat");
     BufferedWriter mat=new BufferedWriter(std);
     PrintWriter obj=new PrintWriter(mat);
     for(i=1;i<100;i++)
     {
         S=0;
         for(j=2;j<i;j++)
         {
             if(i%j==0)
             {
                 S=1;
                 break;
             }
         }
         if(S==0)
         obj.println(i);
     }
     obj.close();
 }
}
     
     
