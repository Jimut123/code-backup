#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void show_left(node *);
void show_right(node *);
void main()
{
node *head=NULL;
int i,x,n;
clrscr();
printf("\nEnter no. of elements :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
scanf("%d",&x);
head=create(head,x);
}
printf("\nLeft nodes :");
show_left(head);
printf("\nRight nodes :");
show_right(head);
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
void show_left(node *head)
{
if(head)
{
if(head->left)
printf("  %d",head->left->x);
show_left(head->left);
show_left(head->right);
}
}
void show_right(node *head)
{
if(head)
{
if(head->right)
printf("  %d",head->right->x);
show_right(head->right);
show_right(head->left);
}
}
