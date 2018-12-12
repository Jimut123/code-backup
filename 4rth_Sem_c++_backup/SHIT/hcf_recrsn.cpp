#include<stdio.h>
#include<conio.h>
void hcf(int,int);
main()
{
      int a,b,c,d;
      printf("\nEnter the 1st number :\n");
      scanf("%d",&a);
      printf("\nEnter the 2nd number :\n");
      scanf("%d",&b);
      if(a>b)
      {
             c=a;
             d=b;
      }
      else
      {
          c=b;
          d=a;
      }
      hcf(c,d);
      getch();
}
void hcf(int c, int d)
{
     if(c%d!=0)
     {
               int f=c%d;
               c=d;
               d=f;
               hcf(c,d);
     }
     else
     printf("\nH.C.F. = %d",d);
}
