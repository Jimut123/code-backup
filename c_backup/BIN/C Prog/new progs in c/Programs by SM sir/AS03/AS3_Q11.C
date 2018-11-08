
	/* Assignment 3 .... Question 11 */
	/* Converting a decimal number to a Roman Numeral */

#include<stdio.h>
#include<math.h>

void main()
{
	int i,j,k,n,c=0,upper,row;
	clrscr();
	do
	{
		gotoxy(10,13);
		printf("Enter the Upper limit of the decimal system <=4000: ");
		scanf("%d",&upper);
		if(upper<1 || upper>4000)
		{
			gotoxy(10,25);
			printf("**Invalid data. Try again**");
			gotoxy(62,13);
			printf("       ");
		}
	}
	while(upper<1 || upper>4000);
	gotoxy(10,25);
	clrscr();
	gotoxy(1,1);
	printf("Dec_Num\tRoman_Numeral\n");
	printf("=======\t=============\n");
	row=4;
	for(i=1;i<=upper;i++)
	{
		n=i;
		gotoxy(1,row);
		printf("%5d\t",n);
		j=n/1000;
		for(k=1;k<=j;k++)
			printf("M");
		n=n % 1000;
		if(n>=900 && n<1000)
		{
			printf("CM");
			n=n % 900;
		}
		if(n>=500 && n<900)
		{
			printf("D");
			n=n % 500;
		}
		if(n>=400 && n<500)
		{
			printf("CD");
			n=n % 400;
		}
		j=n/100;
		for(k=1;k<=j;k++)
			printf("C");
		n=n % 100;
		if(n>=90 && n<100)
		{
			printf("XC");
			n=n % 90;
		}
		if(n>=50 && n<90)
		{
			printf("L");
			n=n % 50;
		}
		if(n>=40 && n<50)
		{
			printf("XL");
			n=n % 40;
		}
		j=n/10;
		for(k=1;k<=j;k++)
			printf("X");
		n=n % 10;
		if(n==9)
			printf("IX");
		if(n==8)
			printf("VIII");
		if(n==7)
			printf("VII");
		if(n==6)
			printf("VI");
		if(n==5)
			printf("V");
		if(n==4)
			printf("IV");
		if(n==3)
			printf("III");
		if(n==2)
			printf("II");
		if(n==1)
			printf("I");
		printf("\n");
		c=c+1;
		row++;
		if(c % 20==0)
		{
			gotoxy(20,25);
			printf("\a \a \a \a Press any key to continue...");
			getch();
			clrscr();
			gotoxy(1,1);
			printf("Dec_Num\tRoman_Numeral\n");
			printf("=======\t=============\n");
			row=4;
		}
	}
	printf("\n\nPress any key to come out...\n\n");
	while (! kbhit());
}
