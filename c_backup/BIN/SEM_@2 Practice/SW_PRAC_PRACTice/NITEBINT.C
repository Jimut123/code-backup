#include<stdio.h>
struct list
{
int x;
struct list *left;
struct list *right;
};
typedef struct list node;
node *create(node *);
void show(node *);
void main()
{
int n,i,m;
node *head=NULL;
printf("\nEnter the number of elements :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
head=create(head);
printf("\nSent to create...");
}
show(head);
}
node *create(node *head)
{
node *head1,*head2=head,*head3;
if(head==NULL)
{
head1=(node *)malloc(sizeof(node));
printf("\nEnter the node :");
scanf("%d",&head1->x);
head1->left=NULL;
head1->right=NULL;
printf("\nHead created.... %d done",head1->x);
return head1;
}
else
{
head1=(node *)malloc(sizeof(node));
printf("\nEnter the node :");
scanf("%d",&head1->x);
head1->left=NULL;
head1->right=NULL;
if(head->x>head1->x)
{
printf("\n%d is greater than %d",head->x,head1->x);
while(head->x>head1->x)
{
head3=head;
head=head->left;
printf("\n%d is greater than %d",head->x,head1->x);
}
head3->left=head1;
}
else
{
printf("\n%d is less than %d",head->x,head1->x);
while(head->x<head1->x)
{
head3=head;
head=head->right;
printf("\n%d is less than %d",head->x,head1->x);
}
head3->right=head1;
}
}
return head2;
}
void show(node *head)
{
if(head->left)
{
show(head->left);
printf("%d",head->x);
show(head->right);
}//
}