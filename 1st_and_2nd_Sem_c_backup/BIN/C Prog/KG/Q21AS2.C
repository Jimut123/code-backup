	/*Q21as1.c : Write a program to display all prime numbers
	<=n where n>=2 and n<=2000 */
	#include<stdio.h>
	int is_prime(int);
	void main()
	{
	int i,n,count,m;
	char ch;
	do
	{
	clrscr();
		while(1)
		{
		printf("\nEnter n(2-2000) :");
		scanf("%d",&n);
			if(n<1 || n>2000)
			printf("\nInvalid number.\n");
			else
			break;
		}
	count=0;
	printf("\nPrime numbers <=%d===>\n",n);
	for(i=2;i<=n;i++)
	{
	m=is_prime(i);
		if(m==1)
		{
		count++;
		printf("%4d ",i);
		}
	}
	printf("\nTotal prime numbers found :%d\n",count);
	printf("\nDo you want to continue(Y/N?) :");
	ch=getch();
	}while(ch=='y' || ch=='Y');
	}

	int is_prime(int n)
	{
	int i,n1,r,flag;
	flag=1;
	n1=n/2;
	for(i=2;i<=n1;i++)
	{
	r=n%i;
		if(r==0)
		{
		flag=0;
		break;
		}
	}
	return flag;
	}



