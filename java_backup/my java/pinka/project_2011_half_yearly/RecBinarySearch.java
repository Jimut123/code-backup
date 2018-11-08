package project_2011_half_yearly;

//binary search in an array using recursion
import java.io.*;
class RecBinarySearch
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int a[];
  int n,num;
  public void get()throws IOException
  {
      int i;
      System.out.println("enter no. of elements");
       n=Integer.parseInt(br.readLine());
      a=new int[n];
      for(i=0;i<n;i++)
       a[i]=Integer.parseInt(br.readLine());
      System.out.println("enter no.to be searched for");
       num=Integer.parseInt(br.readLine());
      sort();
    }
    public void sort()
    {
        int i,j,t,l,h;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        l=0;
        h=n-1;
        boolean b=search(l,h);
        if(b==true)
         System.out.println("number found");
        else
         System.out.println("number not found");
        }
        
    public boolean search(int low,int high)
    {
        int mid;
        mid=(low+high)/2;
        if (mid==num)
         return true;
        if (num>mid)
         low=mid+1;
        if (num<mid)
         high=mid-1;
        search(low,high);
        return false;
    }
}
    
    