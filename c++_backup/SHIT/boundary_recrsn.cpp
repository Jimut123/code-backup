#include<stdio.h>
#include<conio.h>

void disp1(int);
void disp2(int,int);

int a[100][100],n,i,j;
main()
{
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
      printf("\n\nYour boundary elements :\n");
      disp1(i);
      getch();
}
void disp1(int i)
{
     if(i==n)
     return;
     else
     {
         j=0;
         disp2(i,j);
         printf("\n");
         disp1(++i);
     }
}
void disp2(int i, int j)
{
     if(j==n)
     return;
     else
     {
         if(i==0 || i==n-1 || j==0 || j==n-1)
         printf("%d, ",a[i][j]);
         else
         printf("   ");
         disp2(i,++j);
     }
}
