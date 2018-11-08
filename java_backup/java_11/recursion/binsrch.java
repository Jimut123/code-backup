import java.io.*;
class binsrch
{
    int binary_search(int lb,int ub,int m)
    {
        mid=(lb+ub)/2;
        if(a[mid]>m)
        {
            return binary_search(int lb,int mid-1,int m)
        }
         else if(a[mid]>m)
        {
            return binary_search(int mid+1,int ub,int m)
        }
        else  if(a[mid]==m)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
    
}