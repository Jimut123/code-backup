#include<stdio.h>
typedef struct Binary
{
int key;
struct Binary *left,*right;
}NODE;
NODE *root=NULL;
int top=-1;
int arr[50];
void inorder();
int pop(void);
void push(int);
void create(int);
void main()
{
int n,i,d;
printf("\nEnter the total no. of nodes :");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&d);
create(d);
}
inorder();
}
void create(int k)
{
NODE *x=(NODE *)malloc(sizeof(NODE)),*r1=root,*r2;
int ch;
x->key=k;
x->left=x->right=NULL;
if(!root)
{
root=x;
return;
}
while(r1)
{
r2=r1;
printf("%d will be placed at the left subtree or right subtree of %d(1/0):",k,r1->key);
scanf("%d",&ch);
if(ch)
r1=r1->left;
else
r1=r1->right;
}
if(ch)
r2->left=x;
else
r2->right=x;
}
void inorder()
{
NODE *r=root;
do
{
while(r)
{
push(r->key);
r=r->left;
}
r->key=pop();
printf("%d\t",r->key);
r=r->right;
}while(r||top!=-1);
}
void push(int r)
{
arr[top++]=r;
}
int pop()
{
return arr[top--];
}