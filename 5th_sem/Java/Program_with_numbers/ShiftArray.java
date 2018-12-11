import java.io.*;
class ShiftArray
{
  public void shift(int a[],int n,int m)
  {
    int i,j,temp;
    for(j=1;j<=m;j++)
    {
       temp=a[0];
       for(i=0;i<n-1;i++)
          a[i]=a[i+1];
       a[i]=temp;
    }
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.println();
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ShiftArray ob = new ShiftArray();
    int n,i,m;
    System.out.print("Enter size of array : ");
    n=Integer.parseInt(br.readLine());
    System.out.print("Enter number of elements to be shifted : ");
    m=Integer.parseInt(br.readLine());
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
    System.out.println("\nShifted Array-->");
    ob.shift(a,n,m);
  }
}