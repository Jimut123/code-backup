#include<stdio.h>
typedef struct binary
{
	int key;
	struct binary *left,*right;
}node;
node *root=NULL,*a[50];
int top=-1;

void push(node*r)
{
	if(top==49)
		return;
	a[++top]=r;
}

node* pop()
{
	if(top==-1)
		return NULL;
	return a[top--];
}

void create(int k)
{
	node*x=(node*)malloc(sizeof(node)),*r1=root,*r2;
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
		r1=k<r1->key?r1->left:r1->right;
	}
	if(k<r2->key)
		r2->left=x;
	else
		r2->right=x;
}

int search(int k)
{
	node*r=root;
	while(r)
	{
		if(k==r->key)
			return 1;
		else if(k<r->key)
			r=r->left;
		else
			r=r->right;
	}
	return 0;
}

void min_max()
{
	node *r=root;
	while(r->left)
		r=r->left;
	printf("Minimum= %d",r->key);
	r=root;
	while(r->right)
		r=r->right;
	printf("Maximum= %d",r->key);
}

void inorder()
{
	node*r=root;
	do
	{
		while(r)
		{
			push(r);
			r=r->left;
		}
		r=pop();
		printf("%d \t",r->key);
		r=r->right;
	}while(r||top!=-1);
}

void rec_in(node *r)
{
	if(r)
	{
		rec_in(r->left);
		printf("\t %d",r->key);
		rec_in(r->right);
	}
}

void preorder()
{
	node*r=root;
	do
	{
		while(r)
		{
			printf("%d \t",r->key);
			push(r);
			r=r->left;
		}
		r=pop()->right;
	}while(r||top!=-1);
}

void deleteNode(int k)
{
	node *p,*parent,*y;
	void findparent(int,node**,node**);
	if(root->key==k)
	{
		if(!root->left&&!root->right)
		{
			p=root;
			free(p);
			p=NULL;
			return;
		}
		else if(root->left&&!root->right)
		{
			p=root;
			root=root->left;
			free(p);
			return;
		}
		else if(!root->left&&root->right)
		{
			p=root;
			root=root->right;
			free(p);
			return;
		}
	}
	findparent(k,&p,&parent);
	if(p->left&&p->right)
	{
		y=p->right;
		while(y->left)
		{
			parent=y;
			y=y->left;
		}
		p->key=y->key;
		p=y;
	}
	else if(p->left&&!p->right)
	{
		if(parent->left==p)
			parent->left=p->left;
		else
			parent->right=p->left;
		free(p);
	}
	else if(!p->left&&p->right)
	{
		if(parent->left==p)
			parent->left=p->right;
		else
			parent->right=p->right;
		free(p);
	}
	else
	{
		if(parent->left==p)
			parent->left=NULL;
		else
			parent->right=NULL;
		free(p);
	}
}

void findparent(int  k,node **x,node **y)
{
	node*r=root;
	while(r)
	{
		if(r->key==k)
		{
			*x=r;
			return;
		}
		*y=r;
		r=k<r->key?r->left:r->right;
	}
}

main()
{
	int n,ch,z=1;
	clrscr();
	while(z)
	{
	printf("\n 1-create \t2-search \t3-min_max \t4-inorder \t5-preorder \t6-delete \t0-exit \nEnter your choice: ");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1: printf("\n Enter number: ");
			scanf("%d",&n);
			create(n);
			break;
		case 2: printf("\n Enter number: ");
			scanf("%d",&n);
			if(search(n))
			printf("\n Element found");
			else
			printf("\n Element not found");
			break;
		case 3: min_max();
			break;
		case 4: rec_in(root);
			break;
		case 5: preorder();
			break;
		case 6: printf("\n Enter number to delete: ");
			scanf("%d",&n);
			deleteNode(n);
			break;
		default:z=0;
	}
	}
	getch();
	return 0;
}