#include"stdio.h"

void main()
{
     int a,b,c,n,i;
     printf("ENTER DATA");
     scanf("%d", &n);
     a=0;
     b=1;
     printf("%d,", a);
     printf("%d,", b);
     for(i=1;i<=n-2;i++)
     {
     c=a+b;
     printf("%d,", c);
     a=b;
     b=c;
     }
     getch();
     }
     
     
     
