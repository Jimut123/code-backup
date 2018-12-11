import java.io.*;
class selectionsort
{
  public void selection(int a[],int n)
  {
    int i,j,t;
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        if(a[j]>a[i])
        {
          t=a[j];
          a[j]=a[i];
          a[i]=t;
        }
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    selectionsort ob = new selectionsort();
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
    ob.selection(a,n);
  }
}