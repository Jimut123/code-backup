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
int main()
{
node * head;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
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
create_rec(head1,ch);
return head;
}
create_rec(node *head1,char ch)
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
else
{
head1->next=NULL;
return;
}
create_rec(head1,ch);
return;
}
void show(node *head)
{
node *head1;
head1=head;
show_rec(head1);

}
show_rec(node *head1)
{
if(head1==NULL)
return;
printf("\n%d",head1->x);
head1=head1->next;
show_rec(head1);
return;
}

