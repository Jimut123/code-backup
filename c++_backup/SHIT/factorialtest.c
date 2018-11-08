#include"stdio.h"

void main()
{
     int a,b,n;
     printf("INPUT NO. TO CALC FACTORIAL");
     scanf("%d",&n);
     b=1;
     for(a=1;a<=n;a++)
     b=b*a;
     printf("%d", b);
     getch();
     }
     
