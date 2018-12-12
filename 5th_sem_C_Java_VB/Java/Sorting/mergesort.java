import java.io.*;
class mergesort
{
  public void merge(int a[],int lowerIndex, int middle, int higherIndex)
  {
    int tempMergArr[] = new int[100];
    for (int i = lowerIndex; i <= higherIndex; i++)
       tempMergArr[i] = a[i];
    int i = lowerIndex;
    int j = middle + 1;
    int k = lowerIndex;
    while (i <= middle && j <= higherIndex)
    {
        if (tempMergArr[i] <= tempMergArr[j])
        {
          a[k] = tempMergArr[i];
          i++;
        }
        else
        {
           a[k] = tempMergArr[j];
           j++;
        }
        k++;
    }
    while (i <= middle)
    {
       a[k] = tempMergArr[i];
       k++;
       i++;
    }
}
  public void sort(int a[],int l,int r)
  {
    if(l<r)
    {
      int m = (l+r)/2;
      sort(a,l,m);
      sort(a,m+1,r);
      merge(a,l,m,r);
    }
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    mergesort ob = new mergesort();
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
    ob.sort(a,0,n-1);
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
  }
}