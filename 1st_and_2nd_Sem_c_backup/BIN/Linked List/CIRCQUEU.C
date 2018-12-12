#include<stdio.h>
#include<stdlib.h>
int c=0;
int d=0;
struct list
{
int x;
struct list * next;
};
typedef struct list node;
node * create(node *);
void show(node *);
node *del(node *);
int main()
{
node * head;
int n;
clrscr();
head=(node *)malloc(sizeof(node));
head->next=NULL;
while(1)
{
printf("\nEnter 1 to push :");
printf("\nEnter 2 to pop :");
printf("\nEnter 3 to display :");
printf("\nEnter 4 to exit :\n");
scanf("%d",&n);
switch(n)
{
case 1:
head=create(head);
break;
case 2:
head=del(head);
break;
case 3:
show(head);
break;
case 4:
exit(1);
break;
default:printf("Wrong choice..");
}
}
}
node * create(node *head)
{
node * head1,*head2,*head3;
c++;
if(c<5)
{
node * head1,*head2;
head2=(node *)malloc(sizeof(node));
head1=head;
while(head1->next!=NULL)
head1=head1->next;
printf("Enter the node ::");
scanf("%d",&head2->x);
head1->next=head2;
head2->next=NULL;
return head;
}
else
{
if(d>0)
{
head3=(node *)malloc(sizeof(node));
printf("Enter the node ::");
scanf("%d",&head3->x);
head3->next=head;
head=head3;
d--;
}
else
printf("Queue overflow ...");
}
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
node *del(node *head)
{
node *head1;
d++;
head1=head;
head=head->next;
free(head1);
return head;
}

