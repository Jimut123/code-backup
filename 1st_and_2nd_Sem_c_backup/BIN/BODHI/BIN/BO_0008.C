/*
***0008***
Binary Search Tree
*/

#include<stdio.h>
#include<conio.h>
#include<string.h>

typedef struct binary
{
	struct binary *left;
	int key;
	struct binary *right;
}BST;

BST *root=NULL;

void main()
{
	void create(int[],int);
	void display_in();
	int a[100],i=0,n;
	clrscr();
	printf("ENTER THE TOTAL NUMBER OF NODES AVAIABLE :: ");
	scanf("%d", &n);
	printf("\nENTER THE PREORDER TRAVERSAL OF B.S.T. :: ");
	while(i<n)
	{
		printf("%d Preorder pos %d :: ",i);
		scanf("%d",&a[i++]);
	}
	create(a,0);
	printf("\nTHE INORDER TRAVERSAL OF THE B.S.T. :: ");
	display_in()
}

void create(int a[],int i)
{
	BST *x=(BST*)malloc(sizeof(BST)),*r1=root,*r2;
	x->key=a[i];
	x->left=x->right=NULL;
	if(root==NULL)
	{
		root=x;
		return;
	}
	while(r1!=NULL)
	{
		r2=r1;
		r1=(a[i]<(r1->key))?r1->left:r1->right;
	}
	if(a[i]<r2->key)
		r2->left=x;
	else
		r2->right=x;

}

void display_in()
{

}