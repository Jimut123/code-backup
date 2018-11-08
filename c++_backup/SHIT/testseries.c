#include"stdio.h"
void main()
{
     int b,n,i;
     printf("ENTER LIMIT");
     scanf("%d", &n);
     for(i=n;i>=1;i--)
     {
      for(b=1;b<=i;b++)
      printf(" %d",b);
     printf("\n");
     }
     getch();
     }
      
