	/*q6as1.c : Write a program to display Floyd's Triangle*/
	#include<stdio.h>
	#include<conio.h>
	
	void floyd(int n)
	{
	int i,j,c;
	c=1;
	for(i=1;i<n;i++)
	{
		for(j=1;j<=i;j++)
		printf("%4d",c++);
	printf("\n");
	}
	}
	
	
	main()
	{
	int n;
	char ch;
	do
	{
		while(1)
		{
		printf("\nEnter number of lines to be displayed(1-20) :");
		scanf("%d",&n);
			if(n<1 || n>20)
			printf("\nInvalid data\n");
			else
			break;
		}
	printf("\nFloyd Triangle====>\n");
	floyd(n);
	printf("\nDo you want to continue(Y/N?) :");
	ch=getch();
	}while(ch=='y' || ch=='Y');
	}


