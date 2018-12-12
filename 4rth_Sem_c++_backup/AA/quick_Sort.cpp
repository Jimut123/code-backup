#include <iostream>

void qsort(int a[], int low, int high)
{
    if(low<high)
    {
        int pivotloc = partition(a,low,high);
        qsort(a,low,high);
        qsort(a,pivotloc+1,high);
    }
}

void partition(int a[], int low, int high)
{
    swap(low,(high+low)/2,a);
    int pivotkey = a[low];
    int pivotloc = low;
    for(i=low+1,i<=high;i++)
    {
        if(a[i]<pivotkey)
        {
            swap(++pivotloc,i,a);
            swap(low,pivotloc,a);
            return pivotloc;
        }
    }
}
