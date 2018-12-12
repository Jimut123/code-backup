#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void show(node *);
void delete_node(node *,node *);
void main()
{
node *head=NULL,*target;
int i,x,n;
clrscr();
printf("\nEnter no. of elements :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
scanf("%d",&x);
head=create(head,x);
}
printf("\nEnter the target :");
scanf("%d",&target->x);
printf("\nThe original binary tree :");
show(head);
delete_node(head,target);
printf("\nThe new binary tree :");
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


void delete_node(node *head,node *target)
{
node *str1,*str2;
if(target->x==head->left->x)
{
printf("\nhead left ");
str1=head->left->left;
str2=head->left->right;
free(head->left);
if(head->x>str1->x)
{
head->left=str1;
while(head->left)
{
head=head->left;
}
if(head->x>str2->x)
head->left=str2;
else
head->right=str2;
return;
}
else
{
head->right=str1;
while(head->right)
{
head=head->right;
}
if(head->x>str2->x)
head->left=str2;
else
head->right=str2;
return;
}
}
if(target->x==head->right->x)
{
printf("\nhead right ");
str1=head->right->left;
str2=head->right->right;
free(head->right);
if(head->x>str1->x)
{
head->left=str1;
while(head->left)
{
head=head->left;
}
if(head->x>str2->x)
head->left=str2;
else
head->right=str2;
return;
}
else
{
head->right=str1;
while(head->right)
{
head=head->right;
}
if(head->x>str2->x)
head->left=str2;
else
head->right=str2;
return;
}
}
delete_node(head->left,target);
delete_node(head->right,target);
}