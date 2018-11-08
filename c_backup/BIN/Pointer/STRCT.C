#include<stdio.h>
#include<conio.h>
struct link
{
int x;
struct link *next;
};
typedef struct link l;
l* insert(l*);
void show(l*);
void main()
{
l* head;
head=(l*)malloc(sizeof(l));
head=insert(head);
show(head);
}
l* insert(l* head)
{
l* head1;
char ch;
head1= head;
ch='y';
while(ch=='y'||ch=='Y')
{
scanf("%d",&head1->x);
printf("\n Enter Head ::");
scanf("%c",&ch);
if(ch=='y'||ch=='y')
{
head1->next=(l*)malloc(sizeof(l));
head1=head1->next;
}
}
head1->next=NULL;
return head;
}
void show(l *head)
{
l* head1;
head1= head;
while(head1)
{
printf("\n %d",head1->x);
head1=head1->next;
}
}