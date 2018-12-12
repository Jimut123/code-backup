#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
node *create_original(node *,int);
void show(node *);
void main()
{
node *head=NULL,*head1=NULL;
int i,x,n;
clrscr();
printf("\nEnter no. of elements :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
scanf("%d",&x);
head=create(head,x);
head1=create_original(head1,x);
}
printf("\nThe original Tree :");
show(head1);
printf("\nThe new Tree :");
show(head);
getch();
}
node *create(node *head,int x1)
{
if(head==NULL)
{
head=(node *)malloc(sizeof(node));
head->x=x1;
head->left=NULL;
head->right=NULL;
}
else if(x1>head->x)
{
head->left=create(head->left,x1);
}
else
head->right=create(head->right,x1);
return head;
}
node *create_original(node *head,int x1)
{
if(head==NULL)
{
head=(node *)malloc(sizeof(node));
head->x=x1;
head->left=NULL;
head->right=NULL;
}
else if(x1>head->x)
{
head->right=create_original(head->right,x1);
}
else
head->left=create_original(head->left,x1);
return head;
}
void show(node *head)
{
if(head)
{
show(head->left);
printf("\n%d",head->x);
show(head->right);
}
}