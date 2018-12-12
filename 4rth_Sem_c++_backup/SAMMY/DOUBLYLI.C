#include<stdio.h>
typedef struct list
{
	int key;
	struct list *pre,*next;
}node;
node*head=null;

void insert_first(int k)
{
	node*x=(node*)malloc(sizeof(ode));
	x->key=k;
	x->pre=x->next=null;
	if(!head)
	{
		head=x;
		return;
	}
	x->next=head;
	head->pre=x;
	head=x;
}

void insert_pos(int k,int p)
{
	node*x=(node*)malloc(sizeof(node)),*y=head;
	int i;
	x->key=k;
	if(p==1)
	{
		x->next=head;
		x->pre=null;
		head->pre=x;
		head=x;
		return;
	}
	for(i=1;i<p-1;i++)
	y=y->next;
	x->next=y->next;
	x->pre=y;
	y->next->pre=x;
	y->next=x;
}

void insert_last(int k)
{
	node*x=(node*)malloc(sizeof(node)),*y=head;
	x->key=k;
	x->next=x->pre=null;
	if(!head)
	{
		head=x;
		return;
	}
	while(y->next)
	y=y->next;
	y->next=x;
	x->pre=y;
}

void display_front()
{
	node*y=head;
	while(y)
	{
		printf("\t %d",y->key);
		y=y->next;
	}
}

void display_rear()
{
	node*y=head;
	while(y)
	y=y->next;
	while(y!=head)
	{
		printf("\t %d",y->key);
		y=y->pre;
	}
}
void main()