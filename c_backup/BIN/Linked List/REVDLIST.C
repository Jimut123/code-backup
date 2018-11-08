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
void show(node *);
void revshow(node *);
void main()
{
node *head;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
revshow(head
);
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
void revshow(node *head)
{
node *head1;
head1=head;
printf("\nPrevious list:");
while(head1->next!=NULL)
{
head1=head1->next;
}
printf("\n");
while(head1->prev!=NULL)
{
printf("%d\n",head1->x);
head1=head1->prev;
}
printf("%d\n",head1->x);
}