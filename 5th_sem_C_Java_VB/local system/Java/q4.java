import java.io.*;
class q4
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a[] = new int[20];
    int t[] = new int[20];
    int n,i,j=0;
    System.out.print("\nEnter number of elements : ");
    n=Integer.parseInt(br.readLine());
    for(i=0;i<n;i++)
    {
      System.out.print("\nEnter number "+(i+1)+ " : ");
      a[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("\nOriginal Array");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.println();
    for(i=0;i<n;i++)
      if(a[i]>=0)
        t[j++]=a[i];
    for(i=0;i<n;i++)
      if(a[i]<0)
        t[j++]=a[i];
    for(i=0;i<n;i++)
      a[i]=t[i];
    System.out.println("\nModified Array");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
  }
}