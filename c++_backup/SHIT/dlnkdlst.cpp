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
void sort_next(node*);
void sort_prev(node*);
node* rev(node*);
main()
{
      node* head;
      head=(node*)malloc(sizeof(node));
      head=insert(head);
      disp(head);
      sort_next(head);
      disp(rev(head));
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
                    printf("\nEnter another :\n");
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
void sort_next(node* head)
{
     printf("\n\nAfter Sorting (next----->),");
     node *head1,*head2;
     head1=head;
     int t=0;
     while(head1->next)
     {
                  head2=head1->next;
                  while(head2)
                  {
                               if(head1->k>head2->k)
                               {
                                                            t=head1->k;
                                                            head1->k=head2->k;
                                                            head2->k=t;
                               }
                               head2=head2->next;
                  }
                  head1=head1->next;
     }
     disp(head);
     sort_prev(head1);
     disp(head);
}
void sort_prev(node* head)
{
     printf("\n\nAfter Sorting (<-----prev),");
     node *head1,*head2;
     head1=head;
     int t=0;
     while(head1->prev)
     {
                  head2=head1->prev;
                  while(head2)
                  {
                               if(head1->k>head2->k)
                               {
                                                            t=head1->k;
                                                            head1->k=head2->k;
                                                            head2->k=t;
                               }
                               head2=head2->prev;
                  }
                  head1=head1->prev;
     }
}
node* rev(node* head)
{
     node *head1,*head2;
     head1=NULL;
     while(head!=NULL)
     {
                       head2=(node*)malloc(sizeof(node));
                       head2->prev=NULL;
                       head2->k=head->k;
                       head2->next=head1;
                       head1=head2;
                       head=head->next;
     }
     return head1;
}
