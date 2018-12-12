package package_sorting;
import java.io.*;
public class Sorting
{
  public void bubble(int a[],int n)
  {
    int i,t,m,pass,flag;
    try{
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    m=n;
    flag=0;
    pass=0;
    while(flag==0)
    {
      flag=1;
      pass=pass+1;
      m=m-1;
      for(i=0;i<m;i++)
      {
        if(a[i]>a[i+1])
        {
          t=a[i];
          a[i]=a[i+1];
          a[i+1]=t;
          flag=0;
        }
        System.out.println("Pass = "+pass+" Step = "+(i+1));
        for(int j=0;j<n;j++)
          System.out.print(a[j]+"\t");
        System.out.print("\nPress Enter Key-->\n");
        br.readLine();
      }
    }
    System.out.println("Sorted List(Bubble Sort)");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.println();
   }
   catch(Exception e){}
  }
  public void insertion(int a[],int n)
  {
    int i,j,t,pass;
    try{
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    pass=0;
    for(i=1;i<n;i++)
    {
      t=a[i];
      j=i-1;
      pass=pass+1;
      while(j>=0 && t<a[j])
      {
         a[j+1]=a[j];
         j=j-1;
         System.out.println("Pass = "+pass+" Step = "+i);
         for(int k=0;k<n;k++)
           System.out.print(a[k]+"\t");
         System.out.println("\nPress Enter Key-->");
         br.readLine();
      }
      a[j+1]=t;
      System.out.println("Pass = "+pass+" Step = "+i);
      for(int k=0;k<n;k++)
        System.out.print(a[k]+"\t");
      System.out.println("\nPress Enter Key-->");
      br.readLine();
    }
    System.out.println("Sorted List(Insertion Sort)");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.println();
    }
    catch(Exception e){}
  }
}