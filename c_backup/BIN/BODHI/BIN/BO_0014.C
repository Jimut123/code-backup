/*
***0014***
Heap Creation
*/

#include<stdio.h>
#include<conio.h>
#include<math.h>

int a[1000];

void main()
{
	void input(int);
	void heap_adjust();
	void display();
	int height,n;

	clrscr();

	printf("\nENTER THE HEIGHT OF HEAP :: ");
	scanf("%d",&height);
	n=pow(2,height+1)-1;
	input(n);
	printf("\nTHE ENTERED LIST ::\n");
	display(n);
	heap_adjust(n);
	printf("\nTHE HEAP ::\n");
	display(n);
	getch();
	return;
}

void input(int n)
{
	int i,val;
	printf("\nINPUTS :: ");
	for(i=0;i<n;i++)
	{
		printf("\nEnter element no. %d :: ",(i+1));
		scanf("%d",&val);
		a[i]=val;
	}
}

void heap_adjust(int n)
{
	int i,e,c,p;
	for(i=1;i<n;i++)
	{
		e=a[i];
		c=i;
		p=(c-1)/2;
		while(c>p && e>a[p])
		{
			a[c]=a[p];
			c=p;
			p=(c-1)/2;
		}
		a[c]=e;
	}

}

void display(int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d ",a[i]);
}