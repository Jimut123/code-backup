/*
***0007***
Creation of Binary Tree. (Iterative function)
Inorder Traveersal of the Tree.
*/

#include<stdio.h>
#include<conio.h>

typedef struct binary
{
	int key;
	struct binary *left;
	struct binary *right;
}NODE;

NODE *root=NULL;

void main()
{
	void create(int);
	void display_pre(NODE *);
	void display_post();
	void display_in();
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
	display_pre(root);
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

void display_pre(NODE *x)
{
	printf("%d", x->key);
	if((x->left)!=NULL);
		display_pre(x->left);
	if((x->right)!=NULL);
		display_pre(x->right);

}
