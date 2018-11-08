#include<stdio.h>
#include<stdlib.h>
struct list
{
int x;
struct list * point;
struct list * next;
};
typedef struct list node;
node * create(node *);
void show(node *);
void calculate(node *);
int main()
{
node * head;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
calculate(head);
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
head1->next=NULL;
return head;
}
void calculate(node *head)
{
int i,v;
node *head1;
head1=head;
while(head1->next!=NULL)
{
v=head1->x;
for(i=2;i<v;i++)
{
if(v%i==0)
{
v=v/i;
create();
}
}
}
}
void show(node *head)
{
node *head1;
head1=head;
while(head1!=NULL)
{
printf("\n%d",head1->x);
head1=head1->next;
}
}

