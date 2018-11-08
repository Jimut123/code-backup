#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
void disp(node*);
node* push(node*);
node* pop(node*);
void menu(node*);
main()
{
      node* top;
      menu(top);
      getch();
}
node* push(node* top)
{
      node* top1;
      top1=(node*)malloc(sizeof(node));
      printf("\nEnter data :\n");
      scanf("%d",&top1->k);
      top1->next=top;
      return top1;
}
node* pop(node* top)
{
      node* top1=top;
      if(top==NULL)
      {
                           printf("\nUnderflow condition!!!!!!!!\n");
                           menu(top);
      }
      top1=top->next;
      printf("\nPopped data :\n%d\n",top->k);
      free(top);
      return top1;
}
void disp(node* top)
{
     if(top==NULL)
     {
                    printf("\nYour STACK is EMPTY!!!!!!!!\n");
                    menu(top);
     }
     printf("\nYour STACK using Linked List :\n");
     node* top1;
     top1=top;
     while(top1)
     {
                  printf("%d,\n",top1->k);
                  top1=top1->next;
     }
}
void menu(node* top)
{
     int ch;
     top=NULL;
     do
     {
         printf("\nPress 1 to PUSH \nPress 2 to POP \nPress 3 to DISPLAY \nPress 4 to EXIT\n\n");
         scanf("%d",&ch);
         switch(ch)
         {
                   case 1: top=push(top);
                           break;
                   case 2: top=pop(top);
                           break;
                   case 3: disp(top);
                           break;
                   case 4: exit(0);
                   default: printf("\nEnter from among the menu options only!!!!!!!!!\n");
         }
     }while(true);
}
