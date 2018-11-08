//  binary
import java.io.*;
class search
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[];
        int ret,t,k,n,no,i,j,s;
        public void get() throws IOException
        {
            System.out.println(" Enter an array size");
            n=Integer.parseInt(br.readLine());
            arr= new int[n];
            for(i=0;i<n;i++)
            {
                System.out.println(" Enter an array element");
                arr[i]=Integer.parseInt(br.readLine());
            } // for loop ends
            
            System.out.println(" Showing original array");
            show(arr);
            calc1(arr);
            System.out.println(" Showing sorted array");
            show(arr);
            System.out.println(" Enter number to be searched");
            no=Integer.parseInt(br.readLine());
            ret=calc2(arr,no);
            if(ret==-1)
                System.out.println(" The number is not present");
            else
               System.out.println(" The number is present in the position "+ret);
        } // get() ends
        public void calc1( int a[])
        {
            s=a.length;
            for(i=1;i<s;i++)
            {
                for(j=0;j<s-i;j++)
                {
                    if(a[j]<a[j+1])
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }// if ends
                }//inner loop ends
            }// outer loop ends
        }// calc1() ends
        public int calc2(int a[], int k)
        {
            
            int low=0;
            int high=a.length-1;
            int mid=0;
            while(low <= high)
            {
                mid=(low+high)/2;
                 if(k>a[mid])
                 high=mid-1;
                 if(k<a[mid])
                 low=mid+1;
                 if(k==a[mid])
                 return(mid+1);
             }// while ends
             return(-1);
        } // calc2() ends
        public void show(int a[])
        {
            for(i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        } // show() ends
    } // class search ends
    public class BinnarySearch
        {
            public static void main(String args[]) throws IOException
              {
                  search obj=new search();
                  obj.get();
              } // main() ends
         } // class BinarySearch ends
                            
        