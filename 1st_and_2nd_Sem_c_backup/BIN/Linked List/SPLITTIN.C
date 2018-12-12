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
void display1(node *,node *,node *);
void split(node *,int);
int main()
{
node * head;
int n;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
printf("\nEnter the position to be splitted ::\n");
scanf("%d",&n);
split(head,n);
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
while(head1!=NULL)
{
printf("\n%d",head1->x);
head1=head1->next;
}
}
void split(node *head,int n)
{
node *head1,*head2;
int i=1;
head1=head;
while(head1)
{
i++;
if(i==n)
break;
head1=head1->next;
}
head2=head1->next;
head1->next=NULL;
display1(head2,head1,head);
}
void display1(node * head2,node * head1,node * head)
{
node *head3,*head4;
head3=head2;
head4=head;
while(head3!=NULL)
{
printf("\n%d",head3->x);
head3=head3->next;
}
printf("\n");
while(head4!=NULL)
{
printf("\n%d",head4->x);
head4=head4->next;
}
}
