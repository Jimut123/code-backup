// determining the sum of digits
#include<stdio.h>
int main()
{
	int a,b,i,j,s,num;
	scanf("%d %d",&a,&b);
	
	for(i=a;i<=b;i++)
	{
	num=i;
	s=0;
	
	while(num!=0)
	{
		j=num%10;
		num=num/10;
		s=s*10 + j;
	}	
	if(i==s)							// if(!(i==s))----for not palindrom----if(i!=s)
		printf("%d  ",i);
	}
	return 0;
}
