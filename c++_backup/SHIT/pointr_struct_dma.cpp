#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct employee
{
       char name[100];
       int basic;
};
typedef  struct employee e;
e* insrt(e*,int);
void disp(e*,int);
int t=0;
main()
{
      e* strt;
      int n;
      printf("\n Enter term:");
      scanf("%d",&n);
      strt=(e*)malloc(n*sizeof(e));
      strt=insrt(strt,n);
      
      disp(strt,n);
      getch();
}
e* insrt(e* strt,int n)
{
      int i=0,c=1;
      do
      {
          fflush(stdin);
          printf("\nEnter the employee name :\n");
          gets((strt+t)->name);
          printf("\nEnter the basic pay :\n");
          scanf("%d",&(strt+t)->basic);
          t=t+1;
         
      }while(t<n);
            return strt;
}
void disp(e* strt,int n)
{
    int i; 
   for(i=0;i<n;i++)
      printf("\n%d,%s ", (strt+i)->basic,(strt+i)->name);
}
