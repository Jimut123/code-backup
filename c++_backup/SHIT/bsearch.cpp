#include <stdio.h>
#include <conio.h>
void bsort(int[] ,int);
void disp(int[],int);
void bsearch(int[],int,int);
main()
{
      int a[100],n,i,s;
      printf("\nEnter the array limit : \n");
      scanf("%d",&n);
      printf("\nEnter the array elements : \n");
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\nThe inputed array : \n");
      disp(a,n);
      bsort(a,n);
      printf("\n\nEnter the element to be searched : \n");
      scanf("%d",&s);
      bsearch(a,n,s);
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
     printf("\n\nThe sorted array : \n");
     disp(a,n);
}
void bsearch(int a[], int n, int s)
{
     int l=0,h=n-1,m=(l+h)/2,f=0;
     while(l<=h)
     {
      if(a[m]==s)
      {
       f=1;
       break;
      }
      else if(s<a[m])
      h=m-1;
      else if(s>a[m])
      l=m+1;
      m=(l+h)/2;
     }
     if(f==1)
     printf("\nElement %d found at position %d",s,(m+1));
     else
     printf("\nElement not found!!!!!!!");
}
void disp(int a[], int n)
{
     int i;
     for(i=0;i<n;i++)
     printf("%d, ",a[i]);
}
