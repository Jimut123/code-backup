//to find array element having highest diviation from the mid element
import java.io.*;
class Array_diviation
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void diviation()throws IOException
  {
    int n,i,mid,num=0;
    System.out.println("enter size of array");
      n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    for(i=0;i<n;i++)                                  //filling array
    {
      System.out.println("enter a no.");
      a[i]=Integer.parseInt(br.readLine());
    }
    mid=a[n/2];                                       //storing middle element in mid
    int d=Math.max(a[0],mid)-Math.min(a[0],mid);
    //System.out.println("d"+d);
    num=a[0];
    for(i=0;i<n;i++)
    {
      int div=Math.max(a[i],mid)-Math.min(a[i],mid);
       //System.out.println(div);
      //div stores difference b/w mid and any array element
      if (div>d)                                      //checking highest difference
      {
        num=a[i];
        d=div;
      }
      System.out.println(num+","+d);
    }
  }
}  