
	/* Assignment 3 .... Question 10 */
	/* Converting a decimal number to ....

		1. A Binary number
		2. A Hexadecimal number
		3. A number of any base		*/

#include<stdio.h>
#include<math.h>

void bin();
void hex();
void anybase();

void main()
{
	char ch;
	clrscr();
	printf("\nEnter B for Binary,H for Hexadecimal,A for Any base : ");
	scanf(" %c",&ch);
	fflush(stdin);
		if (ch=='B' || ch=='b')
			bin();
		else if (ch=='H' || ch=='h')
			hex();
		else if (ch=='A' || ch=='a')
			anybase();
		else
			printf("\nYou are an irresponsible person\n");
	printf("\n\nPlease press any key to exit...\n\n");
	while (! kbhit());
}

	void bin()
	{
		int n,i,r[16],temp;
		for(i=0;i<=15;i++)
			r[i]=0;
		printf("\nSo, you want Decimal to Binary conversion.\n");
		printf("\nPlease enter a Decimal number : ");
		scanf("%d",&n);
		for(i=15;n!=0;i--)
			temp=n%2,r[i]=48+temp,n/=2;
		printf("\nThe binary eqivalent is : ");
		for(i=0;i<=15;i++)
			printf("%c",r[i]);
	}

	void hex()
	{
		int n,i,r[16],temp;
		for(i=0;i<=15;i++)
			r[i]=0;
		printf("\nSo, you want Decimal to Hexadecimal conversion.\n");
		printf("\nPlease enter a decimal number : ");
		scanf("%d",&n);
		for(i=15;n!=0;i--)
		{
			temp=n%16;
			if (temp<=9)
			{
				r[i]=48+temp;
				n/=16;
			}
			else
			{
				r[i]=55+temp;
				n/=16;
			}
		}   	/* End of For loop */

		printf("\nThe Hexadecimal equivalent is : ");
		for (i=0;i<=15;i++)
			printf("%c",r[i]);
	}

	void anybase()
	{
		int n,i,r[16],temp,b;
		for(i=0;i<=15;i++)
			r[i]=0;
		printf("\nSo, you want Decimal to Any base conversion.\n");
		printf("\nPlease enter a Decimal number : ");
		scanf("%d",&n);
		printf("\nPlease enter the base you want : ");
		scanf("%d",&b);

		for(i=15;n!=0;i--)
		{
			temp=n%b;
			if (temp<=9)
			{
				r[i]=48+temp;
				n/=b;
			}
			else
			{
				r[i]=55+temp;
				n/=b;
			}
		}   	/* End of For loop */

		printf("\nThe base %d equivalent is : ",b);
		for(i=0;i<=15;i++)
			printf("%c",r[i]);
	}
