
	/* Assignment 3 .... Question 12 */
	/* Converting a number to Words */

#include<stdio.h>
#include<math.h>

void main()
{
	int n,n1,flag=0,f=0;

	static char arr1[20][20]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
	static char arr2[10][10]={"TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
	clrscr();

	printf("\nEnter any number within 32767 : ");
	scanf("%d",&n);
	printf("\n");

	if (n<0 || n>=32767)
		flag=1;

	else	{

	if (n==0)
		printf("Number in Words is : %s ",arr1[n]);
	else	{
			printf("Number in Words is : ");
			if (n/1000)
			{
				n1=n;
				n1=n1/1000;
				f=1;
				if (n1>19)
				{
					printf("%s ",arr2[(n1/10)-2]);
					n1=n1%10;
					if (n1==0) printf("THOUSAND");
					if (n1)
						printf("%s THOUSAND ",arr1[n1]);
				}
				else
				{
					if (n1)
						printf("%s THOUSAND ",arr1[n1]);
				}
				n=n%1000;
			}
			if (n/100)
			{
				printf("%s HUNDRED ",arr1[n/100]);
				n=n%100;
				f=1;
			}
			if (n>19)
			{
			    if (f==1)
				printf("AND");
				printf(" %s ",arr2[(n/10)-2]);
				n=n%10;
				if (n)
					printf("%s ",arr1[n]);
			}
			else
			{
				if (f==1)
					printf(" AND");
				if (n)
					printf(" %s ",arr1[n]);
			}
		}
	}

	if (flag==1)
		printf("Wrong input given ...");

	printf("\n\nPress any key to continue...\n\n");
	while (! kbhit());
}
