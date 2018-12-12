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
node *del(node *);
node *del_rear(node *);
node *create_r(node *);
int main()
{
node * head;
int n;
clrscr();
head=(node *)malloc(sizeof(node));
head->next =NULL;
while(1)
{
printf("\nEnter 1 to push from front :");
printf("\nEnter 2 to pop from front:");
printf("\nEnter 3 to display :");
printf("\nEnter 4 to exit :");
printf("\nEnter 5 to pop from rear :");
printf("\nEnter 6 to push from rear :\n");
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
case 5:
head=del_rear(head);
break;
case 6:
head=create_r(head);
break;
default:printf("Wrong choice..");
}
}
}
node * create(node *head)
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
head1=head;
head=head->next;
free(head1);
return head;
}
node *del_rear(node *head)
{
node *head1,*head2;
head1=head;
while(head1->next)
{
head2=head1;
head1=head1->next;
}
free(head1);
head2->next=NULL;
return head;
}
node *create_r(node *head)
{
node *head2;
head2=(node *)malloc(sizeof(node));
printf("Enter the node ::");
scanf("%d",&head2->x);
head2->next=head;
head=head2;
return head;
}