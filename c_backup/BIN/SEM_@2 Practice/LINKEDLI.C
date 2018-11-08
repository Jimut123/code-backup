/*************** SEM 2 PRACTICE ON ALL LINKED LIST PROGRAMS ****************/
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct list
{
int x;
struct list *next;
};
typedef struct list node;

node *create(node*);
node *insert_first(node*);
node *insert_last(node*);
void show(node*);
void main()
{
node *head=NULL;
int ch;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
printf("\nThe operations ::");
printf("\n1 to insert element at first :");
printf("\n2 to insert element at last :");
scanf("%d",&ch);
switch(ch)
{
case 1:
head=insert_first(head);
break;
case 2:
head=insert_last(head);
break;
default:printf("\nWrong choice...");
}
printf("\nThe resultant list :\n");
show(head);
getch();
}
node *create(node *head)
{
node *head1;
char ch='y';
head1=(node *)malloc(sizeof(node));
head1=head;
while(ch=='y'||ch=='Y')
{
if(ch=='y'||ch=='Y')
{
head1->next=(node *)malloc(sizeof(node));
printf("\nEnter the element of the node :");
scanf("%d",&head1->x);
}
head1=head1->next;
printf("\nEnter y/n to enter more no of nodes :");
scanf(" %c",&ch);
fflush(stdin);
}
head1->next=NULL;
return head;
}
void show(node *head)
{
node *head1;
head1=head;
while(head1->next)
{
printf("%d\n",head1->x);
head1=head1->next;
}
}
node *insert_first(node* head)
{
node *head1=head,*ins;
ins=(node *)malloc(sizeof(node));
printf("\nEnter the node to be inserted at the first ::");
scanf("%d",&ins->x);
ins->next=head1;
head=ins;
return head;
}
node *insert_last(node* head)
{
node *head1=head,*ins=NULL;
while(head1->next)
{
//printf("%d",head1->x);
head1=head1->next;
}
ins=(node *)malloc(sizeof(node));
printf("\nEnter the node to be inserted at the last ::");
scanf("%d",&ins->x);
head1->next=ins;
ins->next=NULL;
return head;
}