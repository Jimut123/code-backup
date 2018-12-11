import java.io.*;
class binarysearch
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a[] = new int[20];
    int id[] = new int[20];
    int n,i,num,l,u,m,flag=0,d=0;
    System.out.print("\nEnter number of elements : ");
    n=Integer.parseInt(br.readLine());
    l=0;
    u=n-1;
    for(i=0;i<n;i++)
    {
      System.out.print("\nEnter number "+(i+1)+ " : ");
      a[i]=Integer.parseInt(br.readLine());
      id[i]=i+1;
    }
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.print("\nEnter number to be searched : ");
    num=Integer.parseInt(br.readLine());
    while(l<=u)
    {
      m=(l+u)/2;
      if(a[m]==num)
      {
        flag=1;
        d=id[m];
      }
      if(num>a[m])
        l=m+1;
      else
        u=m-1;
    }
    if(flag==1)
      System.out.println("\nNumber "+num+" found at position "+d);
    else
      System.out.println("\nNumber not found");
  }
}    