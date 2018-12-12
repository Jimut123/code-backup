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
node * insertb(node *);
node * inserte(node *);
node * insertm(node *);
node * deleteb(node *);
node * deletee(node *);
node * deletem(node *);
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
printf("\nEnter 2 to insert an element at the end ::");
printf("\nEnter 3 to insert an element at a desired position ::");
printf("\nEnter 4 to delete an element at the beginning ::");
printf("\nEnter 5 to delete an element at the end ::");
printf("\nEnter 6 to delete an element at a desired position ::");
scanf("%d",&n);
switch(n)
{
case 1:
head=insertb(head);
break;
case 2:
head=inserte(head);
break;
case 3:
head=insertm(head);
break;
case 4:
head=deleteb(head);
break;
case 5:
head=deletee(head);
break;
case 6:
head=deletem(head);
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
node* insertb(node *head)
{
node *head1;
head1=(node *)malloc(sizeof(node));
head1->prev=NULL;
printf("\nEnter the element :");
scanf("%d",&head1->x);
head1->next=head;
head->prev=head1;
//head=head1;
return head1;
}
node* inserte(node *head)
{
node *head1,*head2;
head1=(node *)malloc(sizeof(node));
head2=head;
while(head2->next!=NULL)
{
head2=head2->next;
}
printf("\nEnter the element :");
scanf("%d",&head1->x);
head2->next=head1;
head1->prev=head2;
head1->next=NULL;
return head;
}
node * insertm(node *head)
{
node *head1,*head2,*head3;
int n;
head2=head;
head1=(node *)malloc(sizeof(node));
printf("\nEnter the position :");
scanf("%d",&n);
n--;
while(n--)
{
head2=head2->next;
}
head3=head2->next;
printf("\nEnter the node ::");
scanf("%d",&head1->x);
head2->next=head1;
head1->prev=head2;
head3->prev=head1;
head1->next=head3;
return head;
}
node * deleteb(node *head)
{
node *head1;
head1=head;
head=head->next;
free(head1);
head1->next=NULL;
head->prev=NULL;
return head;
}
node * deletee(node *head)
{
node *head2,*head1;
head1=head;
while(head1->next)
{
head2=head1;
head1=head1->next;
}
free(head1);
head1->next=NULL;
head2->next=NULL;
return head;
}
node * deletem(node *head)
{
int n;
node *head1,*head2,*head3,*head4;
head1=head;
printf("\nEnter the position where you want to delete ::");
scanf("%d",&n);
while(n--)
{
head2=head1;
head1=head1->next;
}
head3=head1->next;
head2->next=head3;
head3->prev=head2;
free(head1);
head1->next=NULL;
return head;
}