#include<stdio.h>
typedef struct List
{
	int key;
	struct List *next;
}node;
node*head=NULL;

void insert_first(int k)
{
	node*x=(node*)malloc(sizeof(node));
	x->key=k;
	x->next=head;
	head=x;
}

void delete_first()
{
	if(!head)
	printf("\n Stack UNderflow");
	head=head->next;
}

void display()
{
	node*y=head;
	if(!head)
	printf("\n Stack UNderflow");
	while(y)
	{
		printf("\n%d",y->key);
		y=y->next;
	}
}

main()
{
	int n,c,x=1;
	clrscr();
	do
	{
		printf("\n 1-push\t 2-pop\t 3-display\t any other key to exit \n?");
		scanf("%d",&c);
		switch(c)
		{
			case 1: printf("\n Enter element: ");
				scanf("%d",&n);
				insert_first(n);
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