#include<stdio.h>
#define NUMNODES 500

struct nodetype
{
	int info;
	int used;
}
node[NUMNODES];

void maketree(int);
void setleft(int, int);
void setright(int,int);

int main()
{
	int p,q,number;
	
	scanf("%d", &number);
	maketree(number);
	while(scanf("%d", &number)!=EOF)
	{
		p=q=0;
		while(q<NUMNODES && node[q].used && number != node[p].info){
			p=q;
			if(number<node[p].info)
				q=2*p+1;
			else
				q=2*p+2;
		}
		/* If the number is in the tree, it is duplicate */
		if(number == node[p].info)
			printf("%d is a duplicate\n", number);
		else if(number < node[p].info)
			setleft(p, number);
		else
			setright(p, number);
	}	
	return 0;
}

void maketree(int x)
{
	int p;
	node[0].info = x;
	node[0].used = 1;
	for(p=1;p<NUMNODES;p++)
		node[p].used = 0;
}

void setleft(int p, int x)
{
	int q;
	q = 2*p+1;
	if(q>= NUMNODES)
		printf("Array Overflow!");
	else if (node[q].used)
		printf("Invalid insertion!");
	else
	{
		node[q].info = x;
		node[q].used = 1;
	}
}
void setright(int p, int x)
{
	int q;
	q = 2*p+2;
	if(q>=NUMNODES)
		printf("Array overflow!");
	else if(node[q].used)
		printf("Invalid Insertion");
	else
	{
		node[q].info = x;
		node[q].used = 1;
	}
}

