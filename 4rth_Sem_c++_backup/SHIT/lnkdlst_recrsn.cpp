#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
node* insert(node*);
void disp(node*);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      node* start1;
      start1=start;
      start1=insert(start1);
      disp(start);
      getch();
}
node* insert(node* start1)
{
      char ch;
      printf("\nEnter data :\n");
      scanf("%d",&start1->k);
      fflush(stdin);
      printf("\nEnter another :\n");
      scanf("%c",&ch);
      if(ch=='y' || ch=='Y')
      {
                 start1->next=(node*)malloc(sizeof(node));
                 return insert(start1->next);
                 
      }
      start1->next=NULL;
      return start1;
}
void disp(node* start)
{
     printf("\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}

