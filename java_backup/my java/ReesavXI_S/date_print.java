import java.util.*;
class date_print
{
    int n;
    date_print(int num)
    {
        n=num;
    }
    void clac()
    {
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int r=0;
        r=n/1000000;
        int i=0,j=0,diff=0,k=0;
        k=-2;
        i=r;
        while(k!=1)
        {
            i=i+7;
            if(i>arr[j])
            {
                diff=i-arr[j];
                i=diff;
                if(j==11)
                break;
                j=j+1;
                System.out.println(i+"."+(j+1)+"."+(n%10000));
            }
            else
            System.out.println(i+"."+(j+1)+"."+(n%10000));
        }
    }
}