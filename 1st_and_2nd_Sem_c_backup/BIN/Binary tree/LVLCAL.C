#include<stdio.h>
int c=0;
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void lvl(node *);
void show(node *);
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
show(head);
lvl(head);
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
//printf("\nlvl = %d",++c);
printf("\n%d",head->x);
show(head->right);
}
}
void lvl(node *head)
{
while(head)
{
head=head->left;
printf("\nlvl = %d",++c);
}
return;
}