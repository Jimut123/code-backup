import java.io.*;
class insertionsort
{
  public void insertion(int a[],int n)
  {
    int i,j,t;
    for(i=1;i<n;i++)
    {
      t=a[i];
      j=i-1;
      while(j>=0 && a[j]>t)
      {
        a[j+1]=a[j];
        j=j-1;
      }
      a[j+1]=t;
    }
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    insertionsort ob = new insertionsort();
    int n,i;
    System.out.print("Enter size of array : ");
    n=Integer.parseInt(br.readLine());
    int a[] = new int[n];
    System.out.println("Enter "+n+" elements of the array -->");
    for(i=0;i<n;i++)
    {
      System.out.print("a["+(i+1)+"] = ");
      a[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("Original Array-->");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.println("\nSorted Array-->");
    ob.insertion(a,n);
  }
}