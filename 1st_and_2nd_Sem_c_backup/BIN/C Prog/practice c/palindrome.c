
#include<stdio.h>
int main()
{
	int i,k=0,n;
	scanf("%d",&n);
	i=n;
	while(n!=0)
	{
		k=n/10;
		k=k+i%10;
		i=n%10;
	}
	if(n==k)
		printf("palindrome");
	else
		printf("not palindrome");
	return 0;
}
