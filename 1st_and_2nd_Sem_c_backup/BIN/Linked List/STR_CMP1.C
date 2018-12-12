#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct list
{
char x[100];
struct list * next;
};
typedef struct list node;
node * create(node *);
void show(node *);
int find(node *,char s[100]);
int main()
{
node * head;
int y;
char s[100];
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
show(head);
fflush(stdin);
printf("Enter the string to be searched ::");
gets(s);
fflush(stdin);
y=find(head,s);
printf("\nThe output :: %d",y);
fflush(stdin);
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
fflush(stdin);
printf("Enter the node ::");
gets(head1->x);

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
puts(head1->x);
head1=head1->next;
}
}
int find(node *head,char str[100])
{
node * head1;
head1=head;
while(head1)
{
if(stricmp(head1->x,str)==0)
return 1;
head1=head1->next;
}
return -1;
}