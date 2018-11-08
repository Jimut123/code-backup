#include <stdio.h>
#include <conio.h>
int main()
{
     int n,i,j;
     printf("\nenter the number of lines :\n");
     scanf("%d",&n);
     for(i=1;i<=n;i++)
     { 
     printf("\n");
     for(j=1;j<=(n-i)/2;j++)
     printf("  ");
     for(j=1;j<=i;j++)
     printf("* ");
     }
     getch();
     return 0;
}     
