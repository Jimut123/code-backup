#include"stdio.h"
#include"stdlib.h"
struct list
{
	int x;
	struct list * next;
};
typedef struct list node;
node * push(node*);
node * pop(node*);
void show(node*);
void main()
{
	int n;
	node * top;
	top=NULL;
	do
	{
		printf("\n press1 for push:");
	printf("\n press2 for pop:");
	printf("\n press3 for show:");
	printf("\n press4 for exit:");
	printf("enter your choice");
	scanf("%d",&n);
	switch(n)
	{
	case 1: top=push(top);
		break;
	case 2: top=pop(top);
		break;
	case 3: show(top);
		break;
	case 4:exit(0);
	}
	}while(1);
}

	node* push(node * top)
	{
		node* top2;
		top2=(node*)malloc(sizeof(node));
		printf("\n enter data:");
		scanf("%d",&top2->x);
		top2->next=top;
		top=top2;
		return top;
	}
	node* pop(node* top)

	{
		if(top==NULL)
			printf("\n Stack underflow....");
		printf("\n %d",top->x);
		top=top->next;return top;
	}
	void show(node* top)
	{
		node* top1;
		if(top==NULL)
			printf("\n Stack underflow....can't show");
		top1=top;
		while(top1 !=NULL)
		{
			printf("\n %d",top1->x);
			top1=top1->next;
		}
	}



