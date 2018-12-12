#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next,*prev;
};
typedef struct list node;
node* insert(node*);
void disp(node*);
node* insrt_frst(node*);
node* insrt_last(node*);
node* insrt_mid(node*);
void new_node(node*);
main()
{
      node* head;
      head=(node*)malloc(sizeof(node));
      head=insert(head);
      disp(head);
      new_node(head);
      getch();
}
void new_node(node* head)
{
      int ch;
      do
      {
          printf("\n\nPress 1 to insert new data at the first location \nPress 2 to insert new data at the last location \nPress 3 to insert new data at the desired location \nPress 4 to exit \n\n");
          scanf("%d",&ch);
          switch(ch)
          {
                    case 1: head=insrt_frst(head);
                            break;
                    case 2: head=insrt_last(head);
                            break;
                    case 3: head=insrt_mid(head);
                            break;
                    case 4: exit(0);
                    default: printf("\nEnter from among the menu options!!!!!");
                             new_node(head);
          }
      }while(true);
}
node* insert(node* head)
{
      node* head1;
      head1=head;
      char ch='y';
      head1->prev=NULL;
      while(ch=='y' || ch=='Y')
      {
                    printf("\nEnter data :\n");
                    scanf("%d",&head1->k);
                    fflush(stdin);
                    printf("\nEnter another ?(y/n):\n");
                    scanf("%c",&ch);
                    if(ch=='y' || ch=='Y')
                    {
                              
                               head1->next=(node*)malloc(sizeof(node));
                               head1->next->prev=head1;//(node*)malloc(sizeof(node));
                               head1=head1->next;
                    }
      }
      head1->next=NULL;
      return head;
}
void disp(node* head)
{
     printf("\n\nYour Double Linked List next-----> :\n");
     node* head1;
     head1=head;
     while(head1->next!=NULL)
     {
                  printf("%d, ",head1->k);
                  head1=head1->next;
     }
     printf("%d, ",head1->k);
     printf("\n\nYour Double Linked List <-----prev :\n");
     while(head1->prev!=NULL)
     {
                  printf("%d, ",head1->k);
                  head1=head1->prev;
     }
     printf("%d, ",head1->k);
}
node* insrt_frst(node* head)
{
     node *head1;
     head1=(node*)malloc(sizeof(node));
     head1->prev=NULL;
     printf("\n\nEnter the new data :\n");
     scanf("%d",&head1->k);
     head->prev=head1;
     head1->next=head;
     head=head1;
     printf("\n\nAfter Inserting at the first,");
     disp(head);
     return head;
}
node* insrt_last(node* head)
{
     node *head1,*h=head;
     while(h->next)
     h=h->next;     
     head1=(node*)malloc(sizeof(node));
     printf("\n\nEnter the new data :\n");
     scanf("%d",&head1->k);
     head1->next=NULL;
     head1->prev=h;
     h->next=head1;
     printf("\n\nAfter Inserting at the last,");
     disp(head);
     return head;
}                     
node* insrt_mid(node* head)
{
     node *head1=head,*head2;
     head2=(node*)malloc(sizeof(node));
     head2->next=NULL;
     int c=0,f;
     char ch='y';
     fflush(stdin);
     printf("\n\nWant to enter at the beginning? :\n");
     scanf("%c",&ch);
     if(ch=='y' || ch=='Y')
     return head=insrt_frst(head);
     printf("\n\nEnter the node nunmber after which you want to insert the new data :\n");
     scanf("%d",&f);
     while(head1)
     {
                 c=c+1;
                 if(c==f)
                 {
                         if(head1->next==NULL)
                         return head=insrt_last(head);
                         else
                         {
                             printf("\n\nEnter the new data :\n");
                             scanf("%d",&head2->k);
                             head2->next=head1->next;
                             head1->next->prev=head2;
                             head1->next=head2;
                             head2->prev=head1;
                         }
                         break;
                 }
                 head1=head1->next;
     }
     printf("\n\nAfter Inserting at the desired location,");
     disp(head);
     return head;
}                     
