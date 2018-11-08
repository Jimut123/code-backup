import java.io.*;
class sort
{
    int arr[]=new int[50];
    int item,i,j,t,n,d=0,p,lb=0,ub=9;
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    void inpdata()throws IOException
    {
        System.out.println("Enter the integers:");
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the "+(i+1)+" th element :");
            arr[i]=Integer.parseInt(cd.readLine());
        }
    }
    void bubsort()
    {
        for(i=0;i<10;i++)
        {
            for(j=0;j<(10-i);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
        }
    }
    }
    void binsearch()throws IOException
    {
        System.out.println("Enter the item to be searched :");
        item=Integer.parseInt(cd.readLine());
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(item>arr[p])
            {
                lb=p+1;
            }
            else if(item<arr[p])
            {
                ub=p-1;
            }
            else if(item==arr[p])
            {
                d=1;
                j=p;
               
            }
            
        }
        if(d==0)
        {
            System.out.println("The item is not in the array.");
        }
         else
        {
            System.out.println("The item is  in the "+j+" th position of the array.");
        }
    }
    public static void main(String args[])throws IOException
    {
        sort ob = new sort();
        ob.inpdata();
        ob.bubsort();
        ob.binsearch();
    }
}
