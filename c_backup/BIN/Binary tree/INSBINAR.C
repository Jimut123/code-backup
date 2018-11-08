#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void find_target(node *,node *,node *);
void show(node *);
void main()
{
node *head=NULL,*t,*n;
int i,x,no,num;
clrscr();
printf("\nEnter no. of elements :");
scanf("%d",&no);
for(i=1;i<=no;i++)
{
scanf("%d",&x);
head=create(head,x);
}
printf("\nThe original Binary tree :");
show(head);
printf("\nEnter the target node :");
scanf("%d",&t->x);
printf("\nEnter the new node to be inserted :");
scanf("%d",&n->x);
find_target(head,t,n);
printf("\nThe newly created binary tree :");
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
head->right=create(head->right,x1);
}
else
head->left=create(head->left,x1);
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
void find_target(node *head,node *target,node *n)
{
node *str;
if(head)
{
//if(target->x>head->x)
find_target(head->left,target,n);
//if(target->x<head->x)
find_target(head->right,target,n);
if(target->x==head->x)
{
printf("found");
if(head->x<target->x)
{
str=head->right;
head->right=n;
if(n->x<str->x)
{
n->right=str;
}
else
n->left=str;
}
else
{
str=head->left;
head->left=n;
if(target->x<str->x)
{
n->right=str;
}
else
n->left=str;
}
return ;
}

}

}
