#include<stdio.h>
#include<conio.h>
void menu();
void disp();
void func();
int a[100][100],n,i,j,t;
main()
{
      printf("\nEnter the matrix limit :\n");
      scanf("%d",&n);
      printf("\nEnter the matrix elements :\n");
      for(i=0;i<n;i++)
      for(j=0;j<n;j++)
      scanf("%d",&a[i][j]);
      disp();
      menu();
      getch();
}
void menu()
{
      int ch;
      do
      {
          printf("\nPress 1 to operate \nPress 2 to display \nPress 3 to exit\n\n");
          scanf("%d",&ch);
          switch(ch)
          {
                    case 1: func();
                            break;
                    case 2: disp();
                            break;
                    case 3: return;
                    default: printf("\n\nEnter from among the menu options!!!!!!!!!\n");
          }
      }while(true);
      
}
void disp()
{
     printf("\nYour matrix :\n\n");
     for(i=0;i<n;i++)
     {
                     for(j=0;j<n;j++)
                     printf("%d (%d,%d), ",a[i][j],i,j);
                     printf("\n\n");
     }
}
void func()
{
     int r,c,f=0;
     printf("\nEnter the row number :\n");
     scanf("%d",&r);
     printf("\nEnter the column number :\n");
     scanf("%d",&c);
     for(i=0;i<n;i++)
     {
                     for(j=0;j<n;j++)
                     if(i==r && j==c)
                     {
                             for(t=j+1;t<n;t++)
                             a[i][t-1]=a[i][t];
                             for(t=i+1;t<n;t++)
                             a[t-1][n-1]=a[t][n-1];
                             a[n-1][n-1]=0;
                             f=1;
                             break;        
                     }
                     if(f==1)
                     break;
     }
}

