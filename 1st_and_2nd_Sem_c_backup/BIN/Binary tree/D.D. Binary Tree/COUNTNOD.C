#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
int count_node(node *);
int count_leaf(node *);
void show(node *);
int v=0;
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
printf("\nThe total no. of nodes = %d",count_node(head));
printf("\nThe total no. of leaf nodes = %d",count_leaf(head));
printf("\n The tree :");
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
int count_node(node *head)
{
if(head)
{
return 1+count_node(head->left)+count_node(head->right);
}
else
return 0;
}
int count_leaf(node *head)
{
if(head)
{
if(head->left==NULL&&head->right==NULL)
{
v++;
}
count_leaf(head->left);
count_leaf(head->right);
}
return v;
}