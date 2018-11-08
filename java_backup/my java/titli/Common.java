//showing elements common in arrays
import java.io.*;
class Common 
{
  int a1[];
  int a2[];
  int a3[];
  int n1,n2,n3;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void get()throws IOException
  {
      int i;
      System.out.println("enter no. of elements in first array : ");
       n1=Integer.parseInt(br.readLine());
      System.out.println("enter no. of elements in second array : ");
       n2=Integer.parseInt(br.readLine());
      System.out.println("enter no. of elements in third array : ");
       n3=Integer.parseInt(br.readLine());
      a1=new int[n1];
      inputElements(n1);
      a2=new int[n2];
      inputElements(n2);
      a3=new int[n3];
      inputElements(n3);
      for(i=0;i<n1;i++)
      {
          System.out.println("enter a no. for first array");
           a1[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n2;i++)
        {
            System.out.println("enter a no. for second array");
             a2[i]=Integer.parseInt(br.readLine());
          }
          for(i=0;i<n3;i++)
          {
              System.out.println("enter a no. for third array");
               a3[i]=Integer.parseInt(br.readLine());
            }
            
      