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
int c=0,i,j;
node *head1;
head1=head;
while(head1)
{
c++;
head1=head1->next;
}
head1=head;
for(i=c;i>=1;i--)
{
j=1;
while(j++)
{
if(j>i)
break;
head1=head1->next;
}
printf("\n%d",head1->x);
head1=head;
}
}


