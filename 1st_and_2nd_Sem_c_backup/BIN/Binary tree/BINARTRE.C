#include<stdio.h>
struct tree
{
int k;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
void show(node *T);
node *create_Binary_tree(node *,int);
void main()
{
node *root;
int choice=1,n;
while(choice)
{
printf("\nEnter elements :");
scanf("%d",&n);
create_Binary_tree(root,n);
printf("\nEnter 1 to continue or 0 to discontinue :");
scanf("%d",&choice);
}
show(root);
}
node *create_Binary_tree(node *T,int x)
{
if(T==NULL)
{
T=(node *)malloc(sizeof(node));
T->k=x;
T->left=NULL;
T->right=NULL;
return T;
}
else
if(x>T->k)
return (create_Binary_tree(T->right,x));
else
return (create_Binary_tree(T->left,x));
}
void show(node *T)
{
if(T==NULL)
return;
else
{
show(T->left);
printf("\n%d",T->k);
show(T->right);
}
}