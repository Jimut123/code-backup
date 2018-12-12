#include <stdio.h>
void main()
{
	char c;
	int a,b;
	clrscr();
	printf("\n Enter an operator: ");
	scanf("%c",&c);
	printf("Enter two numbers: ");
	scanf("%d%d",&a,&b);
	switch(c)
	{
		case '+': printf("\n %d",a+b);
			break;
		case '-': printf("\n %d",a-b);
			break;
		case '*': printf("\n &d",a*b);
			break;
		case '/': printf("\n %d",a/b);
			break;
		case '%': printf("\n %d",a%b);
			break;
		default: printf("\n Invalid operation");
	}
	getch();
}
