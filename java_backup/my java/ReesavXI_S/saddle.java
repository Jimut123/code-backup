import java.util.*;
class saddle
{
    int n;
    int a[][];
    saddle(int s)
    {
        n=s;
        a=new int[n][n];
    }
    void clac()
    {
        int i=0,j=0,max=0,min=0,sad=0,k=0,p=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter number");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]>max)
                max=a[i][j];
            }
        }
        min=max+1;
        max=0;
        for(k=0;k<n;k++)
        {
            for(i=k,j=0;i<n;i++)
            {
                if(a[i][j]>max)
                {
                max=a[i][j];
                p=i;
            }
            }
            for(j=0,i=p;j<n;j++)
            {
                if(a[i][j]<min)
                min=a[i][j];
            }
            if(max==min)
            {
                System.out.println("Saddle :-"+max);
                max=0;
                min=0;
            }
            else
            System.out.println("No Saddle");
        }
    }
}