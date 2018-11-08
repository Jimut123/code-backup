/*
***0007***
Creation of Binary Tree. (RECURSIVE function)
Preorder, Postorder, Inorder Traveersal of the Tree.
*/

#include<stdio.h>
#include<conio.h>

typedef struct binary
{
	int key;
	struct binary *left;
	struct binary *right;
}NODE;

typedef struct list
{
	int value;
	struct list *next;
}SINGLY;


NODE *root=NULL;
NODE *in;

SINGLY *post;

int main()
{
	void create(int);
	void display_pre(NODE *);
	void display_post(NODE *);
	void display_in(NODE *);
	int cont=1,key;
	clrscr();
	while(cont==1)
	{
		printf("\nENTER THE 'KEY' TO BE INSERTED :: ");
		scanf("%d", &key);
		create(key);
		printf("\nTO INSERT MORE NODES PRESS 1 OR ANY OTHER KEY TO EXIT :: ");
		scanf("%d",&cont);
	}
	printf("\n PREORDER TRAVERSAL :: ");
	display_pre(root);
	printf("\nPOSTORDER TRAVERSAL :: ");
	display_post(root);
	printf("\n  INORDER TRAVERSAL :: ");
	display_in(root);
	getch();
	return;
}

void create(int k)
{
	NODE *x=(NODE*)malloc(sizeof(NODE)),*r1=root,*r2; int ch;
	x->key=k;
	x->left=x->right=NULL;
	if(!root)
	{
		root=x;
		return;
	}
	while(r1)
	{
		r2=r1;
		printf("%d will be placed at (LEFT or RIGHT) of %d (1/0) :: ",k,r1->key);
		scanf("%d",&ch);
		if(ch)
			r1=r1->left;
		else
			r1=r1->right;
	}
	if(ch)
		r2->left=x;
	else
		r2->right=x;
}
/*
void inorder()
{
	void push();
	NODE *pop();
	NODE *r=root;
	int top=-1;
	do
	{
		top=-1;
		while(r)
		{
			push(r);
			top++;
			r=r->left;
		}
		r=pop();
		printf("%d\t", r->key);
		r=r->right;
	}while(r||top!=-1);
}

void push(NODE *r)
{
	NODE *x=in;
	while(x->right)
		x=x->right;
	x->right=r;
	r->right=NULL;

}

NODE *pop()
{

}
*/

void display_pre(NODE *x)
{
	if(x!=NULL)
	{
		printf("%d", x->key);
		display_pre(x->left);
		display_pre(x->right);
	}
}

void display_post(NODE *x)
{
	if(x!=NULL)
	{
		display_post(x->left);
		display_post(x->right);
		printf("%d",x->key);
	}

}

void display_in(NODE *x)
{
	if(x!=NULL)
	{
		display_in(x->left);
		printf("%d",x->key);
		display_in(x->right);
	}
}