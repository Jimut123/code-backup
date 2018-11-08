#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
void disp(node*,node*);
node* insert();
node* delete_q(node*,node*);
void menu(node*,node*);
main()
{
      node *front,*rear;
      menu(front,rear);
      getch();
}
node* insert()
{
      node* rear1;
      rear1=(node*)malloc(sizeof(node));
      printf("\nEnter data :\n");
      scanf("%d",&rear1->k);
      rear1->next=NULL;
      return rear1;
}
node* delete_q(node* front, node* rear)
{
      node* front1=front;
      if(front==NULL)
      {
                           printf("\nUnderflow condition!!!!!!!!\n");
                           menu(front,rear);
      }
      front1=front->next;
      printf("\nDeleted data :\n%d\n",front->k);
      free(front);
      return front1;
}
void disp(node* front, node* rear)
{
     if(front==NULL)
     {
                    printf("\nYour QUEUE is EMPTY!!!!!!!!\n");
                    menu(front,rear);
     }
     printf("\nYour QUEUE using Linked List :\n");
     node* front1;
     front1=front;
     while(front1)
     {
                  printf("%d, ",front1->k);
                  front1=front1->next;
     }
     printf("\n");
}
void menu(node* front, node* rear)
{
     int ch;
     front=rear=NULL;
     //rear=(node*)malloc(sizeof(node));
     do
     {
         printf("\nPress 1 to INSERT \nPress 2 to DELETE \nPress 3 to DISPLAY \nPress 4 to EXIT\n\n");
         scanf("%d",&ch);
         switch(ch)
         {
                   case 1: if(rear==NULL)
                   {
                           printf("\n rearnull");
                           rear=insert();
                           }
                           else
                           {
                               rear->next=(node*)malloc(sizeof(node));
                               rear=rear->next;
                               rear=insert();
                           }
                           if(front==NULL)
                           front=rear;
                           break;
                   case 2: front=delete_q(front,rear);
                           break;
                   case 3: disp(front,rear);
                           break;
                   case 4: exit(0);
                   default: printf("\nEnter from among the menu options only!!!!!!!!!\n");
         }
     }while(true);
}
