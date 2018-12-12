#include<stdio.h>
typedef struct List
{
	int key;
	struct List *next;
}node;
node*head=NULL;

void insert_last(int k)
{
	node*x=(node*)malloc(sizeof(node)), *y;
	x->key=k;
	x->next=NULL;
	if(!head)
	{
		head=x;
		return;
	}
	y=head;
	while(y->next)
	y=y->next;
	y->next=x;
}

void delete_first()
{
	if(!head)
	printf("\n QUeue empty");
	head=head->next;
}

void display()
{
	node*y=head;
	if(!head)
	printf("\n Queue empty");
	while(y)
	{
		printf("%d \t",y->key);
		y=y->next;
	}
}

main()
{
	int n,c,x=1;
	clrscr();
	do
	{
		printf("\n 1-insert\t 2-delete\t 3-display\t any other key to exit \n?");
		scanf("%d",&c);
		switch(c)
		{
			case 1: printf("\n Enter element: ");
				scanf("%d",&n);
				insert_last(n);
				break;
			case 2: delete_first();
				break;
			case 3: display();
				break;
			default:x=0;
		}
	}while(x);
	getch();
	return 0;
}