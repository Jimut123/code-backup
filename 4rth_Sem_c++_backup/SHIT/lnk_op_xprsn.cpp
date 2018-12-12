#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
void insert();
void calc();
void disp();
node* start1,*start2,*start3;
main()
{
      start1=(node*)malloc(sizeof(node));
      start2=(node*)malloc(sizeof(node));
      start3=(node*)malloc(sizeof(node));
      insert();
      disp();
      getch();
}
void insert()
{
      node* str1,*str2,*str3;
      str1=start1;
      str2=start2;
      str3=start3;
      int x,y;
      printf("\nEnter value of x :\n");
      scanf("%d",&x);
      printf("\nEnter value of y :\n");
      scanf("%d",&y);
      str1->k=2*x;
      str1->next=(node*)malloc(sizeof(node));
      str1=str1->next;
      str1->k=3*y;
      str1->next=NULL;
      str2->k=5*x;
      str2->next=(node*)malloc(sizeof(node));
      str2=str2->next;
      str2->k=7*y;
      str2->next=NULL;
      calc();
}
void calc()
{
     node* str1,*str2,*str3;
     str1=start1;
     str2=start2;
     str3=start3;
     str3->k=str1->k+str2->k;
     str1=str1->next;
     str2=str2->next;
     str3->next=(node*)malloc(sizeof(node));
     str3=str3->next;
     str3->k=str1->k+str2->k;
     str1=str1->next;
     str2=str2->next;
     str3->next=NULL;
}
void disp()
{
     printf("\nYour Equation Linked List 1 :\n");
     node* str1;
     str1=start1;
     while(str1)
     {
                printf("%d, ",str1->k);
                str1=str1->next;
     }
     printf("\n\nYour Equation Linked List 2 :\n");
     node* str2;
     str2=start2;
     while(str2)
     {
                printf("%d, ",str2->k);
                str2=str2->next;
     }  
     printf("\n\nYour Equation Linked List 3 :\n");
     node* str3;
     str3=start3;
     int s=0;
     while(str3)
     {
                s=s+str3->k;
                printf("%d, ",str3->k);
                str3=str3->next;
     }
     printf("\n\nResult = %d",s);
}
