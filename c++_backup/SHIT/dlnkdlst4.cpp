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
int disp(node*);
void high_low(node*);
void split(node*,int);
main()
{
      node* head;
      head=(node*)malloc(sizeof(node));
      head=insert(head);
      int k=disp(head);
      high_low(head);
      split(head,k);
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
int disp(node* head)
{
     printf("\n\nYour Double Linked List next-----> :\n");
     node* head1;
     head1=head;
     int c=1;
     while(head1->next!=NULL)
     {
                  c=c+1;
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
     return c;
}
void high_low(node* head)
{
     node* head1=head;
     int h=0,l;
     while(head1)
     {
                 if(head1->k>h)
                 h=head1->k;
                 head1=head1->next;
     }
     l=h;
     head1=head;
     while(head1)
     {
                 if(head1->k<l)
                 l=head1->k;
                 head1=head1->next;
     }
     printf("\n\nHighest node value : %d\n\nLowest node value : %d\n",h,l);
}
void split(node* head, int c)
{
     int n=0;
     printf("\nEnter the position from where you want to split the list :\n");
     scanf("%d",&n);
     int i;
     node *head1=head,*head2;
     for(i=1;i<=c;i++)
     {
                      if(i==n)
                      break;
                      head1=head1->next;
     }
     head2=head1->next;
     head2->prev=NULL;
     head1->next=NULL;
     n=disp(head);
     n=disp(head2);
}
