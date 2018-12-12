#include<stdio.h>
//int c=0;
//int a[10];
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void lvl(node *,int,int);
void show(node *);
void main()
{
node *head=NULL;
int i,x,n,ns;
clrscr();
printf("\nEnter no. of elements :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
scanf("%d",&x);
head=create(head,x);
}
printf("\nEnter the number to be searched :");
scanf("%d",&ns);
printf("\nThe tree :");
show(head);
printf("\nLVL:");
lvl(head,0,ns);
//max=a[0];
/*for(i=0;i<c;i++)
{
if(a[i]>max)
max=a[i];
printf("\n%d",a[i]);
}
printf("\nmax = %d",max);
*/
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
void lvl(node *head,int level,int ns)
{
if(head)
{
lvl(head->left,level+1,ns);
lvl(head->right,level+1,ns);
/*if(head->left==NULL&&head->right==NULL)
{
//printf("\n%d",head->x);
a[c++]=level;
}  */
if(head->x==ns)
printf("%d is present at the %d level ",ns,level);
}
}