import java.io.*;
class pattern_5
{ public static void main(String args[])throws IOException
  { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("\nEnter a number:");
      int n=Integer.parseInt(br.readLine());
      int k=1;
      for(int i=1;i<=n;i++)
      { for(int x=1;x<=i;x++)
          {System.out.print(k+" ");
           k++;   
          }System.out.println(" ");
      }
  }
}