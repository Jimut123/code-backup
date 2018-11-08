#include <stdio.h>
#include <conio.h>
void bsort(int[] ,int);
void disp(int[],int);
main()
{
      int a[100],n,i;
      printf("\nEnter the array limit : \n");
      scanf("%d",&n);
      printf("\nEnter the array elements : \n");
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\nThe unsorted array : \n");
      disp(a,n);
      bsort(a,n);
      getch();
}
void bsort(int a[], int n)
{
     int j,i,t;
     for(i=0;i<n;i++)
     for(j=0;j<n-i-1;j++)
     if(a[j]>a[j+1])
     {
      t=a[j];
      a[j]=a[j+1];
      a[j+1]=t;
     }
     printf("\nThe sorted array : \n");
     disp(a,n);
}
void disp(int a[], int n)
{
     int i;
     for(i=0;i<n;i++)
     printf("%d, ",a[i]);
}
