#include<stdio.h>
#include<stdlib.h>
struct list
{
int x;
struct list * next;
};
typedef struct list node;
node * create(node *);
void show(node *);
node *sort(node *);
int main()
{
node * head;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
head=sort(head);
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
void show(node *head)
{
node *head1;
head1=head;
printf("\n");
while(head1!=NULL)
{
printf("%d\t",head1->x);
head1=head1->next;
}
printf("\n");
}
node * sort(node *head)
{
node *head1,*head2;
int t;
for(head1=head;head1->next!=NULL;head1=head1->next)
{
for(head2=head1->next;head2!=NULL;head2=head2->next)
{
if(head1->x>head2->x)
{
t=head1->x;
head1->x=head2->x;
head2->x=t;
}
}
}
return head;
}

