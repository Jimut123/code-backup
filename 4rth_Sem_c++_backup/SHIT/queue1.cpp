#include"stdio.h"
#include"stdlib.h"
struct list
{
	int x;
	struct list * next;
};
typedef struct list node;
node* insert(node*);
node* del(node*);
void show(node*,node*);
node * front,*rear;

void main()
{
	int n;
	
	node*p;
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
	case 1: if(front==NULL)
			{
                front=(node*)malloc(sizeof(node));
                scanf("%d",&front->x);
				front->next=NULL;
				rear=(node*)malloc(sizeof(node));
				rear->x=front->x;
				rear->next=NULL;
				   p=rear;
			}
		    else
			
			{

              
				p->next=(node*)malloc(sizeof(node));
                p=p->next;
				p=insert(p);
			}

		    
		break;
	case 2: front=del(front);
		    rear=rear->next;
		    front=rear; 
		break;
	case 3: show(front,rear);
		break;
	case 4:exit(0);
	}
	}while(1);
}

	node* insert(node * p)
	{ 
		
			
		    printf("\n enter data:");
		    scanf("%d",&p->x);
            p->next=NULL;
			return p;
			
		
	}
	node* del(node* front)

	{
		if(front==NULL)
		{
			printf("\n Queue underflow....");
			return front;
		}
		printf("\n %d",front->x);
		front=front->next;
		return front;
	}
	void show(node* front,node* rear)
	{
		
		if(front==NULL)
		{
			printf("\n Queue underflow....can't show");
			return ;
		}
		printf("\n %d",front->x);

		rear=rear->next;
		while(rear !=NULL)
		{
			printf("\n %d",rear->x);
			rear=rear->next;
		}
		rear=front;
	}


	
	