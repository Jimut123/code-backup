/*
***0012***
Circular Queue. (Using linked list)
*/

#include<stdio.h>
#include<conio.h>

typedef struct list
{
	int key;
	struct list *next;
}NODE;

NODE *head;
/*
int main()
{

}
*/
void push(int k)
{
	NODE *r=(NODE*)malloc(sizeof(NODE)), *x=head;
	r->key=k; r->next=NULL;
	if(head==NULL)
	{
		head=r;
		r->next=head;
		return;
	}
	while(x->next!=head)
		x=x->next;
	x->next=r; r->next=head;
}

int pop()
{
	NODE *x=head;
	int k;
	if(head->key==NULL)
	{
		printf("\n***THE QUEUE IS EMPTY***");
		return;
	}
	k=head->key;

}

