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
void menu(node*);
void disp(node*);
node* sort(node*);
node* insrt_new(node*);
node* split(node*);
void del_menu(node*);
node* del_frst(node*);
node* del_last(node*);
node* del_mid(node*);
main()
{
      node* head;
      head=(node*)malloc(sizeof(node));
      head=insert(head);
      disp(head);
      menu(head);
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
                               head1->next->prev=head1;
                               head1=head1->next;
                    }
      }
      head1->next=NULL;
      return head;
}
void menu(node* head)
{
     int ch;
     do
     {
         printf("\n\nPress 1 to display \nPress 2 to sort \nPress 3 to insert new \nPress 4 to split \nPress 5 to delete \nPress 6 to exit\n");
         scanf("%d",&ch);
         switch(ch)
         {
                   case 1: disp(head);
                           break;
                   case 2: head=sort(head);
                           break;
                   case 3: head=insrt_new(head);
                           break;
                   case 4: head=split(head);
                           break;
                   case 5: del_menu(head);
                           break;
                   case 6: exit(0);
                   default: printf("\nEnter from among the menu options!!!!!");
                            menu(head);
         }
     }while(true);
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
node* sort(node* head)
{
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
     printf("\n\nSorting complete.....");
     return head;
}
node* insrt_new(node* head)
{
      node *head1=head,*head2,*n;
      printf("\nEnter the new data :\n");
      scanf("%d",&n->k);
      while(head1)
      {
                  if(n->k>head1->k && n->k<=head1->next->k)
                  {
                                     head2=head1->next;
                                     n-> next=head2;
                                     head1->next->prev=n;
                                     //n->next=head1->next;
                                     //head2->prev=n;
                                     //head1->next=n;
                                     //n->prev=head1;
                                     break;
                  }
                  head1=head1->next;
      }
      return head;
}
node* split(node* head)
{
     node *head1=head,*hd;
     while(head1!=NULL)
     {
                      if(head1->next->k>100)
                      {
                                     hd=head1->next;
                                     head1->next=NULL;
                                     hd->prev=NULL;
                                     break;
                      }
                      head1=head1->next;
     }
     disp(head);
     disp(hd);
     return head;
}
void del_menu(node* head)
{
     int c;
     do
     {
         printf("\n\nPress 1 to delete the first node \nPress 2 to delete the last node \nPress 3 to delete a node at a desired location \nPress 4 to exit this menu\n\n");
         scanf("%d",&c);
         switch(c)
         {
                  case 1: head=del_frst(head);
                          break;
                  case 2: head=del_last(head);
                          break;
                  case 3: head=del_mid(head);
                          break;
                  case 4: menu(head);
                  default: printf("\nEnter from among the menu options!!!!!");
                           del_menu(head);
         }
     }while(true);
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
