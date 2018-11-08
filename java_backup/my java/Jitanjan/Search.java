import java.io.*;
class Search
{
  int i,f,x,n;
  int a[]=new int[10];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input() throws IOException
  {
      System.out.println("ENTER THE ELEMENTS");
      n=Integer.parseInt(br.readLine());
      
      for(i=0;i<n;i++)
      {
        a[i]=Integer.parseInt(br.readLine());
      }
  }
  void Search()throws IOException
  { 
      System.out.println("Enter The Search Element");
      x=Integer.parseInt(br.readLine());
      int f=0;
      for(i=0;i<n;i++)
      {
          if(a[i]==x)
          {
              f=1;
              break;
          }
      }
     if(f==1)
     System.out.println("Element found.....");
     else
     System.out.println("Element not found.....");
  }
}
  
      
      
  