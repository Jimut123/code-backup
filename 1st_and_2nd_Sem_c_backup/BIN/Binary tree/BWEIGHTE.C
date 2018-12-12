#include<stdio.h>
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int,char);
void show(node *);
void main()
{
node *head=NULL;
int i,x,n,v=6;
char c='\0';
clrscr();
printf("\nEnter no. of elements :");
scanf("%d",&n);
for(i=1;i<n;i++)
{
if(v==6)
{
scanf("%d",&x);
head=create(head,x,c);
v=1;
}
printf("\nEnter the element : ");
scanf("%d",&x);
fflush(stdin);
printf("\nWant to enter in left or right?(l/r) :");
scanf(" %c",&c);
head=create(head,x,c);
}
show(head);
getch();
}
node *create(node *head,int x1,char choice)
{
if(head==NULL)
{
head=(node *)malloc(sizeof(node));
head->x=x1;
head->left=NULL;
head->right=NULL;
}
if(choice=='r'&&head->right!=NULL)
head->right=create(head->right,x1,choice);

if(choice=='l'&&head->left!=NULL)
head->left=create(head->left,x1,choice);
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