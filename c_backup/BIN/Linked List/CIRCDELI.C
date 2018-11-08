#include<stdio.h>
#include<stdlib.h>
struct list
{
int x;
struct list * next;
};
typedef struct list node;
node * create(node *);
node *insertfront(node *);
node *insertrear(node *);
void show(node *);
node *deleterear(node *);
node *deletelast(node *);
int main()
{
node * head,*y;
int ch;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
y=head;
printf("\nEnter 1 to insert at front :");
printf("\nEnter 2 to insert at rear :");
printf("\nEnter 3 to delete at front :");
printf("\nEnter 4 to delete at rear :");
scanf("%d",&ch);
printf("\n original list ::");
show(head);
switch(ch)
{
case 1:
head=insertfront(y);
break;
case 2:
head=insertrear(y);
break;
case 3:
head=deleterear(y);
break;
case 4:
head=deletelast(y);
break;
default:printf("Wrong choice !!!");
}
printf("\n new list ::");
show(head);
getch();
return 0;
}
node * create(node *head)
{
node * head1;
char ch;
head1=(node *)malloc(sizeof(node));
head1=head;
ch='y';
while(ch=='y'||ch=='Y')
{
printf("Enter the node ::");
scanf("%d",&head1->x);
fflush(stdin);
printf("\n Enter a node:(y/n) : ");
scanf("%c",&ch);
if(ch=='Y'||ch=='y')
{
head1->next=(node *)malloc(sizeof(node));
head1=head1->next;
}
}
head1->next=head;
return head;
}
void show(node *head)
{
node *head1;
head1=head;
printf("\n%d",head1->x);
head1=head1->next;
while(head1!=head)
{
printf("\n%d",head1->x);
head1=head1->next;
}
}
node *insertfront(node *head)
{
node *head1,*head2;
head1=(node *)malloc(sizeof(node));
printf("\nEnter a node :");
scanf("%d",&head1->x);
head1->next=head;
head2=head;
head2=head2->next;
while(head2->next!=head)
{
head2=head2->next;
}
head2->next=head1;
head=head1;
return head;
}
node *insertrear(node *head)
{
node *head1,*head2;
head1=(node *)malloc(sizeof(node));
printf("\nEnter a node :");
scanf("%d",&head1->x);
head2=head;
head2=head2->next;
while(head2->next!=head)
{
head2=head2->next;
}
head2->next=head1;
head1->next=head;
return head;
}
node *deleterear(node *head)
{
node *head1,*y;
y=head1=head->next;
while(head1->next!=head)
head1=head1->next;
head1->next=y;
head->next=NULL;
free(head);
head=y;
return head;
}
node *deletelast(node *head)
{
node *head1,*y,*h;
y=head1=head;
head1=head1->next;
while(head1->next!=head)
{
h=head1;
head1=head1->next;
}
h->next=y;
head1->next=NULL;
free(head1);
return head;
}