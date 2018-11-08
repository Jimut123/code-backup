#include<stdio.h>
#include<conio.h>

void disp1(int);
void disp2(int);

int a[100][100],i,j;
main()
{
      int n;
      printf("\nEnter the matrix limit :\n");
      scanf("%d",&n);
      printf("\nEnter the matrix elements :\n");
      for(i=0;i<n;i++)
      for(j=0;j<n;j++)
      scanf("%d",&a[i][j]);
      printf("\nYour matrix :\n");
      for(i=0;i<n;i++)
      {
       for(j=0;j<n;j++)
       printf("%d, ",a[i][j]);
       printf("\n");
      }
      i=j=0;
      printf("\n\nLeft diagonal :\n");
      disp1(n);
      getch();
}
void disp1(int n)
{
     if(i==n)
     {
             i=j=0;
             j=n-1;
             printf("\n\nRight diagonal :\n");
             disp2(n);
     }
     else
     {
         printf("%d, ",a[i][i]);
         i++;
         disp1(n);
     }
}
void disp2(int n)
{
     if(i==n)
     return;
     else
     if(j<0)
     return;
     else
     {
         printf("%d, ",a[i][j]);
         i++;
         j--;
         disp2(n);
     }
}
