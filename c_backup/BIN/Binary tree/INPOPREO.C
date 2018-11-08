#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void show_inorder(node *);
void show_preorder(node *);
void show_postorder(node *);
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
printf("\nThe arrangement of elements in preorder way ::");
show_preorder(head);
//printf("\n");
printf("\nThe arrangement of elements in postorder way ::");
show_postorder(head);
//printf("\n");
printf("\nThe arrangement of elements in inorder way ::");
show_inorder(head);
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

void show_preorder(node *head)
{
if(head)
{
printf("  %d",head->x);
show_preorder(head->left);
show_preorder(head->right);
}
}

void show_inorder(node *head)
{
if(head)
{
show_inorder(head->left);
printf("  %d",head->x);

show_inorder(head->right);
}
}

void show_postorder(node *head)
{
if(head)
{
show_postorder(head->left);
show_postorder(head->right);
printf("  %d",head->x);
}
}
