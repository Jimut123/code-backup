#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int* bsort(int*,int);
main()
{
      int *a,i,n;
      printf("\nEnter the limit :\n");
      scanf("%d",&n);
      a=(int*)malloc(n*sizeof(int));
      printf("\nEnter the array elements :\n");
      for(i=0;i<n;i++)
      scanf("%d",(a+i));
      printf("\nThe unsorted array :\n");
      for(i=0;i<n;i++)
      printf("\n%d",*(a+i));
      int* (*func)(int*,int);
      func=&bsort;
      a=func(a,n);
      printf("\nThe sorted array :\n");
      for(i=0;i<n;i++)
      printf("\n%d",*(a+i));
      getch();
}
int* bsort(int* b, int n)
{
     int i,j,t;
     for(i=0;i<n;i++)
     for(j=0;j<n-i-1;j++)
     if(*(b+j)>*(b+j+1))
     {
      t=*(b+j);
      *(b+j)=*(b+j+1);
      *(b+j+1)=t;
     }
     return b;
     
}
