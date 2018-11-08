#include<stdio.h>
#include<conio.h>
#include"stdlib.h"
struct abc
{
       int x;
       int y;
       struct abc1
       {
              int a;
              int b;
       };
       
    //p1=malloc(sizeof(struct abc1));   
      
};
main()
{
      struct abc *p;
      p=(struct abc*)malloc(sizeof(struct abc));
      
      printf("\nEnter roll no. :\n");
      scanf("%d",p->x);
      printf("\nEnter serial no. :\n");
      scanf("%d",p->y);
      printf("\nEnter marks1 :\n");
      scanf("%d",p->p1->a);
      printf("\nEnter marks2 :\n");
      scanf("%d",p->p1->b);
      printf("\nRoll no.=%d\nSerial no.=%d\nMarks1=%d\nMarks2=%d",p->x,p->y,p->p1->a,p->p1->b);
      getch();
}
