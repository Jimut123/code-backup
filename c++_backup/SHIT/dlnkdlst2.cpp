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
node* del_frst(node*);
node* del_last(node*);
node* del_mid(node*);
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
          printf("\n\nPress 1 to delete the first node \nPress 2 to delete the last node \nPress 3 to delete a node at a desired location \nPress 4 to exit \n\n");
          scanf("%d",&ch);
          switch(ch)
          {
                    case 1: head=del_frst(head);
                            break;
                    case 2: head=del_last(head);
                            break;
                    case 3: head=del_mid(head);
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
                               head1->next->prev=head1;
                               head1=head1->next;
                    }
      }
      head1->next=NULL;
      return head;
}
void disp(node* head)
{
     if(head==NULL)
     {
           printf("\nThe linked list is now EMPTY!!!!!!!!!\n");
           exit(0);
     }  
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
node* del_frst(node* head)
{
     if(head==NULL)
     {
           printf("\nThe linked list is now EMPTY!!!!!!!!!\n");
           exit(0);
     }   
     head->next->prev=NULL;
     free(head);
     head=head->next;
     printf("\n\nAfter Deleting the first node,");
     disp(head);
     return head;
}
node* del_last(node* head)
{
     if(head==NULL)
     {
           printf("\nThe linked list is now EMPTY!!!!!!!!!\n");
           exit(0);
     } 
     node* h=head;
     while(h->next!=NULL)
     h=h->next;
     h->prev->next=NULL;
     free(h);
     printf("\n\nAfter Deleting the last node,");
     disp(head);
     return head;
}                     
node* del_mid(node* head)
{
     if(head==NULL)
     {
           printf("\nThe linked list is now EMPTY!!!!!!!!!\n");
           exit(0);
     } 
     node *head1=head;
     int c=0,f;
     printf("\n\nEnter the node number which you want to delete :\n");
     scanf("%d",&f);
     if(f==1)
     return head=del_frst(head);
     else
     {
         while(head1)
         {
                 c=c+1;
                 if(c==f)
                 {
                         if(head1->next==NULL)
                         return head=del_last(head);
                         else
                         {
                             head1->next->prev=head1->prev;
                             head1->prev->next=head1->next;
                             free(head1);
                         }
                         break;
                 }
                 head1=head1->next;
         }
     }
     printf("\n\nAfter Deleting the node at the desired location,");
     disp(head);
     return head;
}                     
