// determining the sum of digits
#include<stdio.h>
#include<math.h>
int main()
{
	int i,j,s=0,num;
	scanf("%d",&i);
	num=i;
	while(i!=0)
	{
		j=i%10;
		//printf("%d",j);
		i=i/10;
		s=s * 10 + j;
						
	}	
	if(num==s)
		printf("\n--------------------Palindrom---------------------");
	else
		printf("\nNot Palindrome");
	printf("\n%d",s);
	return 0;
}
