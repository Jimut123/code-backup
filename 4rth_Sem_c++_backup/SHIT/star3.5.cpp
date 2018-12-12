#include <stdio.h>
#include <conio.h>
int main()
{
     int n,i,j,k;
     printf("\nenter the number of lines :\n");
     scanf("%d",&n);
     k=n;
     for(i=1;i<=n;i++)
     { 
     for(j=1;j<=k;j++)
     printf("  ");
     for(j=1;j<=i;j++)
     printf(" *  ");
     k=k-1;
     printf("\n");
     }
     
     k=k+2;
     for(i=n-1;i>=1;i--)
     { 
     for(j=1;j<=k;j++)
     printf("  ");
     for(j=1;j<=i;j++)
     printf(" *  ");
     k=k+1;
     printf("\n");
     }
     
     getch();
     return 0;
}     
