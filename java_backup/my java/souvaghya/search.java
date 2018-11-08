import java.io.*;
class search
{
    int a[],n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    search(int a)throws IOException
    {
        n=a;
        input();
        sort();
        search();
        //System.out.println(a[]);
    }
    void input()throws IOException
    {
        int i;
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        System.out.print("Enter elements into array");
    }
    void sort()
    {
        int t,j,i;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            if(a[j]<a[j+1])
            {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
        }
        for(i=0;i<n;i++)
        System.out.print("Sorted array"+a[i]);
    }
    void search()throws IOException
    {
    int v;
    v=Integer.parseInt(br.readLine());
    int low=0,mid,high=n-1;
    int f;
    mid=(low+high)/2;
    f=0;
    while(low<high)
    {
        if(a[mid]==v)
        {
            f=1;
            break;
        }
        else
        if(v>a[mid])
        {
            low=mid+1;
        }
        else
        if(v<a[mid])
        
            high=mid-1;
            mid=(low+high)/2;
        }
        if(f==1)
        System.out.println("Element found");
        else
         System.out.println("Element not found");
        }
        public static void main()throws IOException
        {
            int l;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            l=Integer.parseInt(br.readLine());
            search a=new search(l);
        }
    }
    
    