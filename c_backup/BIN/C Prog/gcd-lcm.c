#include<stdio.h>
int main()
{
	int t,x,y,a,b,gcd,lcm;
	printf("\n Enter two numbers: ",x,y);
	scanf("%d %d", &x,&y);
	
	a=x;
	b=y;
	while(b!=0)
	{
		t=b;
		b=a%b;
		a=t;
	}
	gcd=a;
	lcm=(x*y)/gcd;
	
	printf(" GCD of the two numbers %d and %d is %d\n",x,y,gcd);
	printf(" LCM of the two numbers %d and %d is %d\n",x,y,lcm);
//	getch();
	return 0;
}
