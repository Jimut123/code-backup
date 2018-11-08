#include<stdio.h>
#include<conio.h>
int main()
{
     int n,i,j,c=0;
     printf("\nenter the number of lines :\n");
     scanf("%d",&n);
     for(i=1;i<=n;i++)
     {
     printf("\n");
     for(j=n;j>i;j--)
     printf(" ");
     if(c==0)
     for(j=1;j<=i;j++)
     if(j%2!=0)
     printf("0");
     else
     printf("1");
     else
     for(j=1;j<=i;j++)
     if(j%2!=0)
     printf("1");
     else
     printf("0");
     c++;
     if(c>2)
     c=0;
     }
     getch();
     return 0;
}    
