#include<stdio.h>
char a[1000],stack[10];
int L,R,co=0,l=0;
void push1();
void pop1();
int main()
{
	int i,j,m;
	char c;
	scanf("%d",&R);
	for(i=0;i<R;i++)
	{
	scanf("%d",&L);
	for(j=0;j<L;j++)
	{
	scanf(" %c",&c);
	a[l++]=c;
	}
	a[l++]='*';
	}
	a[l++]='\0';
	m=0;
	for(i=0;i<R;i++)
	{
	for(j=0;a[m]!='*';j++)
	{
	if(a[m]=='H'&&co==0)
	push1();
	
	if(a[m]=='T')
	pop1();
	
	 m++;
	 
	}
	
	if(co==0)
	printf("Valid\n");
	else
	printf("Invalid\n");
	m++;
	co=0;
	}
	return 0;
}
void push1()
{
	co++;
}
void pop1()
{
	co--;
}

