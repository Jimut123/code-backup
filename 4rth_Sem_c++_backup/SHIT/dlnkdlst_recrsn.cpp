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
main()
{
      node* head;
      head=(node*)malloc(sizeof(node));
      node* head1;
      head->prev=NULL;
      head1=head;
      head1=insert(head1);
      disp(head);
      getch();
}
node* insert(node* head1)
{
      char ch;
      printf("\nEnter data :\n");
      scanf("%d",&head1->k);
      fflush(stdin);
      printf("\nEnter another ?(y/n):\n");
      scanf("%c",&ch);
      if(ch=='y' || ch=='Y')
      {
                 head1->next=(node*)malloc(sizeof(node));
                 head1->next->prev=head1;
                 return insert(head1->next);
      }
      head1->next=NULL;
      return head1;
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
