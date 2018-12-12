#include<stdio.h>
#include<conio.h>

struct employee
{
       int code;
       char name[100];
       double sal;
       struct salary
       {
              double da,hra,ta,gross;
       };
       struct salary s;
       struct deduction
       {
              double it,pf;
       };
       struct deduction d;
       double net;
};
void pay(int);
void dedn(int);
void netpay(int);
void disp(int);
struct employee e[100];
main()
{
     int t=0,c=1,;
     printf("\nEnter the employee details :\n");
     do
     {
         printf("\nEnter the employee code :\n");
         scanf("%d",&e[t].code);
         fflush(stdin);
         printf("\nEnter the employee name :\n");
         gets(e[t].name);
         printf("\nEnter the employee basic salary :\n");
         scanf("%lf",&e[t].sal);
         t++;
         printf("\nWant to enter more? (yes=1/no=0) :\n");
         scanf("%d",&c);
     }while(c==1);
     pay(t);
     getch();
}
void pay(int t)
{
     int i;
     for(i=0;i<t;i++)
     {
      e[i].s.da=(0.105*e[i].sal);
      e[i].s.hra=(0.125*e[i].sal);
      e[i].s.ta=(0.155*e[i].sal);
      e[i].s.gross=e[i].s.da+e[i].s.hra+e[i].s.ta;
     }
     dedn(t);
}
void dedn(int t)
{
     int i;
     for(i=0;i<t;i++)
     {
      e[i].d.it=(0.153*e[i].sal);
      e[i].d.pf=(0.136*e[i].sal);
     }
     netpay(t);
}
void netpay(int t)
{
     int i;
     for(i=0;i<t;i++)
     e[i].net=e[i].sal+e[i].s.gross-e[i].d.it-e[i].d.pf;
     disp(t);
}
void disp(int t)
{
     int i;
     printf("\n\nThe complete employee details : ");
     for(i=0;i<t;i++)
      printf("\n\nCode : %d \nName : %s \nBasic salary : %.2lf \nNet salary : %.2lf",e[i].code,e[i].name,e[i].sal,e[i].net);
}
