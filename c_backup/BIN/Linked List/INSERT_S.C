#include<stdio.h>
#include<stdlib.h>
struct list
{
int x;
struct list * next;
};
typedef struct list node;
node * create(node *);
node * insert(node *);
node * insertm(node *);
node * deleteb(node *);
node * deletem(node *);
node * deletee(node *);
node * inserte(node *);
void show(node *);
int main()
{
int n,j;
node * head;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
printf("\n1 to Enter the node to be inserted at the beggining ::");
printf("\n2 to Enter the node to be inserted at the desired position ::");
printf("\n3 to Enter the node to be inserted at the last ::");
printf("\n4 to Delete the node at the begining ::");
printf("\n5 to Delete the node at the desired position ::");
printf("\n6 to Delete the node at the end ::");
scanf("%d",&j);
switch(j)
{
case 1:
head=insert(head);
break;
case 2:
head=insertm(head);
break;
case 3:
head=inserte(head);
break;
case 4:
head=deleteb(head);
break;
case 5:
head=deletem(head);
break;
case 6:
head=deletee(head);
break;
default: printf("Wrong choice..");
}
show(head);
getch();
return 0;
}
node * deleteb(node *head)
{
node *head1;
head1=head->next;
free(head);
head=NULL;
return head1;
}
node * deletee(node *head)
{
node *head1;
head1=head;
while(head1->next->next)
head1=head1->next;
head1->next=NULL;
return head;
}
node * deletem(node *head)
{
int m;
node *head1,*y,*s;
head1=head;
printf("\nEnter the position ::");
scanf("%d",&m);
while(m--)
{
y=head1;
head1=head1->next;
}
s=head1->next;
head1=NULL;
y->next=s;
return head;
}
node * insertm(node *head)
{
int d;
node * head1,*head2,*y;
head2=(node *)malloc(sizeof(node));
head1=head;
printf("Enter the node ::");
scanf("%d",&head2->x);
printf("Enter the position :");
scanf("%d",&d);
d--;
while(d--)
head1=head1->next;
y=head1->next;
head1->next=head2;
head2->next=y;
return head;
}
node * inserte(node *head)
{
node * head1,*head2,*y;
head2=(node *)malloc(sizeof(node));
head1=head;
printf("Enter the node ::");
scanf("%d",&head2->x);
while(head1->next)
head1=head1->next;
head1->next=head2;
head2->next=NULL;
return head;
}
node * insert(node *head)
{
node * head1;
head1=(node *)malloc(sizeof(node));
//head1=head;
printf("\nEnter the node ::");
scanf("%d",&head1->x);
head1->next=head;
head=head1;
return head;
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

