#include<stdio.h>
#include<stdlib.h>
#define array_size 10
int c=0;
void selection_sort(int);
int tree1[array_size];
int index[array_size];
int a[array_size];
struct tree
{
int x;
struct tree *left;
struct tree *right;
};
typedef struct tree node;
node *create(node *,int);
void lvl(node *,int);
void show(node *);
int main()
{
node *head=NULL;
int i,x,n,max,k1=0;
int q=-1;
//clrscr();
//printf("\nEnter no. of elements :");
scanf("%d",&n);

//printf("\n");
for(i=1;i<=n;i++)
{
scanf("%d",&x);
tree1[i-1]=k1++;
index[i-1]=x;
}
selection_sort(n);
q=-1;
for(i=0;i<n;i++)
{
if(index[i]==q)
head=create(head,tree1[i]);
//printf("index[i+1] = %d",index[i+1]);
LOOP :
if(index[i+1]>q)
{
q++;
if(index[i+1]>q)
goto LOOP;
}
}
show(head);
lvl(head,0);
max=a[0];
for(i=0;i<c;i++)
{
if(a[i]>max)
max=a[i];
//printf("\n%d",a[i]);
}
printf("%d",max+1);

return 0;
//getch();
}
void selection_sort(int n)
{
int i,t,j;
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(index[i]>index[j])
{
t=index[i];
index[i]=index[j];
index[j]=t;
t=tree1[i];
tree1[i]=tree1[j];
tree1[j]=t;
}
}
}
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
else if(x1>=head->x)
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
//printf("\n%d",head->x);
show(head->right);
}
}
void lvl(node *head,int level)
{
if(head)
{
lvl(head->left,level+1);
lvl(head->right,level+1);
if(head->left==NULL&&head->right==NULL)
{
//printf("\n%d",head->x);
a[c++]=level;
}
}
}