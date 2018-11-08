/*
***0010***
Input 2 polynmials and add them up
*/

#include<stdio.h>
#include<conio.h>
#include<math.h>
#define MAX 100

struct poly
{
	int coeff,exp;
	struct poly *next;
};

typedef struct poly node;
node *tail;

int main()
{
	node *p,*q,*r;
	node *add(node*,node*);
	node *input();
	void listini();
	void output(node*);
	void value(node*);

	clrscr();

	printf("\nTHE 1st POLYNOMIAL : ");
	p=input();
	printf("\nTHE 2nd POLYNOMIAL : ");
	q=input();
	r=add(p,q);
	printf("\nThe 1st polynomial   : ");
	output(p);
	printf("\nThe 2nd polynomial   : ");
	output(q);
	printf("\nThe added polynomial : ");
	output(r);
	value(r);
	getch();
	return;
}

void listini()
{
	tail=(node*)malloc(sizeof(node));
}

node *insert(node *t,int c,int e)
{
	t->next=(node*)malloc(sizeof(node));
	t=t->next;
	t->coeff=c; t->exp=e;
	return t;
}

node *input()
{
	node *s;
	int coe,ex,lastexp;
	printf("\n Enter coeff and exp of the polunomial");
	printf("\n Exponexts should be entered in descending order");
	printf("\n Enter 0 for coff and exp to terminate.");
	lastexp=MAX;
	s=tail;
	for(;;)
	{
		printf("\n Enter coefficient :: ");
		scanf("%d", &coe);
		if(coe==0)
			break;
		printf(" Enter expoent     :: ");
		scanf("%d", &ex);
		if(ex>lastexp||ex<0)
			break;
		s=insert(s,coe,ex);
		if(ex==0)
			break;
		lastexp=ex;
	}
	s->next=tail; s=tail->next;
	tail->next=NULL;
	return s;
}

node *add(node *p, node *q)
{
	node *r;
	int sum;
	r=tail;
	while((p!=tail)&&(q!=tail))
	{
		if(p->exp==q->exp)
		{
			sum=p->coeff+q->coeff;
			if(sum!=0)
				r=insert(r,sum,p->exp);
			p=p->next;
			q=q->next;
		}
		else if(p->exp>q->exp)
		{
			r=insert(r,p->coeff,p->exp);
			p=p->next;
		}
		else if(p->exp<q->exp)
		{
			r=insert(r,q->coeff,q->exp);
			q=q->next;
		}
	}
	for(;p!=tail;p=p->next)
		r=insert(r,p->coeff,p->exp);
	for(;q!=tail;q=q->next)
		r=insert(r,q->coeff,q->exp);
	r->next=tail;
	r=tail->next;
	tail->next=NULL;
	return r;
}

void output(node *r)
{
	while(r!=tail)
	{
		printf(" %dx^%d ",r->coeff,r->exp);
		r=r->next;
		if(r!=tail)
			printf("+");
	}
}

void value(node *r)
{
	long x, sum=0;
	printf("\nEnter the value of 'x' :: ");
	scanf("%d", &x);
	while(r!=tail)
	{
		sum+=r->coeff*pow(x,r->exp);
		r=r->next;
	}
	printf("\nFor x=%d the value is : %ld ",x,sum);
}