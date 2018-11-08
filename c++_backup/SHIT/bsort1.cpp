#include <stdio.h>
#include <conio.h>
void bsort();
void print();
int a[100],n,i;
main()
{
      printf("\nEnter the array limit : \n");
      scanf("%d",&n);
      printf("\nEnter the array elements : \n");
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\nThe unsorted array : \n");
      print();
      bsort();
      getch();
}
void bsort()
{
     int j,t;
     for(i=0;i<n;i++)
     for(j=0;j<n-i-1;j++)
     if(a[j]>a[j+1])
     {
      t=a[j];
      a[j]=a[j+1];
      a[j+1]=t;
     }
     printf("\nThe sorted array : \n");
     print();
}
void print()
{
     for(i=0;i<n;i++)
     printf("%d, ",a[i]);
}
