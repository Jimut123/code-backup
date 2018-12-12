
	/* Program to find whether a number is perfect or not */

#include<stdio.h>
#include<math.h>

main()
{
	int i,j,k,n,sum,product,digit[100];

	do
	{
  //      	clrscr();
	//	gotoxy(10,10);
		printf("Enter a number (<=1000) : ");
		scanf("%d",&n);
		if (n<1 || n>1000)
		{
//			gotoxy(10,25);
			printf("Out of data range .... please try again");
	//		getch();
		}
	}while(n<1 || n>1000);

//	clrscr();
//	gotoxy(10,5);


	i=0;

	printf("The factors of the number are .... ");

	for (j=1;j<n;j++)
	{
		if (n%j==0)
		{
			digit[i++]=j;
			printf("%d  ",digit[i-1]);
		}
	}

	sum=0;

	for(k=0;k<i;k++)
	{
		sum+=digit[k];
	}

	product=1;

	for(k=0;k<i;k++)
	{
		product*=digit[k];
	}

	if(sum==product)
		printf("\n\tThe number is a perfect number.");
	else
		printf("\n\tThe number is not a perfect number.");


//	getch();
}

