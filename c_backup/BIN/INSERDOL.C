#include<stdio.h>
#include<conio.h>
struct doublelist
{
int x;
struct doublelist *next;
struct doublelist *prev;
};
typedef struct doublelist node;
node * create(node *);
void * insertb(node *);
void show(node *);
void main()
{
node *head;
int n;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
printf("\nEnter your choice ::");
printf("\nEnter 1 to insert an element at the beggining ::");
scanf("%d",&n);
switch(n)
{
case 1:
insertb(head);
break;
default:printf("Wrong Choice...");
}
show(head);
getch();
}
node *create(node *head)
{
node *head1;
char ch;
ch='y';
head1=(node *)malloc(sizeof(node));
head1=head;
head1->prev=NULL;
while(ch=='y'||ch=='Y')
{
scanf("%d",&head1->x);
fflush(stdin);
puts("\n Enter a node :(y/n)::");
scanf("%c",&ch);
if(ch=='y'||ch=='Y')
{
head1->next=(node *)malloc(sizeof(node));
head1->next->prev=head1;
head1=head1->next;
}
}
head1->next=NULL;
return head;
}

void show(node *head)
{
node *head1;
head1=head;
printf("\n next ");
while(head1->next!=NULL)
{
printf("\n%d",head1->x);
head1=head1->next;
}
printf("\n%d",head1->x);
//head1=head1->prev;
printf("\n list previous ");
while(head1->prev!=NULL)
{
printf("\n%d",head1->x);
head1=head1->prev;
}
printf("\n%d",head1->x);
}
void * insertb(node *head)
{
node *head1;
printf("\nEnter the element :");
scanf("%d",&head1->x);
head->prev=head1;
head1->next=head;
head1->prev=NULL;
return head1;
}