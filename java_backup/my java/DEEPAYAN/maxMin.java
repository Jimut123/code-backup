import java.util.*;
class maxMin
{
    private int max,min,maxPos,minPos,n;
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
     int b[]=new int[10];
         int c[]=new int[10];
    public void fetch()
    {
        System.out.println("ENTER THE ARRAY SIZE=");
        n=sc.nextInt();
        arr=new int[n];
        b=new int[n];
        c=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER A NUMBER= ");
            arr[i]=sc.nextInt();
        }
        
    }
    public void calcMaxmin()
    {
        max=arr[0];
        min=arr[0];
        for(int i=1;i<n;i++)
        {
            if (max <arr[i])
            {
                max=arr[i];
            }
            else
            if (min >arr[i])
            {
                min=arr[i];
            }
        }
        int t=0;
        int t1=0;
        for(int j=0;j<n;j++)
        {
            if (max==arr[j])
            {
                b[t++]=j;
                
            }
        }
        for(int k=0;k<n;k++)
        {
            if (min==arr[k])
            {
                c[t1++]=k;
            }
        }
        System.out.println("MAXIMUM ELEMENT="+max);
        System.out.println("PRESENT IN POSITIONS:-");
        for(int k=0;k<t;k++)
        {
            
            System.out.println(b[k]);
        }
         System.out.println("MINIMUM ELEMENT="+min);
         System.out.println("PRESENT IN POSITIONS:-");
         for(int k=0;k<t1;k++)
        {
            System.out.println(c[k]);
        }
    }
    public static void main(String args[])
    {
        maxMin obj=new maxMin();
        obj.fetch();
        obj.calcMaxmin();
    }
}

    
    