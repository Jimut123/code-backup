//to print words from each string of a string array which are at odd positions
import java.io.*;
class String_array
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int n,i,j;
   String s;
   String arr[]=new String[100];
 public void array()throws IOException
 {
   
   System.out.println("enter size of array");
     n=Integer.parseInt(br.readLine());
   
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
    int l,c=1;
    String s1="";
    l=s.length();
    for(j=0;j<l;j++)
    {
      if (s.charAt(j)!=' ')
        s1=s1+s.charAt(j);
      else
      {
        if (c%2==1)
          System.out.println(s1);
        s1="";
        c=c+1;
      }
    }
     if (c%2==1)
          System.out.println(s1);
  }
}  
     