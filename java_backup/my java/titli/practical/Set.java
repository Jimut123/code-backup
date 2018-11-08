package practical;

//creating smaller sets from an array as specified by the user
import java.io.*;
class Set
{
  int arr[];
  int sum[];
  int n;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void input()throws IOException
  {
      int i;
      System.out.println("enter no. of elements");
       n=Integer.parseInt(br.readLine());
      arr=new int[n]; 
      for(i=0;i<n;i++)
      {
          System.out.println("enter a no.");
           arr[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
         System.out.print(arr[i]+" ");
        System.out.println("");
        subset();
    }
    public void subset()throws IOException
    {
        int i,j,l,up,s=0,c=0,n1,max=0;
        System.out.println("enter no. of sets");
         n1=Integer.parseInt(br.readLine());
        sum=new int[n1];
        for(i=0;i<n1;i++)
        {
            System.out.println("lower limit = ");
             l=Integer.parseInt(br.readLine());
            System.out.println("upper limit = ");
             up=Integer.parseInt(br.readLine());
            for(j=l-1;j<up;j++)
            {
                System.out.print(arr[j]+" ");
                s=s+arr[j];
            }
            System.out.println("");
            System.out.println("sum = "+s);
            sum[c++]=s;
            s=0;
        }
        for(i=0;i<c;i++)
        {
            if (sum[i]>max)
             max=sum[i];
            }
            System.out.println("highest set value = "+max);
        }
    }
        
            
            