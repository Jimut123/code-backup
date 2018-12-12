#include<stdio.h>
#define max 25
int top=-1;

typedef struct binary
{
	int key;
	struct binary *left, *right;
}node;
node *root=NULL, *a[max];

void push(node *r)
{
	if(top<max-1)
	a[++top]=r;
}

node* pop()
{
	if(top>=0)
	return a[top--];
}

void create(int k)
{
	node*x=(node*)malloc(sizeof(node)), *r1=root, *r2;
	int ch;
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
		printf("\n %d is to be placed in the left or right of %d \t enter 1 / 0 ? ",k,r1->key);
		scanf("%d",&ch);
		r1=ch?r1->left:r1->right;
	}
	if(ch)
	r2->left=x;
	else
	r2->right=x;
}

void inorder()
{
	node*x=root;
	do
	{
		while(x)
		{
			push(x);
			x=x->left;
		}
		x=pop();
		printf("\t %d",x->key);
		x=x->right;
	}while(x||top!=-1);
}

void preorder()
{
	node*x=root;
	do
	{
		while(x)
		{
			printf("\t %d",x->key);
			push(x);
			x=x->left;
		}
		x=pop()->right;
	}while(x||top!=-1);
}

/*void postorder()
{
	node*x=root;
	int f=1;
	do
	{
			while(x)
			{
				push(x);
				if(x->right)
				push(-x->right);
				x=x->left;
			}
			x=pop();
			f=0;
			while(x && !f)
			{
				if(x>0)
				{
					printf("\t %d",x->key);
					x=pop();
				}
				else
				{
					x=-x;
					f=1;
				}
			}
			if(!x)
				f=0;
	}while(f);
} */

void rec_inorder(node*r)
{
	if(r)
	{
		rec_inorder(r->left);
		printf("\t %d",r->key);
		rec_inorder(r->right);
	}
}

void rec_preorder(node*r)
{
	if(r)
	{
		printf("\t %d",r->key);
		rec_preorder(r->left);
		rec_preorder(r->right);
	}
}

void rec_postorder(node *r)
{
	if(r)
	{
		rec_postorder(r->left);
		rec_postorder(r->right);
		printf("\t %d",r->key);
	}
}

int rec_total(node *r)
{
	if(!r)
	return 0;
	return 1+rec_total(r->left)+rec_total(r->right);
}

int rec_leaf(node *r)
{
	if(!r)
	return 0;
	if(!r->left&&!r->right)
	return 1;
	return rec_leaf(r->left)+rec_leaf(r->right);
}

void int_ext()
{
	node*r=root;
	int ci=0,ce=0;
	do
	{
		while(r)
		{
			push(r);
			r=r->left;
		}
		r=pop();
		if(r==root)
		ce++;
		else if(!r->left&&!r->right)
		ce++;
		else
		ci++;
		r=r->right;
	}while(r||top!=-1);
	printf("\n Internal node=%d \t External node=%d",ci,ce);
}

main()
{
	int ch,n,x=7;
	clrscr();
	while(x)
	{
		printf("\n 1-create\t 2-inorder \t 3-preorder \t 4-postorder \t 5-recursive inorder \t 6-recursive preorder \t 7-recursine postorder \t 8-recursive total \t 9-recursive leaf \t 10-internal external \t 0-exit\n Enter choice: ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1: printf("\n Enter number: ");
				scanf("%d",&n);
				create(n);
				break;
			case 2: printf("\n Inorder travarsal: ");
				inorder();
				break;
			case 3: printf("\n Preorder travarsal: ");
				preorder();
				break;
	 /*	        case 4: printf("\n Postorder travarsal: ");
				postorder();
				break;  */
			case 5: printf("\n Recursive inorder travarsal: ");
				rec_inorder(root);
				break;
			case 6: printf("\n Recursive preorder travarsal: ");
				rec_preorder(root);
				break;
			case 7: printf("\n Recursive postorder travarsal:");
				rec_postorder(root);
				break;
			case 8: n=rec_total(root);
				printf("\n Total number of nodes: %d",n);
				break;
			case 9: n=rec_leaf(root);
				printf("\n Number of leaf nodes: %d",n);
				break;
			case 10:int_ext();
				break;
			default:x=0;
		}
	}
	getch();
	return 0;
}