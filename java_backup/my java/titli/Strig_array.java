//to print words from each string of a string array which are at odd positions
import java.io.*;
class Strig_array
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void array()throws IOException
 {
   int n,i;
   String s;
   System.out.println("enter size of array");
     n=Integer.parseInt(br.readLine());
   String arr[]=new String[n];
   for(i=0;i<n;i++)
   {
     System.out.println("enter a string");
     arr[i]=br.readLine();
     s=arr[i];
     word(s);
   }
 }
  public void word(String s)
  {
    int l,c=0,i;
    String s1="";
    l=s.length();
    for(i=0;i<l;i++)
    {
      if (s.charAt(i)!=' ')
        s1=s1+s.charAt(i);
      else
      {
        if (c%2==1)
          System.out.println(s1);
        s1="";
        c=i+1;
      }
    }
     if (c%2==1)
       System.out.println(s1);
  }
}  
     