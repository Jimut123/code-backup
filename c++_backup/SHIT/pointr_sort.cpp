#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{
      int *a,i,j,n,t;
      printf("\nEnter the limit :\n");
      scanf("%d",&n);
      a=(int*)malloc(n*sizeof(int));
      printf("\nEnter the array elements :\n");
      for(i=0;i<n;i++)
      scanf("%d",(a+i));
      printf("\n\nThe unsorted array :\n");
      for(i=0;i<n;i++)
      printf("%d, ",*(a+i));
      
      for(i=0;i<n;i++)
      for(j=0;j<n-i-1;j++)
      if(*(a+j)>*(a+(j+1)))
      {
       t=*(a+j);
       *(a+j)=*(a+(j+1));
       *(a+(j+1))=t;
      }
      printf("\n\nThe sorted array :\n");
      for(i=0;i<n;i++)
      printf("%d, ",*(a+i));
      getch();
}
