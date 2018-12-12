/*0001
POSTFIX EVALUATION
*/

#include<stdio.h>
#define MAX 20
int top=-1;
void push(int a[], int k)
{
	top++;
	if(top==MAX)
	{
		printf("\n***STACK FULL***");
	}
	a[top]=k;
}

int pop(int a[])
{
	int k;
	if(top==-1)
	{
		printf("\n***STACK EMPTY***");
		return -1;
	}
	k=a[top--];
	return k;
}

int main()
{
	char exp[MAX];
	clrscr();
	printf("\n Input the postfix expression : ");
	scanf("%[^\n]",exp);
	printf("%d",eval(exp));
	getch();
	return;
}

int isdigit1(char sym)
{
	if((sym>='0')&&(sym<='9'))
		return 1;
	else
		return 0;
}

int oper(int sym, int op1, int op2)
{
	switch(sym)
	{
		case '+' : return(op1+op2);
		case '-' : return(op1-op2);
		case '*' : return(op1*op2);
		case '/' : return(op1/op2);
	}
	return -1;
}

int eval(char exp[])
{
	int op1,op2,val,i,j, a[20];
	char c;
	for(i=0;exp[i]!='\0';i++)
	{
		if(c== ' ')
			continue;
		if(isdigit1(c)==1)
			push(a,c-'0');
		else
		{
			op2=pop(a);
			op1=pop(a);
			val=oper(c,op1,op2);
			push(a,val);
		}
	}
	j=pop(a);
	return j;
}

