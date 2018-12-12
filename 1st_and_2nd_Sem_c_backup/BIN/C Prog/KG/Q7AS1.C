	/*q7as1.c : Write aprogram to calculate hcf of 3 numbers */
	#include<stdio.h>
	int hcf(int,int);
	void main()
	{
	int a,b,c,h;
	char ch;
	do
	{
	clrscr();
		while(1)
		{
		printf("\nEnter 1st number :");
		scanf("%d",&a);
		printf("Enter 2nd number :");
		scanf("%d",&b);
		printf("Enter 3rd number :");
		scanf("%d",&c);
			if(a<1 || a>30000 || b<1 || b>30000 || c<1 ||
			c>30000)
			printf("\nInvalid data\n");
			else
			break;
		}
	h=hcf(a,b);
	h=hcf(c,h);
	printf("\nHCF of %d,%d,%d=%d\n",a,b,c,h);
	printf("\nDo you want to continue(Y/N?) :");
	ch=getch();
	}while(ch=='y' || ch=='Y');
	}

	int hcf(int a,int b)
	{
	int h;
	while((h=a%b)!=0)
	{
	a=b;
	b=h;
	}
	return b;
	}


