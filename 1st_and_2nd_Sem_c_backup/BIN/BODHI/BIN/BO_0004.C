/*
***0004***
Infix to postfix.
*/
#include<stdio.h>

char post[20], st_con[20];
int in_p=-1, post_p=-1, st_con_p=-1;

void main()
{
	char in[20];
	void to_post(char[]);
	void display();

	clrscr();

	printf("\nENTER THE INFIX EXPRESSION : ");
	scanf("%[^\n]",in);
	to_post(in);
	display();
	getch();
}

void to_post(char in[])
{
	int i=0; char scan;
	void stacks(char);
	while(in[i]!='\0'||i<20)
	{
		scan=in[i];
		if( ((int)scan>=65&&(int)scan<=90) || ((int)scan>=97&&(int)scan<=122) )
		{
			post[++post_p]=scan;

		}
		if(scan=='+'||scan=='-'||scan=='*'||scan=='/')
		{
			stacks(scan);
		}
		i++;
	}
	while(st_con_p>-1)
	{
		post_p++;
		post[post_p]=st_con[st_con_p--];
	}
	post[++post_p]='\0';
}

void stacks(char scan)
{
	char pop;
	if( ( (st_con[st_con_p]=='+'||st_con[st_con_p]=='-')&&(scan=='*'||scan=='/') ) || st_con_p==-1 )
	{
		st_con_p++;
	}
	else
	{
		pop=st_con[st_con_p];
		post_p++;
		post[post_p]=pop;

	}
	st_con[st_con_p]=scan;
}

void display()
{
	int i=0;
	printf("\nTHE POSTFIX EXPRESSION : ");
	while(post[i]!='\0')
		printf("%c", post[i++]);
}