#include<stdio.h>
#include<conio.h>
void pow(int);
double s=1,n;
main()
{
      int p;
      printf("\nEnter the number :\n");
      scanf("%lf",&n);
      printf("\nEnter the power :\n");
      scanf("%d",&p);
      pow(p);
      getch();
}
void pow(int p)
{
     if(p==0)
     printf("\nResult = %lf",s);
     else
     {
         s=s*n;
         pow(--p);
     }
}
