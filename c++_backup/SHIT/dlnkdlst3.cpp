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
void arrange(node*);
main()
{
      node* head;
      head=(node*)malloc(sizeof(node));
      head=insert(head);
      disp(head);
      arrange(head);
      disp(head);
      getch();
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
                               head1->next->prev=head1;
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
void arrange(node* head)
{
     node* head1=head,*head2=head;
     int t;
     while(head1->next!=NULL)
     head1=head1->next;
     while(head2)
     {
                 if(head1->k%2==0 && head2->k%2!=0)
                 {
                                  t=head2->k;
                                  head2->k=head1->k;
                                  head1->k=t;
                 }
                 //if(head2->next==head1->prev)
                 //break;
                 head1=head1->prev;
                 head2=head2->next;
     }
     printf("\n\n\nAfter arranging,");
}
