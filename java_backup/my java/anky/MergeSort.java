import java.io.*;
class MergeSort
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int i=0,j=0,t=0,a[],b[],c[],n,temp;
    public void sort()throws IOException
    {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        while(i<5)
        {
            System.out.println("Enter element of first array");
            n=Integer.parseInt(br.readLine());
            a[i]=n;
            i++;
        }
        i=0;
        while(i<5)
        {
            System.out.println("Enter element of second array");
            n=Integer.parseInt(br.readLine());
            b[i]=n;
            i++;
        }
        i=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        i=0;
        j=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            j=0;
            if(a[i]<b[j])
            {
                c[t]=a[i];
                i++;
                t++;
            }
            else
            {
                c[t]=b[j];
                j++;
                t++;
            }
        }
        System.out.println("Sorted array is:");
        for(i=0;i<10;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
    public void main()throws IOException
    {
        sort();
    }
}