#include<stdio.h>
#include<stdlib.h>
struct list
{
int x;
struct list * next;
};
typedef struct list node;
node * create(node *);
node * calculating(node *);
void show(node *);
int armstrong(int);
int prime(int);
int krishnamurti(int);
int main()
{
node * head;
clrscr();
head=(node *)malloc(sizeof(node));
head=create(head);
printf("\nThe original list :");
show(head);
calculating(head);
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
node * calculating(node *head)
{
node *head1,*head2,*arms,*prims,*krs;
int m,arm,prim,kr;
head1=head;
while(head1->next!=NULL)
{
m=head1;
arms=(node *)malloc(sizeof(node));
prims=(node *)malloc(sizeof(node));
krs=(node *)malloc(sizeof(node));
arm=armstrong(m);
kr=krishnamurti(m);
prim=prime(m);
if(arm==1)
{

}
head1=head1->next;
}
}
int armstrong(int m)
{
int d,k,ar=0;
k=m;
while(k!=0)
{
d=k%10;
ar=ar+d*d*d;
k=k/10;
}
if(ar==m)
return 1;
return -1;
}