//
import java.util.*;
class KingMain
{
   public static void main(String args[])
   {
       King obj= new King();
       obj.get();
    }
}
class King
{
  private int arr[];
  public void get()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of visits and number of citizens");
       int v=sc.nextInt();
       arr=new int[sc.nextInt()+v];
       System.out.println("Input : ");
       for(int i=0;i<arr.length;i++)
       
           arr[i]=sc.nextInt();
           System.out.println("Output : ");
           for(int i=0;i<v;i++)
           {
               int j=0;int k=0;
               for(;j<arr.length&&arr[j]!=-1;j++)
               k=(arr[j]>arr[k])?j:k;
               System.out.println(arr[k]+" ");
               shift(j);
               shift(k);
            }
        }
    
        public void shift(int k)
        {
            int t=arr[k];
            for(;k<arr.length-1;k++)
             arr[k]=arr[k+1];
             arr[k]=t;
            }
        }
               
           