#include"stdio.h"
#include"conio.h"
#include"stdlib.h"
struct list
{
       int data;
       struct list * next;
       struct list * prev;
       };
typedef struct list node;
node* create(node*);
void disp(node*);
int main()
{
     node*head;
     head=(node*)malloc(sizeof(node));
     head=create(head);
     disp(head);
     getchar();
     return 0;
     }
     node* create(node* head)
     {
          node *head1;
           char ch='y';
           head->prev=NULL;
            head->next=NULL;
           head1=head;
           while(ch=='y' || ch=='Y')
           {
                         printf("\n Enter data:");
                         scanf("%d",&head1->data);
                         fflush(stdin);
                         printf("Want another data(Y/N)");
                         scanf("%c",&ch);
                         if(ch=='y'||ch=='Y')
                         {
                                             head1->next=(node*)malloc(sizeof(node));
                                             head1->next->prev=head1;
                                             head1=head1->next;
                                             }
                                             }
                                             head1->next=NULL;
                                             return head;
                                             }
                                             void disp(node * head)
                                             {
                                                  node *head1;
                                                  head1=head;
                                                  printf("\n Display starts.....");
                                                  while(head1->next!=NULL)
                                                  {
                                                      printf("%d",head1->data); 
                                                      head1=head1->next;
                                                      }
                                                      //head1=head1->prev;
                                                      //while(head1->prev!=NULL)
                                                 // {
                                                   //   printf("%d",head1->data); 
                                                     // head1=head1->prev;
                                                     // }   
                                                      }                
