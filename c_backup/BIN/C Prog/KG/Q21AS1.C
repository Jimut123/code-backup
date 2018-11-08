	/*q21as1.c : Write a program to display all prime numbers
	<=n where n>=2 and n<=2000 */
	#include<stdio.h>
	int is_prime(int); /*  this is called function prototype */
	//void main()
	int main()
	{
	int n,m,count,i;
	char ch;
	do
	{
	//clrscr();
		while(1)
		{
		printf("\n\nEnter n(2-2000) :");
		scanf("%d",&n);
			if(n<2 || n>2000)
			printf("\n***Invalid data. Try agaian.***\n");
			else
			break;
		}
	count=0;
	//clrscr();
	printf("\nPrime numbers <=%d--->\n",n);
		for(i=2;i<=n;i=i+1)
		{
		m=is_prime(i);
			if(m!=0)
			{
			count=count+1;
			printf("%4d ",i);
			}
		}
	printf("\n\nTotal prime numbers=%d\n",count);
//	printf("\nDo you want to continue(Y/N?) :");
//	ch=getch();
	}while(ch=='y' || ch=='Y');
	}

	int is_prime(int n)
	{
	int i,r,n1;
	int flag;
	n1=n/2;
	flag=1;
	for(i=2;i<=n1;i=i+1)
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
