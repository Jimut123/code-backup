import java.util.*;
class arr_sort
{
    int a[];
    int n;
    arr_sort(int s)
    {
        n=s;
        a=new int[n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element ");
            a[i]=sc.nextInt();
        }
    }
    void sort()
    {
        int l=0,j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
                for(int k=j;k<n;k++)
                {
                    if(arrOdd(i)==true)
                    break;
                    if(a[k]%2==1)
                    {
                        System.out.print(a[k]+" ");
                        l++;
                    }
                    if(l%2==0&&l!=0)
                    {
                        j=k+1;
                        break;
                    }
                }
            }
        }
    }
    boolean arrOdd(int i)
    {
        int cr=0;
        for(int j=i;j<n;j++)
        {
            if(a[j]%2==1)
            cr=cr+1;
        }
        if(cr==0)
        return true;
        return false;
    }
}
