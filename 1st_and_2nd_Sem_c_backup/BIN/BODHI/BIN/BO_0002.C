/*
***0002***
DOUBLY LINKED LIST
*/
#include<stdio.h>
#include<conio.h>
#define MAX 20

typedef struct list
{
	int key;
	struct list *left, *right;
}NODE;

NODE *head=NULL;

void main()
{
	printf("\nENTER");
	printf("\n	1 to Create the linked list");
	printf("\n	2 to Insert Node at First");
	printf("\n	3 to Insert Node in the Middle");
	printf("\n	4 to Insert Node at last");
	printf("\n	5 to Delete Node from the First");
	printf("\n	6 to Delete Node from the Middle");
	printf("\n	7 to Delete Node from the Last");
}