#include<stdio.h>
int main()
{
	int n,temp,reverse=0;
	scanf("%d",&n);
	temp=n;
	while(temp!=0)
	{
		reverse=reverse*10;
		reverse=reverse+temp%10;
		temp=temp/10;
	}
	if(reverse==n)
		printf("palindrome");
	else
		printf("not palindrome");
	return 0;
}
