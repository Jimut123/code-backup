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
      printf("\nEnter car number to register:\n");
      scanf("%d",&top1->k);
      top1->next=top;
      return top1;
}
node* pop(node* top)
{
      node* top1=top;
      node* temp=NULL;
      if(top==NULL)
      {
                           printf("\nUnderflow condition!!!!!!!!\n");
                           menu(top);
      }
      int c,f=0;
      printf("\nEnter car number to deregister :\n");
      scanf("%d",&c);
      while(top1)
      {
                 if(top1->k!=c)
                 {
                              node* temp1;
                              temp1=(node*)malloc(sizeof(node));
                              temp1->k=top1->k;
                              temp1->next=temp;
                              temp=temp1;
                 }
                 else
                 {
                     f=1;
                     printf("\nCar number %d found.... Car number deregistered....\n",top1->k);
                     top1=top1->next;
                     while(temp)
                     {
                                 node* top2;
                                 top2=(node*)malloc(sizeof(node));
                                 top2->k=temp->k;
                                 top2->next=top1;
                                 top1=top2;
                                 temp=temp->next;                                 
                     }
                     break;
                 }
                 top1=top1->next;
      }
      if(f==0)
      {
              printf("\nCar number %d not found!!!!!!!!\n",c);
              return top;
      }
      return top1;
}
void disp(node* top)
{
     if(top==NULL)
     {
                    printf("\nYour register is EMPTY!!!!!!!!\n");
                    menu(top);
     }
     printf("\nYour car number register :\n");
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
         printf("\nPress 1 to PUSH a car number in register \nPress 2 to POP a car number \nPress 3 to DISPLAY the register \nPress 4 to EXIT\n\n");
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
