/*0003
INFIX TO POSTFIX
*/

#include<stdio.h>
#define MAX 20

char in[MAX]; int in_p=-1;
char stack_content[MAX]; int st_p=-1;
char postfix_form[MAX]; int post_p=-1;

void push(char a[],int pos,char k)
{
	++pos;
	if(pos==MAX)
	{
		printf("\n***STACK FULL***");
		return;
	}
	a[pos]=k;
}

void main()
{
	clrscr();
	printf("\nENTER THE INFIX EXPRESSION : ");
	scanf("%[^\n]",in);
	convert(in);
}

void convert(char in[])
{
	char scan;
	int i=0;
	while(in[i]!='\0')
	{
		scan=a[i];
		if(isdigit(scan)==1)
			push(postfix_form,
	}
}
