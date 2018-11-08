#include<stdio.h>
struct list
{
int val;
int exp;
struct list *next;
};
typedef struct list node;
node * create_first_polynomial(node*);
//node * create_second_polynomial(node*);
void show(node *);
void main()
{
node *head,*head3;
head=(node*)malloc(sizeof(node*));
head3=(node*)malloc(sizeof(node*));
clrscr();
printf("\nEnter the first polynomial :");
create_first_polynomial(head);
create_first_polynomial(head3);
show(head);
printf("\n");
show(head3);
getch();
}
node *create_first_polynomial(node *head)
{
node * head1;
char ch;
head1=(node *)malloc(sizeof(node));
head1=head;
ch='y';
while(ch=='y'||ch=='Y')
{
printf("\nEnter the node ::");
printf("\nEnter the value :");
scanf("%d",&head1->val);
//printf("x");
printf("\nEnter the exponent :");
scanf("%d",&head1->exp);
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
printf("\t%d",head1->val);
printf("*x^");
printf("%d\t",head1->exp);
head1=head1->next;
}
}
