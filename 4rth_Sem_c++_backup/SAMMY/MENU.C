#include<stdio.h>
void main()
{
	long int n,i,j,c,s;
	clrscr();
	printf ("\n Enter 1 for prime factors of a given number");
	printf("\n Enter 2 to check whether a given year is leap year or not");
	printf("\n Enter 3 to find the sum of digits of a given number");
	printf("\n Enter 4 for printing a given number in reverse order \n");
	scanf("%ld",&c);
	printf("\n %ld ",c);
	switch(c)
	{
		case 1:	printf("\n enter a number: ");
			scanf("%ld", &n);
			printf("\n The prime factors of %d are: ",n);
			for(i=1;i<=n;i++)
			{
				s=0;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
						s=1;
				}
				if(n%i==0 && s==0)
					printf("\n %ld",i);
			}
			break;
		case 2:	printf("\n Enter a year");
			scanf("%ld",&n);
			if(n%4==0 && n%100!=0 || n%400==0)
				printf("\n Lear year");
			else
				printf("\n Not a leap year");
			break;
		case 3:	printf("\n Enter a number");
			scanf("%ld", &n);
			s=0;
			while(n>0)
			{
				s+=n%10;
				n/=10;
			}
			printf("\n Sum of all digits= %ld",s);
			break;
		case 4:	printf("\n Enter a number");
			scanf("%ld",&n);
			printf("\n The reverse of %ld is: ",n);
			while(n>0)
			{
				printf("%ld",n%10);
				n/=10;
			}
			break;
		default:printf("\n Invalid choice");
	}
	getch();
}
