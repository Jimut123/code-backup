/*
***0013***
Circular Queue. (Using Array)
*/

#include<stdio.h>
#include<conio.h>
#define MAX 3

int a[MAX],head=0,p=0,count=0;

void main()
{
	void insert(int);
	void del();
	void display();
	int choice,key,val;

	clrscr();

	do
	{
		printf("\nCHOICES ::");
		printf("\n  1 :: To insert a node");
		printf("\n  2 :: To delete a nope");
		printf("\n  3 :: To display the queue");
		printf("\n  4 :: To exit");
		printf("\nINPUT ::");
		scanf("%d", &choice);
		switch(choice)
		{
			case 1:
				printf("\nEnter the key value :: ");
				scanf("%d", &key);
				insert(key);
				break;
			case 2:
				del();
				break;
			case 3:
				display();
				break;
			case 4:
				exit(4);
			default:
				printf("\n***INVALID CHOICE***");
		}
	}while(choice!=4);
	getch();
	return;
}

void insert(int k)
{
	if(count==MAX)
	{
		printf("\n***QUEUE IS FULL***");
		return;
	}
	a[p]=k; count++;
	p=(p+1)%MAX;
}

void del()
{
	int popped;
	if(count==0)
	{
		printf("\n***QUEUE IS EMPTY***");
		return;
	}
	popped=a[head];
	printf("\n'%d' has been popped just now.\n", popped);
	head=(head+1)%MAX;
	count--;
}

void display()
{
	int i=head;
	do
	{
		printf("%d ",a[i]);
		i=(i+1)%MAX;
	}while(i!=p);
}