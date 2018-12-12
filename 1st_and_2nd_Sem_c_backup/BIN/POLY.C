#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
	int x;
	int exp;
	struct list *next;
};
typedef struct list node;
node  *create_poly(node *);
void show_poly(node *);
node *create_result(node*,node*,node*);
int main()
{
	node *poly1,*poly2,*poly3;
	poly1=(node*)malloc(sizeof(node));
	poly2=(node*)malloc(sizeof(node));
	poly3=(node*)malloc(sizeof(node));
	clrscr();
	printf("\nEnter the first polynomial ::");
	poly1=create_poly(poly1);
	//printf("\n poly =",poly1->x);
	fflush(stdin);
	show_poly(poly1);
	printf("\nEnter the second polynomial ::");
	poly2=create_poly(poly2);
	//printf("\n poly =",poly2->x);
	fflush(stdin);
	show_poly(poly2);
	printf("\nThe resultant polynomial ::");
	poly3=create_result(poly3,poly1,poly2);
	show_poly(poly3);
	getch();
	return 0;
}
node *create_poly(node *head)
{
	node *head1=(node*)malloc(sizeof(node));
	char c='y';
	head1=head;
	while(c=='y')
	{
		printf("\nEnter the node of the ploynomial :");
		printf("\nEnter the value :");
		scanf("%d",&head1->x);
		fflush(stdin);
		printf("\nEnter the exponent :");
		scanf("%d",&head1->exp);
		fflush(stdin);
		printf("\nEnter more node ? (y/n)");
		scanf(" %c",&c);
		fflush(stdin);
		if(c=='y'||c=='Y')
		{
		head1->next=(node*)malloc(sizeof(node));
		head1=head1->next;
		}

	}
	head1->next=NULL;
	return head;
}

void show_poly(node *head)
{
	node *head1;
	head1=head;
	while(head1)
	{
		printf("value = %d ",head1->x);
		printf("and exp = %d",head1->exp);
		printf("\t");
		head1=head1->next;
	}
}

node *create_result(node *poly3,node *x,node *y)
{
	int a,b;
	node *head1=x,*head2=y;
	node *head3=(node*)malloc(sizeof(node));
	head3=poly3;
	while(head1!=NULL||head2!=NULL)
	{
	if(head1->exp==head2->exp)
	{
		a=head1->x;b=head2->x;
		head3->x=a+b;
		head3->exp=head1->exp;
		printf("%d kslolp",head3->x);
		head1=head1->next;
		head2=head2->next;
	}
	if(head1->exp>head2->exp)
	{
		head3->x=head1->x;
		head3->exp=head1->exp;
		head1=head1->next;
	}
	if(head2->exp>head1->exp)
	{
		head3->x=head2->x;
		head3->exp=head2->exp;
		head2=head2->next;
	}
	if(head1!=NULL&&head2!=NULL)
	{
		head3->next=(node*)malloc(sizeof(node));
		head3=head3->next;
	}
	}
	head3->next=NULL;
return poly3;
}





