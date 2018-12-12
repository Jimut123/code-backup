#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
void disp();//node*,node*);
/*node*/void insert();
/*node*/void delete_q();//node*,node*);
void menu();//node*,node*);
void push(int);//,node*);
void disp_stk();
void pop();
node* top,*front,*rear;
int c=0;
main()
{
      //node *front,*rear;
     top=NULL;
front=NULL;
rear=NULL;
      menu();//front,rear);
      getch();
}
/*node*/void insert()
{
      node* rear1;
      rear1=(node*)malloc(sizeof(node));
      printf("\nEnter data :\n");
      scanf("%d",&rear1->k);
      rear1->next=NULL;
      rear=/*return*/ rear1;
}
/*node*/void delete_q()//node* front, node* rear)
{
      node* front1=front;
      if(front==NULL)
      {
                           printf("\nUnderflow condition!!!!!!!!\n");
                           menu();//front,rear);
      }
      front1=front->next;
      printf("\nDeleted data :\n%d\n",front->k);
      push(front->k);//,rear);
      free(front);
      front=/*return*/ front1;
}
void disp()//node* front, node* rear)
{
     /*if(front==NULL)
     {
                    printf("\nYour QUEUE is EMPTY!!!!!!!!\n");
                    menu();//front,rear);
     }*/
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
void menu()//node* front, node* rear)
{
     int ch;
     int yy1=0;
     node* ff1;
     //rear=(node*)malloc(sizeof(node));
     do
     {
         printf("\nPress 1 to INSERT \nPress 2 to DELETE \nPress 3 to DISPLAY queue \nPress 4 to DISPLAY stack \nPress 5 to EXIT\n\n");
         scanf("%d",&ch);
         switch(ch)
         {
                   case 1: if(rear==NULL)
                           {
                           printf("\nrearnull");
                           /*rear=*/insert();
                           }
                           else
                           {
                               rear->next=(node*)malloc(sizeof(node));
                               rear=rear->next;
                               /*rear=*/insert();
                           }
                           if(front==NULL)
                           {
                           front=rear;
                           printf("\n %d",front->k);
                           
                           //front->n=NULL;
                           }
                           //front=rear;
                           /*ff1=front;
                           while(ff1!=NULL)
                           {
                                             yy1++;
                                             ff1=ff1->next;
                                             }
                                             printf("\n %d",yy1);*/
                           
                           
                           break;
                   case 2: /*front=*/delete_q();
                           break;
                   case 3: disp();//front,rear);
                           break;
                   case 4: disp_stk();
                           break;
                   case 5: exit(0);
                   default: printf("\nEnter from among the menu options only!!!!!!!!!\n");
         }
     }while(true);
}
void push(int t)//, node* rear)
{
      if(c==5)
      {
              pop();
              c=0;
      }
      node* top1;
      top1=(node*)malloc(sizeof(node));
      top1->k=t;
      c++;
      top1->next=top;
      top=top1;
}
void pop()//node* rear)
{
      node* top1=top;
      top1=top->next;
      rear->next=(node*)malloc(sizeof(node));
      rear=rear->next;
      rear->k=top->k;
      free(top);
      top=top1;
}
void disp_stk()
{
     printf("\nYour STACK using Linked List :\n");
     node* top1;
     top1=top;
     while(top1)
     {
                  printf("%d,\n",top1->k);
                  top1=top1->next;
     }
}
