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

void insert_pos(int k,int p)
{
	int c=1;
	node*x=(node*)malloc(sizeof(node)), *y;
	x->key=k;
	if(p==1)
	{
		x->next=head;
		head=x;
		return;
	}
	y=head;
	while(c!=(p-1))
	{
		y=y->next;
		c++;
	}
	x->next=y->next;
	y->next=x;
}

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
	head=head->next;
}

void delete_pos(int p)
{
	int i;
	node *y=head;
	if(p==1)
	{
		head=head->next;
		return;
	}
	for(i=1;i<p-1;i++)
	y=y->next;
	y->next=y->next->next;
}

void delete_last()
{
	node *y=head;
	while(y->next->next)
	y=y->next;
	y->next=NULL;
}

void display()
{
	node*y=head;
	while(y)
	{
		printf("%d \t",y->key);
		y=y->next;
	}
}

main()
{
	int n,p,c,x=1;
	clrscr();
	do
	{
		printf("\n 1-insert first\t 2-insert position\t 3-insert last\t 4-delete first\t 5-delete position\t 6-delete last\t 7-display\t any other key to exit \n?");
		scanf("%d",&c);
		switch(c)
		{
			case 1: printf("\n Enter element: ");
				scanf("%d",&n);
				insert_first(n);
				break;
			case 2: printf("\n Enter element: ");
				scanf("%d",&n);
				printf("\n Enter position: ");
				scanf("%d",&p);
				insert_pos(n,p);
				break;
			case 3: printf("\n Enter element: ");
				scanf("%d",&n);
				insert_last(n);
				break;
			case 4: delete_first();
				break;
			case 5: printf("\n Enter position: ");
				scanf("%d",&p);
				delete_pos(p);
				break;
			case 6: delete_last();
				break;
			case 7: display();
				break;
			default:x=0;
		}
	}while(x);
	getch();
	return 0;
}