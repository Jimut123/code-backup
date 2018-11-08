#include<stdio.h>
#include<math.h>
int main()
{
	int i,n,t,sum=0,countnum=0;
//	char s[10];
//	printf("\nEnter the number: ");
//	scanf("%s",s);
/*	for(i=0;i<strlen(s);i++)
	{
		countnum++;
	}
	printf("\nNumber of digits: %d\n",countnum);*/
/*	printf("\nNumber of digits: %d",strlen(s));*/
	
/*	for(i=0;i<strlen(s);i++)
	{
		//	t=pow(s[i],2);
			sum=sum+s[i]*s[i];
	}
	printf("\nPrint the sum of squares of digits: %d\n",sum);
	return 0;*/
	printf("\nEnter number: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+i*i;
	}
	printf("\nRequired sum: %d",sum);
	return 0;
}
