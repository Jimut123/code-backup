#include<stdio.h>
typedef struct list
{
int key;
struct list *prev,*next;
}NODE;
NODE *head=NULL;
void insert(int)
void insert(int k)
{
NODE * x = (NODE *)malloc(sizeof(NODE)),*y=head;
x->key=k;
x->next=NULL;
if(!head)
{
x->prev=NULL;
head=x;
return;
}
while(y->next)
y=y->next;
y->next=x;
x->prev=y;
}